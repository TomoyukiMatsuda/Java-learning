package Lamda.Sample;

// public を外すことで非公開にする 外部のpackageからはアクセスができなくなる
class SampleImpl implements Sample {
  // 実装する動作は非公開にしたい
  @Override
  public void execute() {
    System.out.println("ハロー！！");
  }
}
