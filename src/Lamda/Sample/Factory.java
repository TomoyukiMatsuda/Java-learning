package Lamda.Sample;

public class Factory {
  // Factoryパターン Sample 型の SampleImpl インスタンスを返す
  public static Sample create() {
    return new SampleImpl();
  }
}
