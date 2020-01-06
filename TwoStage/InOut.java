import java.io.*;
/* �\�[�X����


    ���V�Z�p
    InputStreamReader�N���X�@�iReader�N���X�̃T�u�N���X�j
    �I�u�W�F�N�g�𐶐����邱�ƂŁA�ǂݍ��񂾃o�C�i���f�[�^�̃t�@�C���𕶎����͂ɕϊ�����B
    �����ɁA�o�C�i���t�@�C����ǂݍ��񂾃I�u�W�F�N�g���w�肷�邱�ƂŁA���p�\�B
    FileInputStream�Ńo�C�i���t�@�C����ǂݍ��񂾌�AInputStream���w�肷�邱�ƂŁA�����f�[�^�ɕϊ�����B

    OutputStreamWriter�N���X �iWriter�N���X�̃T�u�N���X�j
    �I�u�W�F�N�g�𐶐����邱�ƂŃo�C�i���o�͂𕶎��o�͂ɕϊ�����N���X�B
    �����ɁA�o�C�i���f�[�^�������o���I�u�W�F�N�g���w�肷�邱�ƂŁA���p�\�B
    (�C���[�W�I�ɂ́AFileOutputStream�Ńo�C�i���t�@�C���𐶐�������AOutputStreamWriter�ł���𕶎��f�[�^�ɕϊ����銴���B)

    

*/

class InOut {
    public static void main(String[] args){
        try{
            String filename = "file.dat"; //�ϐ�filename�ɓǂݍ��݂Ə����o���ioutput��input�j����t�@�C���̖��O��ϐ��Ɋi�[�B

            FileOutputStream out = new FileOutputStream("filename");//�o�C�i���t�@�C���𐶐�
            FileInputStream inFile = new FileInputStream("filename");//���������o�C�i���t�@�C����ǂݍ���
            InputStreamReader in = new InputStreamReader(inFile);//input����file.dat���o�C�i�����當���f�[�^�ɕϊ��B(�o�C�i���˕�����)

            //out:��������t�@�C���@inFile�F���������t�@�C���̓ǂݍ��݁@in�FinFile�œǂݍ��񂾃t�@�C���𕶎��ɕϊ�

            /* ------------------------------------------------------------------------------------------------- *\
                ��L�ŁA�o�C�i���t�@�C���̐����A�ǂݍ��݁A�ϊ�(�o�C�i���˕���)���s�������A
                �X�g���[���͂܂����Ă��Ȃ��̂ŁA���̏����̏ڍׂ��A���L�Ŏw�肵�Ă����B
            \* ------------------------------------------------------------------------------------------------- */
 
            //<����> ��ɏ����o�����e���L�ڂ��Ă���A�o�C�i���̒��g�̎擾���\���������s���B�@���Ԃ����̂��́B
            
            for(byte i = 1; i <= 10; i++) {  //�������ǂݍ��݂��s���A"file.dat"�ɏ����o�����e���L�ځB
                out.write(i); 
            }

            int c;
            while((c = in.read()) != -1) {  //"InputStreamReader"�Ńo�C�i�����當���������t�@�C���̒��g���擾���\���B
                System.out.print(c + " ");  
            }

            //�X�g���[�������
            in.close();
            out.close();

            //��O�����@�t�@�C����ǂݍ��݂ł��Ȃ������ꍇ�B
        } catch(IOException e) {
            System.out.println("�t�@�C��������܂���B");
        }
    }
}