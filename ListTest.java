import java.util.*;

class ListTest {

    /* ArrayList�͔z��̂悤�ɃI�u�W�F�N�g���i�[���邱�Ƃ��ł���R���N�V�����N���X�B

        �N���X�Ȃ̂ŁAArrayList�̃N���X���C���X�^���X�𐶐����邱�ƂŁA
        ���̃N���X���̃��\�b�h���g�p���邱�Ƃ��ł���悤�ɂȂ�B

        ���R���N�V�����N���X�̃��\�b�h��ၟ
        add(0, a) == 0�s�ڂ�a�̒l��ǉ�����B
        set(1, d) == 1�s�ڂ̒l��d�ɕύX����B

    */

    
    /*�R���N�V�����N���X���g�p����Ƃ���

        �R���N�V�����N���X�́A�f�[�^�^�����܂��Ă��Ȃ��̂ŁA��`����Ƃ���
        �f�[�^�^��<>�ł͂��݁A��`���Ȃ��Ƃ����Ȃ��B
        ��) ArrayList<Integer> int = new ArrayList<Integer>();

        �R���N�V�����N���X���g�p����ꍇ�Ajava.util�p�b�P�[�W��import����
        �K�v������B�@��jimport java.util.*;
    */
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        String a = "a", b = "b", c = "c", d = "d";
        System.out.println(lst);
        lst.add(a);
        lst.add(b);
        lst.add(c);
        System.out.println(lst);

        lst.add(2, d);
        System.out.println(lst);

        lst.set(1, d);
        System.out.println(lst);
    }
}