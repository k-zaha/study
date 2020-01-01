/*オーバーロード
オーバーロードとは、同一のクラス内に、データ型や数など引数が異なる同名のメソッドを複数作る事。
オーバーロードすれば、メソッド呼び出し時に、その引数の内容に適するメソッドが自動的に呼び出される。  
 */

class Cat {
    String name;
    String place;
    int age;

    void setData (String n, String p, int a){
        name = n;
        place = p;
        age = a;
    }

    void print (){
        System.out.println(place + ":" + name + " " + age + "歳");
    }

    void print(String p, int a){
        place = p;
        System.out.println(place + ":ねこは" + a + "匹です。");
    }

    void print(String variety){
        System.out.println(place +  ":" + name + " " + age + "歳" + variety);
    }
}

class Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.setData("ロビン", "うち", 10);
        cat2.setData("ちび", "となり", 14);
        cat1.print("雑種");
        cat2.print();
        cat3.print("うら", 0);

    }
}