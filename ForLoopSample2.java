import java.util.*;
class ForLoopSample2{
    /*コレクションクラス
    　配列のように、複数のデータを格納でき、要素の追加/削除/検索という
    　機能(メソッド)を持った便利なクラス。
      "フィールドの追加、削除、検索が容易にできる配列" みたいなイメージ？
      下記では、ひとまずデータの追加を行える　オブジェクト名.addメソッドを使用している。
      
      コレクションクラスは、Java.utilライブラリをインポートすれば、使用可能。
      ArrayList<データ型名> オブジェクト名　= new ArrayList<データ型名>();で
      オブジェクトを作成できる。*/


    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();

        lst.add(new String("0"));
        lst.add(new String("1"));
        lst.add(new String("2"));

        for (String s : lst) {
            System.out.println(s);
        }

    }
}