import java.util.*;
/* Generic
    クラスの定義時にデータ型を変数で定義しておく事。
    インスタンス生成時に改めて、任意の型を定義する。
    クラス定義の時点では、データ型を抽象的に定義づけておくことが目的。
*/
class GenericSample {
    public static void main(String[] args) {

        ArrayList<Integer> lst =new ArrayList<Integer>(); //<Interger>によってArrayListのデータ型をint型として指定。

        for(int i = 0; i < 5; i++) {
            lst.add(i * 3); //3の倍数を逐次追加。
        }

        for(int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}