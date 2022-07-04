package section9InnerAbstractClassesInterfaces;

public abstract class ListItem {
    protected ListItem leftLink = null;
    protected ListItem rightLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);
     abstract int compareTo(ListItem listItem);

    protected Object getValue() {
        return this.value;
    }

    protected void setValue(Object value) {
        this.value = value;
    }
}
