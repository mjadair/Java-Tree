public class CarLoan {



	public static void main(String[] args) {

    int carLoan = 1000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;



if (loanLength <= 0 || interestRate <= 0) {
  System.out.println("Error! You must take out a valid loan.")
}
else if(downPayment >= carLoan) {
  System.out.println("The car can be paid in full");

}
else{
  int remainingBalance = carLoan - downPayment;
}
	

	}
}