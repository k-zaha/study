class Fora{
    /*for���̊g�������g�p
    �@for��for(int a = 0;a < 3;a++) �`�@�ł͂Ȃ��A
    �@for(�^�� a : �����̔z��ϐ��@b)�`�ɂ��邱�ƂŁA
    �@���̔z��ϐ��ɓ����Ă���v�f�����A�J��Ԃ��������s���Ƃ������������\�B
    �@���̏ꍇ�AString�^�̃t�B�[���h��ێ������z��ł�for�����񂷎����ł���B*/


    public static void main(String[] args){
        String[] season = {"�t", "��", "�H", "�~"};

        for (String s : season){
            System.out.println(s);
        }
    }
}