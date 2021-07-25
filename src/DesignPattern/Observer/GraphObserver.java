package DesignPattern.Observer;

public class GraphObserver implements Observer {
  
  @Override
  public void update(NumberGenerator generator) {
    System.out.print("GraphObserver:");
    int count = generator.getNumber();
    
    for (int i = 0; i < count; i++) {
      System.out.print("*");
    }
    System.out.println("");
  }
}