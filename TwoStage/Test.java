import java.io.*;


/*�\�[�X����
  �V�тō���Ă݂��B
  jpeg�t�@�C����ǂݍ���ł���Ȃ��B�@�����f�B���N�g���ɂ���̂ɁB(usoyo.jpeg)
  �R���p�C���͉\�Bdat�t�@�C���͓ǂݍ��݂��\�Bjpeg��ǂݍ��ނƂ��ɂ͕ʂɏ������K�v�H �ˉ����@usoyo.jpeg����������jpeg����Ȃ������B


  �g���Ă���V�Z�p
  FileInputStream (inputStream�N���X�̎q�N���X)
  �I�u�W�F�N�g�𐶐����邱�ƂŁA�o�C�i���t�@�C�����v���O�����ɓǂݍ��ނ��Ƃ��ł���B

  FileOutputStream (OUtputStream�N���X�̎q�N���X�j
  �I�u�W�F�N�g�𐶐����邱�ƂŁA�o�C�i���t�@�C�����v���O������ŏ����o���A�������邱�Ƃ��ł���B


  jpeg�t�@�C����ǂݍ��݁A���O��ύX���Ă܂����������f�[�^(�R�s�[)���o�͂��������A�o�͕��@���s���B
*/
class Test {
    public static void main(String[] args){
        try{
          //*
            FileInputStream in = new FileInputStream("nyannyan.jpg");//�����̃o�C�i���t�@�C��"nyannyan.jpg"�̓ǂݍ��݁B
            int c;
            String cs;
            while((c = in.read()) != -1){
              cs = cs + (char)c;
            }
            in.close();
          //*/
            FileOutputStream out = new FileOutputStream("file4.jpg");
            out.write(cs); //�o�C�i���t�@�C���̏����o��write���\�b�h�ɃX�g�����O�^���g���Ȃ��̂ŁA�G���[��f�����܁B�ꎞ�I���B
            out.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }

