package section6OOP1;

public class mainBank {
    public static void main(String[] args) {
        bankAccount nealsAccount = new bankAccount();
        nealsAccount.setCustomerName("Neal Parekh");
        nealsAccount.setBalance(500);
        nealsAccount.setEmail("neal@gmail.com");
        nealsAccount.setPhoneNumber(123456789);

        nealsAccount.withdrawFunds(100);

        nealsAccount.depositFunds(50);
        nealsAccount.withdrawFunds(49);

        bankAccount tanisAccount = new bankAccount(572839483, 5642.42, "Tanishka Parekh", "tani@gmail.com", 123456789);
        tanisAccount.withdrawFunds(110);
        tanisAccount.depositFunds(433);

        bankAccount defaultAccount = new bankAccount();
        System.out.println(defaultAccount.getAccountNumber());
        System.out.println(defaultAccount.getBalance());
        System.out.println(defaultAccount.getCustomerName());

        bankAccount timsAccount = new bankAccount(123456789, 100.0, "Tim Buchalka");
    }
}

// constructors mass-assign values to fields
// 'new' keyword is a constructor, creates the class
// constructors help you create instances of classes efficiently
// constructors construct classes and can be overloaded like methods with the same name but different parameters
// this() points a constructor to another constructor and attaches default values to it, needs to be the first line in the constructor body that is executed