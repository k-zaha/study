/*
    FileWriterクラスを使用して、Textファイルの内容を書き、textファイルを生成する。 
    FikeWriterクラスはオブジェクトを生成するときに、生成するテキストファイルの名前(と拡張子)を定義できる。
       FileWriter オブジェクト名 = new FileWriter("生成するファイル名.拡張子");
    newWriterを使用した場合、textファイルはjavaファイルと同じディレクトリに生成される。

    SystemクラスのgetPropertyメソッド：（""）の中にString型でほしいプロパティを指定することで、そのデータを
    取得してくれる。　例）System.getProperty("line.separator");の場合、osごとの改行コードを取得する。
    getPropertyの引数に無効な値を入れると、nullが返される。

    out.writeメソッド：引数に指定した文字データをテキストデータに書き込む。
    

*/

import java.io.*;

class WriteText {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("テストデータ.txt");//オブジェクト生成時に、ファイル名の指定まで行う。
            String str = System.getProperty("line.separator"); //osごとの改行コードをgetPropertyで取得。変数strに格納。
            int a  =  10, b = 5;
            out.write("加法：");
            out.write(a + "+" + b + "=" + (a+b) + str);
            out.write("減法：");
            out.write (a + "-" + b +"=" + (a-b) + str);
            out.write ("テストデータだよぉぉぉ！！");
            out.close(); //FileWriter(ストリーム)を閉じる
        } catch(Exception e) {
            System.out.print(e);
        }


    }
}
