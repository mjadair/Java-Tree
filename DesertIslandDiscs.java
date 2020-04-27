import java.util.ArrayList;

class DesertIslandDiscs {

  
  
  public static void main(String[] args) {
    

// Creates a new array list that contains strings
    ArrayList<String> desertIslandDiscs= new ArrayList<String>();

// Adds strings to the array list
    desertIslandDiscs.add("Welcome to the Jungle by Guns N' Roses");
    desertIslandDiscs.add("Wagonwheel by Darius Rucker");
    desertIslandDiscs.add("Norgaard by The Vaccines");


//prints the list and its size
    System.out.println(desertIslandDiscs);
    System.out.println(desertIslandDiscs.size());


//removes and item from the list
    desertIslandDiscs.remove("Wagonwheel by Darius Rucker");


//reprints the list and its size
    System.out.println(desertIslandDiscs);
    System.out.println(desertIslandDiscs.size());

//Saves the index of the list items to a variable
    int choiceOne = desertIslandDiscs.indexOf("Welcome to the Jungle by Guns N' Roses");
    int choiceTwo = desertIslandDiscs.indexOf("Norgaard by The Vaccines");

// new string variable
    String tempA = "Give it up by KC and the Sunshine Band";


  
// changes the first list item to be the new variable
    desertIslandDiscs.set(choiceOne, tempA);

    System.out.println(desertIslandDiscs);



  }
  
}