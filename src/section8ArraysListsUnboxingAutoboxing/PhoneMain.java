package section8ArraysListsUnboxingAutoboxing;

public class PhoneMain {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567");
        Contact contact = new Contact("neal", "123");
        mobilePhone.addNewContact(contact);
        boolean b = mobilePhone.addNewContact(contact);
        System.out.println(b);
        mobilePhone.printContacts();
    }
}
