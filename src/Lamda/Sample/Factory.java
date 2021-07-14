package Lamda.Sample;

public class Factory {
  // Factoryパターン Sample 型の SampleImpl インスタンスを返す
  public static Sample create() {
    // InnerSampleクラスは static ではないので、インスタンスから生成する
    return new Factory().new InnerSample();
  }
  
  // Factoryクラスからしかアクセスできない
  private class InnerSample implements Sample {
    @Override
    public void execute() {
      System.out.println("インナークラス");
    }
  }
}
