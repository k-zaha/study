abstract class Calc1 {
    /* 抽象クラス　多態性について

        【抽象クラス】
        抽象メソッド：メソッドだけ定義し、処理の内容を未定としておくメソッド。
        クラスを継承したサブクラスで処理内容をオーバーライドして使用する。
        クラス定義時、頭に修飾子abstractをつけて定義できる。

        抽象クラスは、抽象メソッドを持つクラスのこと。
        定義時、頭にabstractをつける事で、定義できる。

        

        【多態性】
        スーパークラスのメンバ(フィールド、メソッド)は、サブクラスのメンバとして
        呼び出すことができるという性質。

        多態性をきちんと理解し、使いこなすことができるようになると、より拡張性に
        富んだ、プログラムを作れるようになる。
    */

    int a;
    int b;
    abstract void answer();

    void setData(int m, int n) {
        a = m;
        b = n;
    }
}

class Plus extends Calc1 {
    void answer(){
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}

class Calculation1 {
    public static void main(String[] args){
        Plus plus = new Plus();
        plus.setData(27, 32);
        plus.answer();
    }    
}