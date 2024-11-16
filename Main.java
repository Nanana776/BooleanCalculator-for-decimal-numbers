import java.util.Scanner;

class Main{

  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
  System.out.println("Enter operation (and, or, xor, not, nand, nor, xnor):");
      String operation=input.next();
      int val1=0, val2=0;
      if (operation.toLowerCase().equals("not")) {
        System.out.println("Enter a single value:");
         val1 = input.nextInt();
      } else{
        System.out.println("Enter the first value:");
         val1=input.nextInt();
        System.out.println("Enter the second value:");
         val2=input.nextInt();
      }
  input.close();
      

     BooleanCalculator calculator = new BooleanCalculator();
       calculator.calculate(val1, val2, operation);
  }
}

 