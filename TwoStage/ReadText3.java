/*�\�[�X����
    ���\�[�X�t��try�����g�p���A�utry���錾��()���ɓ��͂����t�@�C���I�[�v���������A�����N���[�Y����B�v�Ƃ����@�\���������Ă݂��B
    �\�[�X�I�ՂŃt�@�C���̃N���[�Y���ʂɏ����Ȃ��čςނ̂ŁA�R�[�h���X�b�L��������B

    ���v���O�����̓��e�́AFileReader�œǂݍ���text�t�@�C�����A�R�}���h�v�����v�g�ɏo�͂�����́B
*/


import java.io.*;

class ReadText3 {
    public static void main(String[] args) {
        try(FileReader in = new FileReader(args[0])) {
            int c;
            String s = new String();
            
            while((c = in.read()) != -1){
                s = s + (char)c;
            }
            System.out.println(s);

        } catch(IOException ioe) {
            System.out.println("�t�@�C��������܂���B");
        } catch(Exception e){
            System.out.println("�R�}���h���C������������܂���B");
        } //��L��try�錾���ɃI�[�v������t�@�C���̏������`���Ă���̂ŁA��O�����I�����Ɏ����I�Ƀt�@�C�����N���[�Y����B

    }
}