import java.io.*;
/*�\�[�X����
    �����ăQ�[���B

    ���V�Z�p
    BufferedReader�N���X
    �I�u�W�F�N�g�𐶐�����ƁA�s�P�ʂŃf�[�^��ǂݍ��ނ��Ƃ��ł���B
    ������Reader�N���X�̃I�u�W�F�N�g�����邱�ƂŎg�p�\�B

    FileReader�N���X�Ƃ̈Ⴂ�́AFileReader��1��������text��ǂݍ��ނ̂ɑ΂��A
    BufferedReader�́A�e�L�X�g�f�[�^��1�s���ǂݍ��ނ��߁A�������ǂ��B

    System.in�Ƃ́H
    System�N���X�̃I�u�W�F�N�g�BStream�̓��͂��ꂽ�l���Ǘ�����B

    String �ϐ� = �I�u�W�F�N�g��.readLine�@�L�[�{�[�h������͂����������A�ϐ��Ɋi�[����B) 
    �ϐ�b = Integer.parseInt(�ϐ�a);�@String�^�̕ϐ�a��int�^�ɕϊ����Aint�^�̕ϐ�b�Ɋi�[�B

    �A�E�g�v�b�g�Ƃ��āA��`�O�̐������������ꍇ�A�ēx�������͂����߂���悤�v���O�������e��ύX�B
*/
class NumberGame {
    public static void main(String[] args){
        
        try{
            BufferedReader ko = new BufferedReader(new InputStreamReader(System.in));
            int a,b =7; //�����@==�@b�Ɋi�[����Ă��鐔��
            System.out.println("���O����͂��Ă�������");
            String name = ko.readLine(); //�L�[�{�[�h������͂��ꂽ�e�L�X�g�f�[�^��name�Ɋi�[����B

            int sa = 0;
            while(sa == 0){
                System.out.println("�����ăN�C�Y�I0����9�̐�������͂��Ă�");
                String c = ko.readLine();
                a = Integer.parseInt(c); //String�^�̈�����int�^�ɕϊ�

                if(a > 9 || a < 0){
                    System.out.println("���������ĉ�����");
                    continue;
                }else{
                
                    while(a != b) {
                        if((a == b-1) || (a == b+1)){
                          System.out.println("�������I");
                        } else if(a > b+1){
                          System.out.println("�����Ə��������ł�");
                        } else if(a < b-1){
                          System.out.println("�����Ƒ傫�����ł�");
                        }
                        c = ko.readLine();  //�����̓��꒼��
                        a = Integer.parseInt(c);
                    }
                    System.out.println("�����I" + name + "����A���߂łƂ��I�I");
                    sa++;
                } 
            }
        }catch(Exception ie) {
            System.out.println("�G���[�ł�");
        }
            
    }
}