/* instanceof
    オブジェクトが指定したクラスのオブジェクトであれば、trueを、でなければfalseを返す。
    また、オブジェクトが指定したインターフェースを実装していれば、tureを、でなければfalseを返す。
    boolean flag = ObujectB instanceof ClassA;
    上記の例だと、ClassAの中に、ObjectCが存在していれば、boolean型の変数flagにtrueを返す仕組みになっている。

    このプログラムは。。
    インターフェースCryとCryを実装している、Catクラス、実装していないDogクラスを用意した。
    実行クラスとなるCheckCryクラスで、それぞれCat、Dogのインスタンスを生成し、
    Cryインターフェースを実装していれば、各々の鳴き声が表示されるようになっている。

    今回はCatクラスのみ、Cryインターフェースを実装(implements)しているので、猫しか鳴かないようになっている。
*/
interface Cry {
    void cry();
}

class Cat implements Cry {
    public void cry() {
        System.out.println("にゃー");
    }
}

class Dog {
    public void cry() {
        System.out.println("わん");
    }
}

class CheckCry {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();

        if(cat instanceof Cry) {
            cat.cry();
        }

        if(dog instanceof Cry){
            dog.cry();
        }

    }
}