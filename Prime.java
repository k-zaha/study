import java.util.*;
class Prime{
    public static void main(String[] args){
        int max = 100; //�f����T�����̍ő�l
        boolean[] a = new boolean[max]; //�f�����ǂ����𔻒肷��z��

        //�z��̏�����
        for(int i = 0; i < max; i++){
            a[i] = true;
        }
        //System.out.println(Arrays.toString(a));

        //�f�����ǂ�������@�@�@�`�f�����Z�肷��������A�f���̔{�������O���邱�ƁB
        for(int i = 2; i < max; i++){// 1�͑f���ł͂Ȃ����߁A2����v�Z�B
            if(a[i-1]){ //15�s�ڂƁA17�s�ڂ�1�������Ă���̂͂��ꂼ��z��1�n�܂肾����B
                for(int j = 2; i*j <= max; j++){
                    a[i * j - 1] = false;
                }
            }
        }

        //�z��a��true false�̒l�����Ƃɑf����\�������Ă����B
        //26��1�𑫂��Ă���̂́A
        for(int i = 2; i < max; i++){
            if(a[i-1]){//i��max�܂ŃJ�E���g�A�b�v���Ă����Ai��true�̏ꍇ�Ai+1�̐�����\���B
                System.out.print(i + " ");//�z���ł�1==0�n�܂�ɂȂ�̂Ő����ŏo���Ƃ���1�𑫂��Ă���B
            }
        }
    }
}