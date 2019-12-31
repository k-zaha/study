import java.util.*;
class Sort{
    public static void main(String[] args){
        //変数説明　a:配列データ b:配列aの要素数を記憶　k:回避 j:ソートカウンタ＆ソート前数字　i:表示のカウンタ＆ソート後ろ数字(j＋１)
        int a[] = {210, 19, 72, 129, 34};
        int b = a.length;
        int i, j, k;
        
        //ソート前のデータ表示
        System.out.println("データの表示");
        for(i = 0;i < b;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        //ソート ソート内のコメントアウト外したら、ソート中の値の動きがわかる。
        for(j = 0; j < b-1;j++){
            for(i = j+1; i < b; i++){
                //System.out.println("j=" +j+ " i="+i);
                if(a[j] > a[i]){
                    k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
                //System.out.println("a[j]=" +a[j]+ " a[i]="+a[i]);
                //System.out.println(Arrays.toString(a));
                //System.out.println();
            }
        }
        //ソート後データ表示
        System.out.println("並び替え後のデータの表示");
        for(i = 0;i < b;i++){
            System.out.print(a[i] + " ");
        }

        
    }
}