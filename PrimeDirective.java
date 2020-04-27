
// Import statement:
import java.util.ArrayList;

class PrimeDirective {

  public boolean isPrime(int number) {


  //If statement for edge cases
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

  //for loop that iterates through numbers to check if numbers before are not prime
    else {
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          return false;
        }
      }
    //otherwise true
      return true;
    }
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };


    System.out.println(pd.isPrime(0));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));

  }

}