abstract class Calc1 {
    /* ���ۃN���X�@���Ԑ��ɂ���

        �y���ۃN���X�z
        ���ۃ��\�b�h�F���\�b�h������`���A�����̓��e�𖢒�Ƃ��Ă������\�b�h�B
        �N���X���p�������T�u�N���X�ŏ������e���I�[�o�[���C�h���Ďg�p����B
        �N���X��`���A���ɏC���qabstract�����Ē�`�ł���B

        ���ۃN���X�́A���ۃ��\�b�h�����N���X�̂��ƁB
        ��`���A����abstract�����鎖�ŁA��`�ł���B

        

        �y���Ԑ��z
        �X�[�p�[�N���X�̃����o(�t�B�[���h�A���\�b�h)�́A�T�u�N���X�̃����o�Ƃ���
        �Ăяo�����Ƃ��ł���Ƃ��������B

        ���Ԑ���������Ɨ������A�g�����Ȃ����Ƃ��ł���悤�ɂȂ�ƁA���g������
        �x�񂾁A�v���O����������悤�ɂȂ�B
    */

    int a;
    int b;
    abstract void answer();

    void setData(int m, int n) {
        a = m;
        b = n;
    }
}

class Plus extends Calc1 {
    void answer(){
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}

class Calculation1 {
    public static void main(String[] args){
        Plus plus = new Plus();
        plus.setData(27, 32);
        plus.answer();
    }    
}