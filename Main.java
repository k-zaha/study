class Main{
    /* main�N���X��args�́A�R�}���h���C�����java �v���O�������@�`�Ńv���O�������N������ہA
       �`�̕����ɁA��������ꂽ�ꍇ�A���̈����̓��C���Ŏw�肳��Ă���String[] �܂���String...�̕ϐ��@
       args�Ɋi�[�����B

       ���ׁ̈Aargs�����C���N���X���ŌĂяo���΁A�R�}���h���C����œ��͂����������g�p���鎖���\�ł���B
    */

    public static void main(String... args){
        int i;

        if(args.length == 0){
            System.out.println("�R�}���h���C������������܂���B");
        } else {
            for(i = 0;i < args.length; i++){
                System.out.println((i+1) + "�F" + args[i]);
                if(i == 8){
                    break;
                }
            }
        }
    }
}