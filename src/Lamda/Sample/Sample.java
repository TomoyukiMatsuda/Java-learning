package Lamda.Sample;

// ２つ以上のメソッドを定義しようとするとこのアノテーションによってワーニングが吐き出される
@FunctionalInterface
public interface Sample {
  
  void execute();
}
