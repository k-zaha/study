/* �C���^�[�t�F�[�X�̌p��
    extends == �N���X��C���^�[�t�F�[�X���p������Ƃ��Ɏg���B
    implements == �N���X�ɃC���^�[�t�F�[�X����������Ƃ��Ɏg���B

    �P���`������interface��ʂ�interface�Ɍp�����鎖���\ �� extends���g�p����B
    �N���X�ɑ��N���X���p�����A�C���^�[�t�F�[�X���������鎖���\�B
    ���̍ۂ�class Aclass extends Bclass inplements Intera, Interb {�@�` ��
    �N���X���`����Bextends���ɏ����̂��|�C���g�B
*/

interface Greet {
    void greet();
}

interface Bye extends Greet {
    void bye();
}

class Greeting implements Bye {
    public void greet() {
        System.out.println("����ɂ��́I");
    }

    public void bye() {
        System.out.println("���悤�Ȃ�B");
    }
}

class Meet2 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.bye();
    }
}