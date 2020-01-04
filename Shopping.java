class Purse {

    /* ◎static 修飾子について◎
      static 修飾子を付けたフィールドの値の変更は同一クラスのオブジェクト内ですべて【共有】される。
      (Abcクラスにフィールドint aとオブジェクトb、cがあり、フィールドaに1000が定義されると、
      bからaを呼んでも、cからaを呼んでもその値は1000になる。)


      static 修飾子を付けたメソッドは、格納されているクラスがインスタンスを生成してなくても
      呼び出すことができる。しかし、staticメソッドには下記制約条件がある。

        ◇staticメソッド
        ・非staticメソッドではオーバーライドができない。
        ・staticメソッド内で参照するメソッドやフィールドはstaticでなければならない。
        ・他のオブジェクトから参照するときは、クラス名.staticメソッド名(); で呼び出すことができる。
        　(通常のメソッドは　オブジェクト名.メソッド名();  でよびだせる)

    */

    static int money = 0;
    
    void printMoney(int in, int out){
        money = money + in - out;
        if(money < 0){
            System.out.println(-1 * money + "円足りません");

        } else {
            System.out.println("残金は" + money + "円です。");
        }
    }
}

class Shopping {
    public static void main(String[] args) {
        Purse store1 = new Purse();
        Purse store2 = new Purse();
        store1.printMoney(1000, 100);
        store2.printMoney(0, 250);
        store1.printMoney(0, 800);
    }
}