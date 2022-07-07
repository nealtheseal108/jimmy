package com.amazon.BroShaver.Section6OOP1;

public class Person {
     private String firstName;
     private String lastName;
     private int age;

     public void setFirstName (String firstName) {
         this.firstName = firstName;
     }

     public void setLastName (String lastName) {
         this.lastName = lastName;
     }

     public void setAge (int age) {
         if (age >= 0 && age <= 100) {
             this.age = age;
         } else {
             this.age = 0;
         }
     }

     public String getFirstName () {
         return firstName;
     }

     public String getLastName () {
         return lastName;
     }

     public int getAge () {
         return age;
     }

     public boolean isTeen() {
         if (this.age > 12 && this.age < 20) {
             return true;
         }
         return false;
     }

     public String getFullName () {
         if (this.lastName.isEmpty()) {
            return firstName;
         }
         if (this.firstName.isEmpty()) {
             return this.lastName;
         }
         if (this.lastName.isEmpty() && this.firstName.isEmpty()) {
             return "";
         }
         return (this.firstName + " " + this.lastName);
     }
}
