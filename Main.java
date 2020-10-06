import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
Scanner input = new Scanner(System.in);
double interest = 0;


  //get users starting balance
System.out.println("Please enter a starting balance");
   double balance = input.nextDouble(); 
     //get users interest rate
System.out.println("Please enter your interest rate");
   double rate = input.nextDouble(); 
     //get users years
System.out.println("Please enter the numbers of years you will invest for");
   double years = input.nextDouble(); 
for(double i = years; i >= 1; i--){
interest= balance * rate;
balance= balance + interest;
}
System.out.println("Your final balance would be " + balance);
  }
}

