class DoWhile{

    public static void main(String[] args){
        /*while��
          while(����){}�̏�����true�̊Ԃ����A{}���ɋL�ڂ����������J��Ԃ��s���B
          for�ƈႢ�A�J�E���^(a++)���Ȃ��B��ɁA�J��Ԃ������s����ȏꍇ�Ɏg�p����B
        */

        /*do �` while��
          while���̑O��do���L�����āAdo �`�@while�ŌJ��Ԃ��������͂��ނ��Ƃɂ���āA
          while�ŌJ��Ԃ������̑��s�۔��肷��O�ɁA��x�A�������s���B
          ���̂��߁A�ŏ���������O�ł��A�K��1�x�͏���������悤�ݒ�ł���B
        */

        int s =0, i =0;

        do{
            i = ++i;  
            s = s + i;
            System.out.println("i=" + i + " s=" + s);
        }while(i < 10);
        System.out.println(
            "1����" + i + "�܂ł̘a��" + s);
        
    }
}
