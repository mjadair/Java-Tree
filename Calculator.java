// public class created
public class Calculator {

  // constructor
  public Calculator() {

  }

  // adds an addition method that returns an int
  public int add(int a, int b) {
    return a + b;
  }

  // adds an subraction method that returns an int
  public int subtract(int a, int b) {
    return a - b;
  }

  // adds an multiplication method that returns an int
  public int multiply(int a, int b) {
    return a * b;
  }

  // adds an division method that returns an int
  public int divide(int a, int b) {
    return a / b;
  }

  // adds an modulo method that returns an int
  public int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {

    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));


  }

}

// let a = 10
// let b = 20

// console.log(a + b)