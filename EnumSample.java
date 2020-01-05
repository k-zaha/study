import java.util.List;
import java.util.ArrayList;
enum Animal {Cat, Dog, Rabbit }

/*列挙型　enumで自分でデータ型を定義する。
　enum Animal{Cat, Dog, Rabbit} enumの後に"Animal"と宣言し、データ型"Animal"を生成。
  Animal型には、Cat, Dog, Rabbitと3種類の値を入れる事ができる。逆にこの3種類以外は入れられない。

  最初に、データ型の名前と、使用する値を定義しておくのが肝。

  メソッドの引数や変数に、この列挙型を使用すると、プログラムが見やすくなり、間違えにくいプログラムを
  書くことができる。
*/

class Pet {
    private Animal kind;  //Privateだから、このフィールドはPetクラス内からしか呼び出せない。
    private String name;

    
    public Pet(Animal aml, String nm) {
        kind = aml;
        name = nm;

    }
    public Animal getKind(){
        return kind;
    }
    public String getName(){
        return name;
    }
}

class EnumSample {
    public static void main(String[] args){
        List<Pet> lst = new ArrayList<Pet>(3);
        lst.add(new Pet(Animal.Dog, "Suzukikun"));
        lst.add(new Pet(Animal.Cat, "Nyaomi"));
        lst.add(new Pet(Animal.Rabbit, "Tigger"));

        System.out.println(lst);
        for(Pet pt : lst) {
            
            if(pt.getKind() == Animal.Dog) {
                System.out.println("Dog name: " + pt.getName());
            }
        }

    }
}