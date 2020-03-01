public class Student extends Person {
   private int graduationYear;
   private double gpa;
   
   public Student(String firstName, String lastName, int graduationYear, double gpa){
      super(firstName, lastName);
      this.graduationYear = graduationYear;
      this.gpa = gpa;
   }
   
   public void print() {
      System.out.println("Student Details: ");
      super.print();
      System.out.println("\t Graduation Year is " + graduationYear);
      System.out.println("\t GPA is: " + gpa);
   }
}