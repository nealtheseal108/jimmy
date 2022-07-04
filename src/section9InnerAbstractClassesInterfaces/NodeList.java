package section9InnerAbstractClassesInterfaces;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem newListItem);
    boolean removeItem(ListItem newListItem);
    void traverse(ListItem root);
}
