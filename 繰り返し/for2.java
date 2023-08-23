public class for2{
  public static void main (String[] args) {
    //for文の二重ループ
    //掛け算の九九表をつくる
    int i, j;
    for (i = 1; i <= 9; i++){
      System.out.print(i + "の段：");
      for (j = 1; j <=9; j++){
        System.out.print(String.format("%3s", i*j)); //String.format("%3s")は文字の幅スペースの調整
      } 
      System.out.println(); //改行
    } 
  }
} 