import java.util.*;

class ListTest {

    /* ArrayListは配列のようにオブジェクトを格納することができるコレクションクラス。

        クラスなので、ArrayListのクラスをインスタンスを生成することで、
        そのクラス内のメソッドを使用することができるようになる。

        ◆コレクションクラスのメソッド一例◆
        add(0, a) == 0行目にaの値を追加する。
        set(1, d) == 1行目の値をdに変更する。

    */

    
    /*コレクションクラスを使用するときは

        コレクションクラスは、データ型が決まっていないので、定義するときに
        データ型を<>ではさみ、定義しないといけない。
        例) ArrayList<Integer> int = new ArrayList<Integer>();

        コレクションクラスを使用する場合、java.utilパッケージをimportする
        必要がある。　例）import java.util.*;
    */
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        String a = "a", b = "b", c = "c", d = "d";
        System.out.println(lst);
        lst.add(a);
        lst.add(b);
        lst.add(c);
        System.out.println(lst);

        lst.add(2, d);
        System.out.println(lst);

        lst.set(1, d);
        System.out.println(lst);
    }
}