public class keisan{  //複数の引数
    public static void keisan(int x, int y){  //xがapple,yがorangeの仮引数
        System.out.println("合計：" + ((100*x) + (200*y)) );
    }
    public static void main (String[] args) {
        int apple, orange;
        apple = 10;
        orange = 5;
        keisan(apple, orange);  //2つの引数を渡す
    }
} 