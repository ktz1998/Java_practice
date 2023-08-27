public class nibai{
    public static void nibai(int x){
    //int xはnumに格納された引数10のコピーを受け取り、格納するための仮引数。
    //nibai関数の中だけで用いる引数となり、main関数内のnumとは全くの別物。
        System.out.println(x*2);
    }
    public static void main (String[] args) {
        int num = 10;
        nibai(num);   //numは引数
    }
} 