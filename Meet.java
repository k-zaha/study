/*�C���^�[�t�F�[�X�ɂ��āB
    �y�C���^�[�t�F�[�X�z
    �p���֌W�̂Ȃ��N���X�ɑ΂��āA���\�b�h��t�B�[���h��񋟂���d�g�݁B
    �C���^�[�t�F�[�X�̐���͉��L�̂Ƃ���B

    �������o�̐���
    �E�t�B�[���h�͕K���A�萔(�C���qfinal�����ϐ�)�ɂȂ�B
    �E���\�b�h�͕K���A���ۃ��\�b�h�ɂȂ�B

    ���[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[��
    �t�B�[���h�͒萔�ɂȂ�̂ŁA�@public static final �f�[�^�^ �ϐ���;
    ���\�b�h�͒��ۃ��\�b�h�Ȃ̂Ł@public abstract void ���\�b�h��();

    �Ƃ����`�ŋL�ڂ��Ȃ��Ƃ����Ȃ����A���L�̌`�ɏȗ����ł���B

    �t�B�[���h�@�f�[�^�^ �ϐ���; �܂���  �f�[�^�^ �ϐ��� = �l;
    ���\�b�h�@�@void ���\�b�h��();
    ���[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[��

    �܂��A�C���^�[�t�F�[�X���`����Ƃ��́Ainterface�A
    ��������Ƃ��́Aimplements���g�p����B

    
    ���[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[��
    //�C���^�[�t�F�[�X�̒�`(�C���^�[�t�F�[�X����Inter�̏ꍇ)
    interface Inter{
        int suuzi = 0;
        void mesod();
    }

    //�C���^�[�t�F�[�XInter�����������N���X�̒�`�B
    class Hoge implements Inter{
        public void mesod(){
            Syssem.out.println("Hello"); 
         ��
        �y�I�[�o�[���C�h�̍ۂ̓��\�b�h��public������z
        }
    }
    ���[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[�[��
*/


interface Greet {
    void greet();
}

interface Talk {
    void talk();
}

class Morning implements Greet, Talk {
    public void greet(){
        System.out.println("���͂悤�I");
    }

    public void talk(){
        System.out.println("�����V�C�ł��ˁB");
    }
}

class Meet {
    public static void main(String[] args){
        Morning morning = new Morning();
        morning.greet();
        morning.talk();
    }
}