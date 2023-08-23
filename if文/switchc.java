public class switchc{
  public static void main (String[] args) {
  //swiych case（番号を使った場合分け)
    int num = 5; 
    switch(num){
      case 1: //値が〇のとき
        System.out.println("ハリー");
        break; //必ずbreakでcaseを終了させる
      case 2:
        System.out.println("ロン");
        break;
      case 3:
        System.out.println("ハーマイオニー");
        break;
      default:  //いずれのcaseでもないとき
        System.out.println("番号は1～3です");
    }
  }
  
} 
