import java.util.Scanner;

/* Scannner�N���X�Ƃ�
    �L�[�{�[�h���͂��T�|�[�g����N���X�B
    Scanner�N���X�̃I�u�W�F�N�g���쐬���邱�ƂŎg�p�\�B
    �L�[�{�[�h����̓��͂������ɂƂ�ꍇ�́A"System.in"���g�p����B
    Scanner�N���X�̃I�u�W�F�N�g�Ɋi�[�����f�[�^�́Anext()���\�b�h���A
    Integer�^�̃f�[�^�̏ꍇ��nextInt()���\�b�h�ŁA�ϐ��Ɋi�[�ł���B

    
*/
class ScannerSample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("�w������͂��Ă��������F");
        String stName = sc.next();
        System.out.println("�z�[���ԍ�����͂��Ă��������F");
        int hNum = sc.nextInt();

        sc.close();


        System.out.println(stName + "�w��" + hNum +"�ԃz�[���ő҂��Ă��܂�");
    }
}
