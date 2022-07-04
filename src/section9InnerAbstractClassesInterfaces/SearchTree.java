package section9InnerAbstractClassesInterfaces;

public class SearchTree implements NodeList {
    private ListItem root = null;
    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem newListItem) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem newListItem) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
