//break文：処理を強制終了させる
public class break1{
    public static void main (String[] args) {
        int i;
        for (i = 1; i <= 5; i++){
            System.out.println(i + "回目の処理");
            if (i == 2)
                break;  //強制的に処理を終了させる
        } 
    }
}