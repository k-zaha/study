/* �\�[�X����
    Hello�N���X�Ƃ��̃I�u�W�F�N�ghello���쐬���Ahello�I�u�W�F�N�g���V���A���C�Y���ăt�@�C���ɕۑ�����B
    ���t�@�C����FileOutputStream�ŗp�ӁB
    �ۑ�����hello�I�u�W�F�N�g���A�ۑ������t�@�C������ǂݍ��݁A�f�V���A���C�Y���āA�ʂ̕ϐ��Ɋi�[�B
    ���̕ϐ����f�V���A���C�Y��A�i�[���������ʂ̕ϐ����ŌĂяo���AHello�N���X�̃��\�b�h���g�p����v���O�����B

    ���V�Z�p
    �V���A���C�Y�F�I�u�W�F�N�g���r�b�g�񉻂��邱�ƁB
    �f�V���A���C�Y�F�V���A���C�Y�����I�u�W�F�N�g�����ɖ߂����ƁB
    �I�u�W�F�N�g���r�b�g�񉻂��邱�Ƃɂ���āA�C���X�^���X�f�[�^���t�@�C���ɕۑ����Ă������Ƃ��ł���B
    ==�v���O�����I��������i�v�I�ɃC���X�^���X�̏����c���Ēu����B

    �V���A���C�Y���g�p����ɂ́A�N���X��Serializable�C���^�[�t�F�[�X����������B
    Serializable�C���^�[�t�F�[�X�ɂ́A���\�b�h���Ȃ��ׁA���\�b�h�̃I�[�o���C�h�s�v�B
*/

import java.io.*;

class Hello implements Serializable { //Serualizable��implements���邱�ƂŁA�I�u�W�F�N�g�̃V���A���C�Y�A�f�V���A���C�Y���\�ƂȂ�B
    void check(){
        System.out.println("����ɂ���");
    }

} 


public class SerialSteram {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.check();

        try{
            FileOutputStream outFile = new FileOutputStream("Serialcheck.dat");//�I�u�W�F�N�g�f�[�^��ۑ�����t�@�C�����쐬�B
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);//byte��̏�ԂŃI�u�W�F�N�g�̃f�[�^��ۑ�����B
            outObject.writeObject(hello); //�I�u�W�F�N�g���t�@�C���ɏ������ށB
            outObject.close();
            outFile.close();


            FileInputStream inFile = new FileInputStream("serialcheck.dat");//�I�u�W�F�N�g��ۑ������t�@�C����ǂݍ��ށB
            ObjectInputStream inObject = new ObjectInputStream(inFile); //�I�u�W�F�N�g��ǂݍ��ށB
            Hello chkhello = (Hello)inObject.readObject(); /*37�s�ڂŃG���[�f���̂ŁA������(chkHello��chkhello)�ɂ��Ă݂��B

                                                             �I�u�W�F�N�g��ϐ��ɓ��ꍞ��ł���B�@�I�u�W�F�N�g��read�݂����ȃC���[�W
                                                             readObject�̓I�u�W�F�N�g�����̕ϐ���Ԃ��̂ŁA()�łǂ̃N���X��
                                                             �I�u�W�F�N�g�����w�肵�Ȃ��ƍs���Ȃ��B�@�L���X�g*/
            inObject.close();
            inFile.close();
            chkhello.check(); //�f�V���A���C�Y�����I�u�W�F�N�g�́Achkehello�ɓ��ꍞ�񂾂̂ŁA�I�u�W�F�N�g����chkhello��
                              //�C���X�^���X������Ă���B���ׁ̈Achkhello�̃��\�b�h�Ƃ��āAcheck���Ăяo���B
        

        } catch(IOException ioe){
        } catch(ClassNotFoundException e){
        }

    }

}
