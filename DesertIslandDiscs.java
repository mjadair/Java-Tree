import java.util.ArrayList;

class DesertIslandDiscs {

  
  
  public static void main(String[] args) {
    


    ArrayList<String> desertIslandDiscs= new ArrayList<String>();


    desertIslandDiscs.add("Welcome to the Jungle by Guns N' Roses");
    desertIslandDiscs.add("Wagonwheel by Darius Rucker");
    desertIslandDiscs.add("Norgaard by The Vaccines");

    System.out.println(desertIslandDiscs);
    System.out.println(desertIslandDiscs.size());

    desertIslandDiscs.remove("Wagonwheel by Darius Rucker");

    System.out.println(desertIslandDiscs);
    System.out.println(desertIslandDiscs.size());


    int choiceOne = desertIslandDiscs.indexOf("Welcome to the Jungle by Guns N' Roses");
    int choiceTwo = desertIslandDiscs.indexOf("Norgaard by The Vaccines");

    String tempA = "Give it up by KC and the Sunshine Band";


    desertIslandDiscs.set(choiceOne, tempA);

    System.out.println(desertIslandDiscs);



  }
  
}