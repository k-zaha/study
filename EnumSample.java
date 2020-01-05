import java.util.List;
import java.util.ArrayList;
enum Animal {Cat, Dog, Rabbit }

/*�񋓌^�@enum�Ŏ����Ńf�[�^�^���`����B
�@enum Animal{Cat, Dog, Rabbit} enum�̌��"Animal"�Ɛ錾���A�f�[�^�^"Animal"�𐶐��B
  Animal�^�ɂ́ACat, Dog, Rabbit��3��ނ̒l�����鎖���ł���B�t�ɂ���3��ވȊO�͓�����Ȃ��B

  �ŏ��ɁA�f�[�^�^�̖��O�ƁA�g�p����l���`���Ă����̂��́B

  ���\�b�h�̈�����ϐ��ɁA���̗񋓌^���g�p����ƁA�v���O���������₷���Ȃ�A�ԈႦ�ɂ����v���O������
  �������Ƃ��ł���B
*/

class Pet {
    private Animal kind;  //Private������A���̃t�B�[���h��Pet�N���X�����炵���Ăяo���Ȃ��B
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