import java.util.Scanner;

 public class IT24102989Lab7Q1B {
    public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);

     for (int student = 1; student<=3; student++) {
       System.out.println("Student " + student);

       int mark1, mark2, mark3, mark4;
       System.out.print("Enter marks: ");
       mark1 = scanner.nextInt();
       mark2 = scanner.nextInt();
       mark3 = scanner.nextInt();
       mark4 = scanner.nextInt();

       int total = mark1 + mark2 + mark3 + mark4;
       double average = total / 4.0;

       System.out.println("Average is:" + average);
  
       String grade;

       if ( average<=100 && average>=75 ) {
         grade  = " Distinction ";
      
       } else if ( average<=74 && average>=50 ) {
         grade = " Credit ";
     
       } else if ( average<=49 && average>=0 ) {
         grade = " Fail ";

       } else {
         grade = "Invalid Marks";
       }
 
       System.out.println("Overall Grade is : " + grade);       
       System.out.println();
       
      }
     
      scanner.close();
   }
}