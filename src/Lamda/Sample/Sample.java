package Lamda.Sample;

// ２つ以上のメソッドを定義しようとするとこのアノテーションによってワーニングが吐き出される
@FunctionalInterface // 関数型インターフェースであることを明示している
public interface Sample {
  // 関数型インターフェースは static メソッドやデフォルトはあっても良いが、抽象メソッドは一つしか持てない
  void execute();
}
