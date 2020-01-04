class Drink {
    String name; //商品名
    int price; //単価
    int count; //数量

    //コンストラクタ
    Drink(String n, int p, int c){
        name = n;
        price = p;
        count = c;
    }
    int getTotalPrice() { //金額を計算
        return count * price;
    }

    static void printTitle() {
        System.out.println("商品名\t\t単価\t数量\t金額"); //"\t" == タブを挿入
    }

    void printData() {
        System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
    }
    
}

class Alcohol extends Drink {
    float alcper; //アルコール度数

    //コンストラクタ
    Alcohol(String n, int p, int c, float a) {
        super(n, p, c); // スーパークラスのコンストラクタを呼び出す。
        alcper = a;
    }
    //メソッドのオーバーライド
    static void printTitle(){
        System.out.println("商品名(度数[%])\t単価\t数量\t金額");
    }

    //メソッドのオーバーライド
    void printData() {
        System.out.println(name + "(" + alcper + ")" + "\t" + price + "\t" + count +"\t"+ getTotalPrice());
    }
}

class Payment {
    public static void main(String[] args) {
        Drink coffee = new Drink("コーヒー", 200, 3);
        Drink oolongtea = new Drink("ウーロン茶", 150, 2);
        Alcohol wine = new Alcohol("ワイン", 300, 2, 15.0f); //アルコール度数を入力する引数のデータ型が、
                                                            //floatなので数字の後ろにfをつける必要がある。
        //通常ドリンクを出力
        Drink.printTitle();
        coffee.printData();
        oolongtea.printData();
        System.out.println();
        
        //アルコールドリンクを出力
        Alcohol.printTitle();
        wine.printData();

        //注文の合計金額を計算　結果をsumに格納。
        int sum = coffee.getTotalPrice()
        + oolongtea.getTotalPrice() + wine.getTotalPrice();

        //合計金額出力
        System.out.println("\n*** 合計金額" + sum + "円***");
    }
}
