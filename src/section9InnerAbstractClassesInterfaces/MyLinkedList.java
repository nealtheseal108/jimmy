package section9InnerAbstractClassesInterfaces;

public class MyLinkedList implements NodeList {
    private ListItem root;
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (newItem != null) {
            if (this.root == null) {
                // The list was empty, so this item becomes the head of the list
                this.root = newItem;
                return true;
            }

            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = (currentItem.compareTo(newItem));
                if (comparison < 0) {
                    // newItem is greater, move right if possible
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        // there is no next, so insert at end of list
                        currentItem.setNext(newItem).setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    // newItem is less, insert before
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                        newItem.setNext(currentItem).setPrevious(newItem);
                    } else {
                        // the node with a previous is the root
                        newItem.setNext(this.root).setPrevious(newItem);
                        this.root = newItem;
                    }
                    return true;
                } else {
                    // equal
                    System.out.println(newItem.getValue() + " is already present, not added.");
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty, bakalakadingesh.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    if (currentItem == this.root) {
                        this.root = currentItem.next();
                        System.out.println("Deleting " + item.getValue() +" from your list.");
                        return true;
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    System.out.println("Deleting " + item.getValue() +" from your list.");
                    return true;
                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
