/*
    FileWriter�N���X���g�p���āAText�t�@�C���̓��e�������Atext�t�@�C���𐶐�����B 
    FikeWriter�N���X�̓I�u�W�F�N�g�𐶐�����Ƃ��ɁA��������e�L�X�g�t�@�C���̖��O(�Ɗg���q)���`�ł���B
       FileWriter �I�u�W�F�N�g�� = new FileWriter("��������t�@�C����.�g���q");
    newWriter���g�p�����ꍇ�Atext�t�@�C����java�t�@�C���Ɠ����f�B���N�g���ɐ��������B

    System�N���X��getProperty���\�b�h�F�i""�j�̒���String�^�łق����v���p�e�B���w�肷�邱�ƂŁA���̃f�[�^��
    �擾���Ă����B�@��jSystem.getProperty("line.separator");�̏ꍇ�Aos���Ƃ̉��s�R�[�h���擾����B
    getProperty�̈����ɖ����Ȓl������ƁAnull���Ԃ����B

    out.write���\�b�h�F�����Ɏw�肵�������f�[�^���e�L�X�g�f�[�^�ɏ������ށB
    

*/

import java.io.*;

class WriteText {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("�e�X�g�f�[�^.txt");//�I�u�W�F�N�g�������ɁA�t�@�C�����̎w��܂ōs���B
            String str = System.getProperty("line.separator"); //os���Ƃ̉��s�R�[�h��getProperty�Ŏ擾�B�ϐ�str�Ɋi�[�B
            int a  =  10, b = 5;
            out.write("���@�F");
            out.write(a + "+" + b + "=" + (a+b) + str);
            out.write("���@�F");
            out.write (a + "-" + b +"=" + (a-b) + str);
            out.write ("�e�X�g�f�[�^���悧�����I�I");
            out.close(); //FileWriter(�X�g���[��)�����
        } catch(Exception e) {
            System.out.print(e);
        }


    }
}
