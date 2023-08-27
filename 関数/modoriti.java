public class modoriti{
    public static int keisan(int x){  //戻り値でintを指定
        int goukei = x * 200;  //goukeiはappleの合計金額
        return goukei;  //戻り値としてkeisan関数に返却
    }
    public static void main (String[] args) {
        int apple = 100;
        int result = keisan(apple);  //合計金額をresultに
        if (result > 3000)
            System.out.println("予算オーバー");
        else
            System.out.println("予算以内で購入可");
    }
} 