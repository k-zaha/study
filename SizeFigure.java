/*
    抽象クラスFigureと、それを継承するクラスSquare、Circleを用意。

    Square == 四角形の面積と外周を表す。
    コンストラクタを利用し、インスタンス生成時に、四角形の横と縦を読み込む仕組みとなっているが、
    コンストラクタをオーバーロードし、正方形の場合は、引数1個で自動的に縦、横サイズが読み込まれるようになっている。

    Circle == 円の面積と外周を表す。
    コンストラクタを利用し、インスタンス生成時に円の直径を読み込む仕組みとなっている。
    円周率3.14は不変なので、Circleクラスでフィールド定義時にfinal修飾子を付けて、定数化。

    
    実行クラスSizeFigureにて、
    インスタンス生成の宣言はFigureクラス、データ型の宣言はサブクラスのSquareやCircleを指定しているが、
    インスタンス生成の宣言をサブクラスで行っても問題ない。

    スーパークラス側でインスタンス生成の宣言を行うと、別の型に変更しようとした際に、元のデータに手を加える必要がない。
    というメリットがある。
    しかし、インスタンス生成の宣言をサブクラスで行うと、サブクラス側にしかないメソッドやフィールドを使いやすい
    メリットがある。

    
*/

abstract class Figure {
    abstract void area();  //面積
    abstract void around(); //外周

    void measure() {
        area();
        around();
        System.out.println();
    }
}

// 抽象クラスのサブクラスsquare
class Square extends Figure {
    double side;
    double height;

    Square(double s){  //Squareのコンストラクタ
        side = height = s;
    }

    Square(double s, double h){ //コンストラクタのオーバーロード
        side = s;
        height = h;
    }

    void area() { //抽象メソッドのオーバーライド
        System.out.println("四角形の面積：" + (side * height));
    }

    void around() { //抽象メソッドのオーバーライド
        System.out.println("四角形の外周：" + (2 * (side * height)));
    }
}

class Circle extends Figure {
    final double pi = 3.14;
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() { //抽象メソッドのオーバーライド
        System.out.println("円の面積：" + (radius * radius * pi));
    }

    void around() { //抽象メソッドのオーバーライド
        System.out.println("円の外周：" + (2 * radius * pi));
    }
    void nmethod(){
        System.out.println("テストデータ");
    }
}


class SizeFigure {
    public static void main(String[] args) {
        Figure fig1 = new Square(2.5);
        Figure fig2 = new Square(2.3, 3.7);
        Figure fig3 = new Circle(3.6);
        //Figure fig4 = new Circle(5);
        fig1.measure();
        fig2.measure();
        fig3.measure();
        fig3.nmethod();
        //Circleクラスで新たに定義した、nmethodは、定義がなされていない親クラスの
        //Figureでオブジェクトの宣言をする(84列目)と、エラーが出る。(コンパイルと実行はできる。)
        //fig4.measure();
        System.out.println();
    
    }
}