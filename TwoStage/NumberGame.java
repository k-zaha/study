import java.io.*;
/*ソース説明
    数当てゲーム。

    ◆新技術
    BufferedReaderクラス
    オブジェクトを生成すると、行単位でデータを読み込むことができる。
    引数にReaderクラスのオブジェクトを入れることで使用可能。

    FileReaderクラスとの違いは、FileReaderは1文字ずつtextを読み込むのに対し、
    BufferedReaderは、テキストデータを1行ずつ読み込むため、効率が良い。

    System.inとは？
    Systemクラスのオブジェクト。Streamの入力された値を管理する。

    String 変数 = オブジェクト名.readLine　キーボードから入力した文字を、変数に格納する。) 
    変数b = Integer.parseInt(変数a);　String型の変数aをint型に変換し、int型の変数bに格納。

    アウトプットとして、定義外の数字が入った場合、再度数字入力を求められるようプログラム内容を変更。
*/
class NumberGame {
    public static void main(String[] args){
        
        try{
            BufferedReader ko = new BufferedReader(new InputStreamReader(System.in));
            int a,b =7; //答え　==　bに格納されている数字
            System.out.println("名前を入力してください");
            String name = ko.readLine(); //キーボードから入力されたテキストデータをnameに格納する。

            int sa = 0;
            while(sa == 0){
                System.out.println("数当てクイズ！0から9の数字を入力してね");
                String c = ko.readLine();
                a = Integer.parseInt(c); //String型の引数をint型に変換

                if(a > 9 || a < 0){
                    System.out.println("数字を入れて下さい");
                    continue;
                }else{
                
                    while(a != b) {
                        if((a == b-1) || (a == b+1)){
                          System.out.println("おしい！");
                        } else if(a > b+1){
                          System.out.println("もっと小さい数です");
                        } else if(a < b-1){
                          System.out.println("もっと大きい数です");
                        }
                        c = ko.readLine();  //数字の入れ直し
                        a = Integer.parseInt(c);
                    }
                    System.out.println("正解！" + name + "さん、おめでとう！！");
                    sa++;
                } 
            }
        }catch(Exception ie) {
            System.out.println("エラーです");
        }
            
    }
}