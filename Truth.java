class Truth{

/*
�u? :�v���g�p����������s���\���B

�@�ϐ�A�@�� boolian�^�ϐ��@?�@�lB�@: �lC;

�@�Ƃ����Ƃ��ɁA
�@boolian�^�ϐ��̒l��true��������A:�̍����̒lB�A
�@boolian�^�ϐ��̒l��false��������A:�̉E���̒lC��
�@�ϐ�A�ɓ��ꍞ�܂��悤�ɂȂ��Ă���B

*/
    public static void main(String[] args){
        String right = "����", wrong = "�s����";
        boolean value;

        value = true;
        String answer = value ? right : wrong;
        System.out.println(answer);

        value = false;
        answer = value ? right : wrong;
        System.out.println(answer);

    }
}