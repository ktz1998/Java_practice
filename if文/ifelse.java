public class ifelse{
  public static void main (String[] args) {
    //数値が10の時とそうでない時
    int num = 10;
    if(num == 10)
      System.out.println("10と同じ");
    else
      System.out.println("10と同じではない");
    
    //3つの条件の比較
    //3歳以下、3～20歳、20歳以上で条件を分ける
    int year = 30;
    if(year <= 3) //3歳以下
      System.out.println("0円です");
    else if (year <= 20) //3歳以下除く20歳以下（つまり3～20歳）
      System.out.println("1000円です");
    else //20歳以上
      System.out.println("2000円です");
    
  }
}