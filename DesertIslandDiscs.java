import java.util.ArrayList;

class DesertIslandDiscs {

  
  
  public static void main(String[] args) {
    


    ArrayList<String> 
    desertIslandDiscs= new 
    ArrayList<String>();


    desertIslandDiscs.add("Welcome to the Jungle by Guns N' Roses");
    desertIslandDiscs.add("Wagonwheel by Darius Rucker");

    System.out.println(desertIslandDiscs);
    System.out.println(desertIslandDiscs.size());

    desertIslandDiscs.remove("Wagonwheel by Darius Rucker");

    System.out.println(desertIslandDiscs);
    System.out.println(desertIslandDiscs.size());

  }
  
}