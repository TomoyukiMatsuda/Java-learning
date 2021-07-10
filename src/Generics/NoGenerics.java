package Generics;

public class NoGenerics {
  // ジェネリクスを利用しないクラス
  // Object型 だからなんでも入れられちゃう
  private Object obj;
  
  public NoGenerics(Object obj) {
    this.obj = obj;
  }
  
  public Object getObj() {
    return obj;
  }
}

//class Generics.Generics.Main {
//  public static void main(String[] args) {
//    // String型の引数obj としてインスタンス生成する
//    Generics.Generics.NoGenerics noGenerics = new Generics.Generics.NoGenerics("2021");
//
//    // キャストして取得する。キャストしないと String として利用できない
//    String obj = (String) noGenerics.getObj();
//    System.out.println(obj);
//  }
//}

class Main {
  public static void main(String[] args) {
    // String型の引数obj としてインスタンス生成する
    NoGenerics noGenerics = new NoGenerics("2021");

    // もしこの引数を Integer型 だと勘違いして利用しようとすると当然エラーが発生する
    Integer obj = (Integer) noGenerics.getObj(); // ここで ClassCastException !!!
    System.out.println(obj);
  }
}
