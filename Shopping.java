class Purse {

    /* ��static �C���q�ɂ��ā�
      static �C���q��t�����t�B�[���h�̒l�̕ύX�͓���N���X�̃I�u�W�F�N�g���ł��ׂāy���L�z�����B
      (Abc�N���X�Ƀt�B�[���hint a�ƃI�u�W�F�N�gb�Ac������A�t�B�[���ha��1000����`�����ƁA
      b����a���Ă�ł��Ac����a���Ă�ł����̒l��1000�ɂȂ�B)


      static �C���q��t�������\�b�h�́A�i�[����Ă���N���X���C���X�^���X�𐶐����ĂȂ��Ă�
      �Ăяo�����Ƃ��ł���B�������Astatic���\�b�h�ɂ͉��L�������������B

        ��static���\�b�h
        �E��static���\�b�h�ł̓I�[�o�[���C�h���ł��Ȃ��B
        �Estatic���\�b�h���ŎQ�Ƃ��郁�\�b�h��t�B�[���h��static�łȂ���΂Ȃ�Ȃ��B
        �E���̃I�u�W�F�N�g����Q�Ƃ���Ƃ��́A�N���X��.static���\�b�h��(); �ŌĂяo�����Ƃ��ł���B
        �@(�ʏ�̃��\�b�h�́@�I�u�W�F�N�g��.���\�b�h��();  �ł�т�����)

    */

    static int money = 0;
    
    void printMoney(int in, int out){
        money = money + in - out;
        if(money < 0){
            System.out.println(-1 * money + "�~����܂���");

        } else {
            System.out.println("�c����" + money + "�~�ł��B");
        }
    }
}

class Shopping {
    public static void main(String[] args) {
        Purse store1 = new Purse();
        Purse store2 = new Purse();
        store1.printMoney(1000, 100);
        store2.printMoney(0, 250);
        store1.printMoney(0, 800);
    }
}