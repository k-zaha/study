/* ソース説明
    FileRedaderクラスを利用して、テキストファイルのテキストデータを、プログラムに読み込み
    コマンドプロンプト上で出力する。
    (コマンドプロンプトでのS-jis以外の出力の仕方がわからないので、テキストデータもs-jisで用意。)
    2020/1/6現在、javaコード、テキストデータ共に、文字コードs-jisで作成している。
    javaの標準がutf-8なので、ゆくゆくはUTF-8に切り替えたほうが良いのかなとは思っている。
*/

import java.io.*; //FileReader等、ストリームクラスのパッケージ。

class ReadText {
    public static void main(String[] args){
        try {
            FileReader in = new FileReader(args[0]);
            /*　↑コマンドライン引数で指定したテキストファイルを、FileReaderクラスのオブジェクトを
                作成することで、プログラム上で読み込めるようにしている。オブジェクト名:in
            */
            int c;
            String s = new String();
            while((c = in.read()) != -1){//read();は、inに格納したテキストファイルを一文字ずつ、int型で読み込む。
                s = s + (char)c;//変数cに読み込んだint型のテキストデータを、(char型※一文字の文字データ)に変換し、一文字ずつsに格納。
            }
            System.out.print(s);
            in.close();
        } catch(IOException ie) {  //IOExceptionは入出力時の例外を表す例外クラス。　(指定したファイル名が存在しない場合⇒　例外処理へ)
            System.out.println("ファイルがありません。");
        } catch(Exception e) { //"java ReadText ～"の起動時にコマンドライン引数にファイル名が指定されていない場合⇒　例外処理へ
            System.out.println("ファイル指定がありません。");
        }
    }
}