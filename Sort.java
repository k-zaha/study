import java.util.*;
class Sort{
    public static void main(String[] args){
        //�ϐ������@a:�z��f�[�^ b:�z��a�̗v�f�����L���@k:��� j:�\�[�g�J�E���^���\�[�g�O�����@i:�\���̃J�E���^���\�[�g��됔��(j�{�P)
        int a[] = {210, 19, 72, 129, 34};
        int b = a.length;
        int i, j, k;
        
        //�\�[�g�O�̃f�[�^�\��
        System.out.println("�f�[�^�̕\��");
        for(i = 0;i < b;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        //�\�[�g �\�[�g���̃R�����g�A�E�g�O������A�\�[�g���̒l�̓������킩��B
        for(j = 0; j < b-1;j++){
            for(i = j+1; i < b; i++){
                //System.out.println("j=" +j+ " i="+i);
                if(a[j] > a[i]){
                    k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
                //System.out.println("a[j]=" +a[j]+ " a[i]="+a[i]);
                //System.out.println(Arrays.toString(a));
                //System.out.println();
            }
        }
        //�\�[�g��f�[�^�\��
        System.out.println("���ёւ���̃f�[�^�̕\��");
        for(i = 0;i < b;i++){
            System.out.print(a[i] + " ");
        }

        
    }
}