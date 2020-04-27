import java.math.BigInteger;

class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public void getInfo() {

    System.out
        .println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

  }

  public static void main(String[] args) {

    Language english = new Language("English", 1500000000, "the western world", "subject, verb, object");

    english.getInfo();

    Language kʼicheʼ = new Mayan("Kʼicheʼ", 2330000);

    kʼicheʼ.getInfo();

    Language mandarin = new SinoTibetan("Mandarin Chinese", 999999999);

    mandarin.getInfo();

    Language burmese = new SinoTibetan("Burmese", 33000000);

    burmese.getInfo();

  }

}