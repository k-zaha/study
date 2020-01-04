/* �T�u�N���X�̃I�u�W�F�N�g���X�[�p�[�N���X�̃I�u�W�F�N�g�ɑ������B
    �T�u�N���X�̃I�u�W�F�N�g�̓X�[�p�[�N���X�̃I�u�W�F�N�g�ɑ�����邱�Ƃ��ł���B
    �t�͕s�B
    
    �T�u�N���X�̃I�u�W�F�N�g���X�[�p�[�N���X�̃I�u�W�F�N�g�Ƃ��đ�����邱�ƂŁA
    �X�[�p�[�N���X�Œ�`����Ă��钊�ۃ��\�b�h���A�T�u�N���X���Œ�`(�I�[�o�[���C�h)���ꂽ�A
    �����̓��e�Ɋ�Â����s���邱�Ƃ��\�ƂȂ�B
*/

abstract class Calc2 {
    int a;
    int b;

    abstract int result();

    void printResult() {
        System.out.println(result());
    }

    void setData(int m, int n) {
        a = m;
        b = n;
    }
}

class Plus extends Calc2 {
    int result() {return a+b; }
}

class Minus extends Calc2{
    int result() {return a-b; }
}

class Calculation2 {
    public static void main(String[] args) {
        int x = 54, y = 12;
        Calc2 calc1 = new Plus();
        Calc2 calc2 = new Minus();
        calc1.setData(x, y);
        calc2.setData(x, y);
        System.out.print(x + "+" + y + "=");
        calc1.printResult();
        System.out.print(x + "-" + y + "=");
        calc2.printResult();
    }
}