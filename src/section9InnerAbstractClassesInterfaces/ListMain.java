package section9InnerAbstractClassesInterfaces;

public class ListMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.addItem(new Node("Darwin"));
        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.addItem(new Node("Brisbane"));
        myLinkedList.traverse(myLinkedList.getRoot());

        String stringData = "Darwin Brisbane Perth Adelaide Canberra Sydney Melbourne";
        String[] data = stringData.split(" ");
        for (int i = 0; i < data.length; i++) {
            String string = data[i];
            myLinkedList.addItem(new Node(string));
        }
        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem(new Node("Brisbane"));
        myLinkedList.traverse(myLinkedList.getRoot());

        myLinkedList.removeItem(new Node("Melbourne"));
        myLinkedList.traverse(myLinkedList.getRoot());
    }
}

// the '.split' method returns an array of Strings by separating a String each time a certain regex is present
