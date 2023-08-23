//continue文；周回の範囲内でcontinue文以降の処理をスキップする
public class continue1{
    public static void main (String[] args) {
        //0,1,2,3,4 と表示させる。最後はカンマ不要にする
        int i;
        for (i = 0; i < 5; i++){
            System.out.print(i);
            if (i == 4) //最後の数字になるとカンマ付け処理を飛ばす
                continue;
            System.out.print(",");
        } 
        System.out.println(); //改行
    }
} 