import java.util.Scanner;

public class Person {
   private String firstName;
   private String lastName;
   
   public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   public void print() {
      System.out.println("\t" + firstName + " " + lastName);
      System.out.println("\t Name in uppercase: " + firstName.toUpperCase() + " " + lastName.toUpperCase());
      System.out.println("\t Name in lowercase: " + firstName.toLowerCase() + " " + lastName.toLowerCase());
   }
}