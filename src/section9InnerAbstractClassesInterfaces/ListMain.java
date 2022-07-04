package section9InnerAbstractClassesInterfaces;

public class ListMain {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        tree.addItem(new Node("Darwin"));
        tree.traverse(tree.getRoot());

        tree.addItem(new Node("Brisbane"));
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Adelaide Canberra Sydney Melbourne";
        String[] data = stringData.split(" ");
        for (int i = 0; i < data.length; i++) {
            String string = data[i];
            tree.addItem(new Node(string));
        }
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Brisbane"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Melbourne"));
        tree.traverse(tree.getRoot());
    }
}

// the '.split' method returns an array of Strings by separating a String each time a certain regex is present
