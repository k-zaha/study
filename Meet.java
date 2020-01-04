/*インターフェースについて。
    【インターフェース】
    継承関係のないクラスに対して、メソッドやフィールドを提供する仕組み。
    インターフェースの制約は下記のとおり。

    ◇メンバの制約
    ・フィールドは必ず、定数(修飾子finalがつく変数)になる。
    ・メソッドは必ず、抽象メソッドになる。

    ◇ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー◇
    フィールドは定数になるので、　public static final データ型 変数名;
    メソッドは抽象メソッドなので　public abstract void メソッド名();

    という形で記載しないといけないが、下記の形に省略ができる。

    フィールド　データ型 変数名; または  データ型 変数名 = 値;
    メソッド　　void メソッド名();
    ◇ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー◇

    また、インターフェースを定義するときは、interface、
    実装するときは、implementsを使用する。

    
    ◇ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー◇
    //インターフェースの定義(インターフェース名がInterの場合)
    interface Inter{
        int suuzi = 0;
        void mesod();
    }

    //インターフェースInterを実装したクラスの定義。
    class Hoge implements Inter{
        public void mesod(){
            Syssem.out.println("Hello"); 
         ↑
        【オーバーライドの際はメソッドにpublicをつける】
        }
    }
    ◇ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー◇
*/


interface Greet {
    void greet();
}

interface Talk {
    void talk();
}

class Morning implements Greet, Talk {
    public void greet(){
        System.out.println("おはよう！");
    }

    public void talk(){
        System.out.println("いい天気ですね。");
    }
}

class Meet {
    public static void main(String[] args){
        Morning morning = new Morning();
        morning.greet();
        morning.talk();
    }
}