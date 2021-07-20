package Lamda;

import Lamda.Sample.Factory;
import Lamda.Sample.Sample;

// todo ラムダ式8
//  https://www.youtube.com/watch?v=xj-IGnqH4EY&list=PL0BiAlg8j4Zu_XVmBIq2DTSP8LdRWSjwV&index=8
// Mainクラスは Sample しか見ないようにしたい
public class Main {
  public static void main(String[] args) {
    Test test = new Test();
    // 可変の処理だけをラムダ式で引数に渡している
    test.process(() -> System.out.println("メインメソッドから実行"));
//    test.process(new Sample() {
//      @Override
//      public void execute() {
//        System.out.println("メインメソッドから実行");
//      }
//    });
    
    // チェーンで書いて save メソッドを呼ぶだけ
    Item item = new Item()
      .id("100")
      .name("アイテム")
      .description("アイテムの説明")
      .price(200);
    
    Item.save(item);
  }
}

class Test {
  // 関数型インターフェースを引数に取ることでラムダ式で処理を引数に渡して実行可能になる
  public void process(Sample sample) {
    System.out.println("スタート");
    sample.execute(); // ここの処理だけ可変としたい
    System.out.println("エンド");
  }
}

class Item {
  private String id;
  private String name;
  private String description;
  private int price;
  
  public Item id(String id) {
    this.id = id;
    return this;
  }
  
  public Item name(String name) {
    this.name = name;
    return this;
  }
  
  public Item description(String description) {
    this.description = description;
    return this;
  }
  
  public Item price(int price) {
    this.price = price;
    return this;
  }
  
  public static void save(Item item) {
    System.out.println("セーブ：" + item);
  }
  
  @Override
  public String toString() {
    return "Item{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", price=" + price +
      '}';
  }
}