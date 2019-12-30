//import java.util.*;
class Taji{
    public static void main(String[] args){

        //一次元の配列　変数作成　出力などなど
/*        int[][] a = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        System.out.println("a[0][0]=" + a[0][0] + " a[0][1]=" + a[0][1]);
        System.out.println("a[1][0]=" + a[0][0] + " a[1][1]=" + a[0][1]);
        System.out.println("a[2][0]=" + a[0][0] + " a[0][1]=" + a[0][1]);
*/

        int[][]a = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}
        };

        System.out.println("一次元配列の要素数" + a.length);
        System.out.println("a[0]の要素数 " + a[0].length);
        System.out.println("a[1]の要素数 " + a[1].length);
        System.out.println("a[2]の要素数 " + a[2].length);

    }

}
