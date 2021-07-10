import java.util.Comparator;

// TODO: 1.5 Comparable を学びたい
public class Sukkiri implements Comparable, Comparator {
  public static void main(String[] args) {
    FuncList funcList = new FuncList();
    
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = funcList::passCheck;
    System.out.println(f1.call(30));
    System.out.println(f2.call(68, "ともゆき"));
  }
  
  @Override
  public int compareTo(Object o) {
    return 0;
  }
  
  @Override
  public int compare(Object o1, Object o2) {
      return 0;
  }
}

class FuncList {
  public static boolean isOdd(int x) { return (x % 2 == 1); }
  
  public String passCheck(int point, String name) {
    return name + "さんは" + (point > 65 ? "合格" : "不合格");
  }
}

interface Func1 {
  boolean call(int x);
}

interface Func2 {
  String call(int point, String name);
}