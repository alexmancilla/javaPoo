public class Dinosaur {
  boolean isExtinct;
  
  public Dinosaur(boolean extinct) {
    isExtinct = extinct;
  }
  
  public static void main(String[] args) {
    // program tasks
    int dinoEnd = -2000000;
    int actual = 2022;
    boolean age = dinoEnd > actual;
    Dinosaur triceratops = new Dinosaur(age);
    System.out.println("The statment: Triceratops are alive today is -> " + triceratops.isExtinct);
  }
}
