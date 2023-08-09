public class ronri{
  public static void main (String[] args) {
    //論理演算子
    int num = 7;
    if (num >= 5 && num <=10) //～且つ～
      System.out.println("5と10の間にある");
    if (num < 5 || num >10) //～または、～
      System.out.println("5と10の間にはない");
  }
}