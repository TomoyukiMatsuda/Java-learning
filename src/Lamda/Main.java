package Lamda;

import Lamda.Sample.Factory;
import Lamda.Sample.Sample;

// todo ラムダ式5の途中から開始、Function、Consumerとか
//  https://www.youtube.com/watch?v=xj-IGnqH4EY&list=PL0BiAlg8j4Zu_XVmBIq2DTSP8LdRWSjwV&index=5
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