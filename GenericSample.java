import java.util.*;
/* Generic
    �N���X�̒�`���Ƀf�[�^�^��ϐ��Œ�`���Ă������B
    �C���X�^���X�������ɉ��߂āA�C�ӂ̌^���`����B
    �N���X��`�̎��_�ł́A�f�[�^�^�𒊏ۓI�ɒ�`�Â��Ă������Ƃ��ړI�B
*/
class GenericSample {
    public static void main(String[] args) {

        ArrayList<Integer> lst =new ArrayList<Integer>(); //<Interger>�ɂ����ArrayList�̃f�[�^�^��int�^�Ƃ��Ďw��B

        for(int i = 0; i < 5; i++) {
            lst.add(i * 3); //3�̔{���𒀎��ǉ��B
        }

        for(int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}