package DesignPattern;

public class Singleton {
  
  private static Singleton singleton;
  
  // private コンストラクタ
  private Singleton() {}
  
  public static Singleton getInstance() {
    // null であれば new してインスタンス生成後に格納。
    // null でなければそのまま現状のインスタンスを返す。
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}

class Main {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
    
    System.out.println(
      s1.hashCode() + " / " + s2.hashCode() + " / " + s3.hashCode()
    );
  }
}
