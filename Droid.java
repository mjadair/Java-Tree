public class Droid {

  String name;
  int batteryLevel;


public Droid(String droidName) {

name = droidName;
batteryLevel = 100;

 }


 public String toString() {
   return "Ahoy there, my name is " + name; 
 }



  public static void main(String[] args) {

    Droid marvin = new Droid("Marvin");


    System.out.println(marvin);


  }

}