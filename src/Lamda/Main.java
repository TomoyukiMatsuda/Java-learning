package Lamda;

import Lamda.Sample.Factory;
import Lamda.Sample.Sample;

// todo ラムダ式2から開始 https://www.youtube.com/watch?v=C8ajfSSjhR8&list=PL0BiAlg8j4Zu_XVmBIq2DTSP8LdRWSjwV&index=2
// Mainクラスは Sample しか見ないようにしたい
public class Main {
  public static void main(String[] args) {
    // Sample型の SampleImpl インスタンスが格納される
    Sample sample = Factory.create();
    sample.execute();
  }
}
