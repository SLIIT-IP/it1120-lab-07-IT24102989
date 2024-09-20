import java.util.Scanner;

  public class IT24102989Lab7Q1A{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int subMark1;
      int subMark2;
      int subMark3;
      int subMark4;
      int sum;
      double average;
      String grade;
      

      System.out.println("Entermarks for four subjects:");
      
      System.out.println("Enter Subject Mark 1:");
      subMark1 = scanner.nextInt();
    
      System.out.println("Enter Subject Mark 2:");
      subMark2 = scanner.nextInt();

      System.out.println("Enter Subject Mark 3:");
      subMark3 = scanner.nextInt();

      System.out.println("Enter Subject Mark 4:");
      subMark4 = scanner.nextInt();

      sum = subMark1+subMark2+subMark3+subMark4;

      average = sum/4.0;

      if ( average<=100 && average>=75 ) {
         grade  = " Distinction ";
      
      } else if ( average<=74 && average>=50 ) {
         grade = " Credit ";
     
      } else if ( average<=49 && average>=0 ) {
         grade = " Fail ";

      } else {
         grade = "Invalid Marks";
      }

      System.out.println("Average is:" + average);
      System.out.println("Overall Grade is:" + grade);
       
      scanner.close();
   
      }
}







         
