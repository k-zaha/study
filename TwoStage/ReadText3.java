/*ソース説明
    リソース付きtry文を使用し、「try文宣言時()内に入力したファイルオープン処理を、自動クローズする。」という機能を実装してみた。
    ソース終盤でファイルのクローズを個別に書かなくて済むので、コードがスッキリかける。

    ※プログラムの内容は、FileReaderで読み込んだtextファイルを、コマンドプロンプトに出力するもの。
*/


import java.io.*;

class ReadText3 {
    public static void main(String[] args) {
        try(FileReader in = new FileReader(args[0])) {
            int c;
            String s = new String();
            
            while((c = in.read()) != -1){
                s = s + (char)c;
            }
            System.out.println(s);

        } catch(IOException ioe) {
            System.out.println("ファイルがありません。");
        } catch(Exception e){
            System.out.println("コマンドライン引数がありません。");
        } //上記のtry宣言時にオープンするファイルの処理を定義しているので、例外処理終了時に自動的にファイルがクローズする。

    }
}