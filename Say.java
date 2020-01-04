/*インターフェースのメソッドに、処理内容を予め定義する場合
　【default修飾子を使用する場合】
   default修飾子をメソッドに定義しておけば、実装したクラスでメソッドをオーバーライドしなくても使用することができる。
   defaultは、インターフェース内で定義する際に、public default void メソッド名() {～　と記載する事で定義付けが可能。

  【static修飾子を使用する場合】
    メソッドを定義する際にstatic修飾子をつけておけば、インスタンス化しなくても、「インターフェース.メソッド名」の形式で呼び出す事ができる。
    static修飾子は、インターフェース内で定義する際に、public default void メソッド名() {～　と記載する事で定義付けが可能。
*/

interface Greet1 {
    void greet();
}

interface Greet2 {
    public default void afternoon() {
        System.out.println("こんにちは");
    }
}

interface Greet3 {
    static void evening(){
        System.out.println("こんばんは");
    }
}

class Greeting implements Greet1, Greet2 {
    public void greet() {
        System.out.println("おはよう");
    }
}

class Say{
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.greet();
        g.afternoon();
        Greet3.evening();

    }
}