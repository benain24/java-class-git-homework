public class Cats{
  private String name;
  private String sound;
  
  Cats(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public String getSound(){
    return sound;
  }

  public static void main(String args[]){
    Cats generic = new Cats("No Name");
    System.out.println("Name: " + generic.getName());
    System.out.println("Sound: " + generic.getSound());
  }
}