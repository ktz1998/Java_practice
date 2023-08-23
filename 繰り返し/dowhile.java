//do wlhe文：必ず1番最初に1回は処理が実行される
public class dowhile{
    public static void main (String[] args) {
        int num = 10;
        do{   //必ず最初に実行される処理
            num *= 2;
            System.out.println(num);
        } while (num < 5);
        
    }
} 