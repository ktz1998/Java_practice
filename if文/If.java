public class If{
  public static void main (String[] args) {
    //条件分岐
    if (true)
      System.out.println("実行されます");
    if (false)
      System.out.println("実行されません");
    
    //等値演算子
    int num = 9;
    if(num == 10)
      System.out.println("10と同じ");
    if(num != 10)
      System.out.println("10と異なる");
  }
}