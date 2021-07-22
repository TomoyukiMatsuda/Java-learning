package DesignPattern.Observer;

import java.util.ArrayList;

public abstract class NumberGenerator {
  
  private ArrayList<Observer> observers = new ArrayList<>();
  
  
  public abstract int getNumber();
  public abstract void execute();
}
