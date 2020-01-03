//package Test2;

class Test {
    String subject;  //教科名
    int point; //得点

    void setPoint(String s, int p){ //得点を設定するメソッド
        subject = s;
        point = p;

    }

    String getPoint(){  //1教科の得点を得るメソッド
        return subject + "：" + point;
    }
}

class Student {
    int id; //フィールド　生徒の番号
    String name; //フィールド　生徒名
    int subnum; //教科数
    Test[] test; //Testクラスの持っている設定情報を教科数分入れ込むため、配列用意。
                 //TestクラスのsetPointメソッドと、getPointメソッドで(教科:点数)の表示が可能となる。

    Student(int i, String n, int s){ //コンストラクタ
        id = i;
        name = n;
        subnum = s;
        test = new Test[s];
        for(int j = 0; j < s; j++){
            test[j] = new Test(); //testクラスのオブジェクトという属性を、Test配列に教科数分追加している。
        }
    }

    String getName(){ //名前を得る
        return id + "：" + name;
    }

    int getGrade() { //getGrade ※総合点を得る版
        int sum = 0; //総合点のフィールド
        for(int i = 0; i < subnum; i++) {
            sum += test[i].point;
        }
        return sum;
    }

    //メソッドのオーバーロード  getGrade ※5段階評価を得る版
    int getGrade(int a) { //5段階評価を得る
        int base = 100 * subnum / a;   //教科数×100÷5(5段階評価の場合)が評定のベースになる。　
        int rank = getGrade() / base + 1;
        // ↑ 総合点を評定ベースで割って5段階評価を行う。
        //0～59：1 60～119：2 120～179：3　180～239：4　240～300：5
        
        /*【注意点！】総合点を評定ベースで割っただけの値にしてしまうと、1ずれる。
           (59÷60=0 ?総合59点評定１ 239÷60=3 ?総合239点評定3になる)為、割った
           値に1を足さないといけない。

           総合点が300(満点）になると逆に5+1=評定6になってしまうので、
           return(63行目)でrankが5を超えるときに、5を入れ込むswith文を用意しておく。
        */

        //System.out.println("subnum：" + subnum + " base：" + base + " 総合点：" + getGrade() + " rank：" + rank);
        return (rank > a) ? a : rank;   //rankがaより大きい場合はaを、それ以外はrankを返す。
    }

    void printScore() {
        System.out.println(getName());
        for(int i = 0; i < subnum; i++){
            System.out.print(test[i].getPoint() + " ");
        }
        System.out.println();
        System.out.println("総合点" + getGrade());
        int rank = 5;  //rankの初期値を代えれば評価の段階が変わる。(5で設定しているから5段階評価)
        System.out.println(rank + "段階評価" + getGrade(rank));
        System.out.println();
    }
}

class classroom{
    public static void main(String[] args) {
        Student taro = new Student(12, "taro", 3);
        taro.test[0].setPoint("国語", 95);
        taro.test[1].setPoint("数学", 83);
        taro.test[2].setPoint("英語", 76);
        taro.printScore();

        Student jiro = new Student(7, "jiro", 3);
        jiro.test[0].setPoint("国語", 66);
        jiro.test[1].setPoint("数学", 97);
        jiro.test[2].setPoint("英語", 72);
        jiro.printScore(); 
        //System.out.println (400/5);

        Student saburo = new Student(3, "saburo", 3);
        saburo.test[0].setPoint("国語", 46);
        saburo.test[1].setPoint("数学", 87);
        saburo.test[2].setPoint("英語", 92);
        saburo.printScore(); 


        
        Student siro = new Student(4, "siro", 3);
        siro.test[0].setPoint("国語", 98);
        siro.test[1].setPoint("数学", 100);
        siro.test[2].setPoint("英語", 99);
        siro.printScore(); 
        
        Student goro = new Student(5, "goro", 3);
        goro.test[0].setPoint("国語", 100);
        goro.test[1].setPoint("数学", 100);
        goro.test[2].setPoint("英語", 100);
        goro.printScore(); 

        Student baka = new Student(53, "baka", 3);
        baka.test[0].setPoint("国語", 0);
        baka.test[1].setPoint("数学", 0);
        baka.test[2].setPoint("英語", 0);
        baka.printScore(); 
    }
}