import java.io.*;


/*ソース説明
  遊びで作ってみた。
  jpegファイルを読み込んでくれない。　同じディレクトリにあるのに。(usoyo.jpeg)
  コンパイルは可能。datファイルは読み込みも可能。jpegを読み込むときには別に処理が必要？ ⇒解決　usoyo.jpegがそもそもjpegじゃなかった。


  使っている新技術
  FileInputStream (inputStreamクラスの子クラス)
  オブジェクトを生成することで、バイナリファイルをプログラムに読み込むことができる。

  FileOutputStream (OUtputStreamクラスの子クラス）
  オブジェクトを生成することで、バイナリファイルをプログラム上で書き出し、生成することができる。


  jpegファイルを読み込み、名前を変更してまったく同じデータ(コピー)を出力したいが、出力方法が不明。
*/
class Test {
    public static void main(String[] args){
        try{
          //*
            FileInputStream in = new FileInputStream("nyannyan.jpg");//既存のバイナリファイル"nyannyan.jpg"の読み込み。
            int c;
            String cs;
            while((c = in.read()) != -1){
              cs = cs + (char)c;
            }
            in.close();
          //*/
            FileOutputStream out = new FileOutputStream("file4.jpg");
            out.write(cs); //バイナリファイルの書き出しwriteメソッドにストリング型が使えないので、エラーを吐き挫折。一時終了。
            out.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }

