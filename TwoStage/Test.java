import java.io.*;


/*�\�[�X����
  �V�тō���Ă݂��B
  jpeg�t�@�C����ǂݍ���ł���Ȃ��B�@�����f�B���N�g���ɂ���̂ɁB(usoyo.jpeg)
  �R���p�C���͉\�Bdat�t�@�C���͓ǂݍ��݂��\�Bjpeg��ǂݍ��ނƂ��ɂ͕ʂɏ������K�v�H
*/
class Test {
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("usoyo.jpeg");
            int c;
            c = in.read();

            in.close();
        
            FileOutputStream out = new FileOutputStream("file4.dat");
            out.write(65);
            out.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }

}