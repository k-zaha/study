/*�C���^�[�t�F�[�X�̃��\�b�h�ɁA�������e��\�ߒ�`����ꍇ
�@�ydefault�C���q���g�p����ꍇ�z
   default�C���q�����\�b�h�ɒ�`���Ă����΁A���������N���X�Ń��\�b�h���I�[�o�[���C�h���Ȃ��Ă��g�p���邱�Ƃ��ł���B
   default�́A�C���^�[�t�F�[�X���Œ�`����ۂɁApublic default void ���\�b�h��() {�`�@�ƋL�ڂ��鎖�Œ�`�t�����\�B

  �ystatic�C���q���g�p����ꍇ�z
    ���\�b�h���`����ۂ�static�C���q�����Ă����΁A�C���X�^���X�����Ȃ��Ă��A�u�C���^�[�t�F�[�X.���\�b�h���v�̌`���ŌĂяo�������ł���B
    static�C���q�́A�C���^�[�t�F�[�X���Œ�`����ۂɁApublic default void ���\�b�h��() {�`�@�ƋL�ڂ��鎖�Œ�`�t�����\�B
*/

interface Greet1 {
    void greet();
}

interface Greet2 {
    public default void afternoon() {
        System.out.println("����ɂ���");
    }
}

interface Greet3 {
    static void evening(){
        System.out.println("����΂��");
    }
}

class Greeting implements Greet1, Greet2 {
    public void greet() {
        System.out.println("���͂悤");
    }
}

class Say{
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.greet();
        g.afternoon();
        Greet3.evening();

    }
}