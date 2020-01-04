/* インターフェースの継承
    extends == クラスやインターフェースを継承するときに使う。
    implements == クラスにインターフェースを実装するときに使う。

    単数～複数のinterfaceを別のinterfaceに継承する事も可能 ⇒ extendsを使用する。
    クラスに他クラスを継承しつつ、インターフェースを実装する事も可能。
    その際はclass Aclass extends Bclass inplements Intera, Interb {　～ と
    クラスを定義する。extendsを先に書くのがポイント。
*/

interface Greet {
    void greet();
}

interface Bye extends Greet {
    void bye();
}

class Greeting implements Bye {
    public void greet() {
        System.out.println("こんにちは！");
    }

    public void bye() {
        System.out.println("さようなら。");
    }
}

class Meet2 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.bye();
    }
}