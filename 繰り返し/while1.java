public class while1{
  public static void main (String[] args) {
    //while文：条件を指定する繰り返し
    int num = 1;
    int count = 0; //繰り返し回数記憶用
    while (num < 1000){ //条件式を
      num *= 2;
      count++;
      System.out.println(count + "回目：" + num);
    } 
    System.out.println(count + "回目に1000を超えます");
  }
}