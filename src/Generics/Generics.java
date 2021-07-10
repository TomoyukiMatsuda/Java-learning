package Generics;

// このクラスでは E は利用する際に決めることとしよう！
public class Generics<E> {
  // E で宣言
  private E obj;
  
  public Generics(E obj) {
    this.obj = obj;
  }
  
  public E getObj() {
    return obj;
  }
}

//class Generics.Generics.Main {
//  public static void main(String[] args) {
//    // 利用する際に E を String として利用することに決める
//    Generics.Generics<String> generics = new Generics.Generics<>("2021");
//
//    String obj = generics.getObj();
//    System.out.println(obj);
//  }
//}
