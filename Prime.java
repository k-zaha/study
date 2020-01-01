import java.util.*;
class Prime{
    public static void main(String[] args){
        int max = 100; //素数を探す数の最大値
        boolean[] a = new boolean[max]; //素数かどうかを判定する配列

        //配列の初期化
        for(int i = 0; i < max; i++){
            a[i] = true;
        }
        //System.out.println(Arrays.toString(a));

        //素数かどうか判定　　　～素数を算定する条件が、素数の倍数を除外すること。
        for(int i = 2; i < max; i++){// 1は素数ではないため、2から計算。
            if(a[i-1]){ //15行目と、17行目で1を引いているのはそれぞれ配列が1始まりだから。
                for(int j = 2; i*j <= max; j++){
                    a[i * j - 1] = false;
                }
            }
        }

        //配列aのtrue falseの値をもとに素数を表示させていく。
        //26に1を足しているのは、
        for(int i = 2; i < max; i++){
            if(a[i-1]){//iをmaxまでカウントアップしていき、iがtrueの場合、i+1の数字を表示。
                System.out.print(i + " ");//配列上では1==0始まりになるので数字で出すときは1を足している。
            }
        }
    }
}