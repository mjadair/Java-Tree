public class Magic {
	public static void main(String[] args) {

    //This process will print 3 no matter what the initial 'my number variable is.'

    int myNumber = 8;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;


    System.out.println(stepSix);

	}
}