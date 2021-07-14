package Lamda.Sample;

public class Factory {
  // Factoryパターン Sample 型の SampleImpl インスタンスを返す
  public static Sample create() {
    // InnerSampleクラスは static ではないので、インスタンスから生成する
    //return new Factory().new InnerSample();
  
    // ラムダ式　Sample型をリターンすることが決まっている、かつ Sample は関数型インターフェース（実装メソッドを一つしか持っていない）
    // だから、execute() の処理内容だけわかればOKの状態
    return () -> System.out.println("ラムダ式");
    
    // インターフェース をインスタンス化
    //return new Sample() {
      // Sampleインターフェースをimplementsした無名クラスのインスタンスの参照を扱うイメージ。インスタンス化の使い捨て？
//      @Override
//      public void execute() {
//        System.out.println("匿名クラス");
//      }
//    };
  }
  
  // Factoryクラスからしかアクセスできない
//  private class InnerSample implements Sample {
//    @Override
//    public void execute() {
//      System.out.println("インナークラス");
//    }
//  }
}
