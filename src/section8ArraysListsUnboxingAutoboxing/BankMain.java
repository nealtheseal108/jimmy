package section8ArraysListsUnboxingAutoboxing;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("Neal's bank");
        bank.addBranch("Neal's house");
        bank.addCustomer("Neal's house", "Neal", 10);
        bank.listCustomers("Neal's house", true);
    }
}
