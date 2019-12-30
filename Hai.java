import java.util.*;
class Hai{
    public static void main(String[] args){
        int[] a = new int[] {1,2,3,4};
        //ArraysクラスのtoStringメソッドを使うことによって[]付きで配列の中身を全出しできる。
        //System.out.print(Arrays.toString(a));

        //でも、forで繰り返し処理を行って逐次出力(println)にしたほうがシンプル
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
            }
    }
}