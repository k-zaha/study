import java.io.*;

/* �\�[�X����
    �R�}���h���C�������ɓ��͂����p�P�ꂪ�A�ǂݍ��񂾃t�@�C�����̒��ɓ����Ă��邩���m�F���A�����Ă�����cmd�ɓ��{����Ԃ��B
    ���O�ɁA�ǂݎ��t�@�C��"mydic.txt"�ɁA�p�P��˓��{��ˉp�P��˓��{��ƌ��݂ɓ��͂��ۑ����Ă����B

    �y�V�Z�p�z
    equals();���\�b�h�E�E�E�@string�^�ϐ�(���L�̏ꍇ�A�ϐ�A��B)���ׁA��v���Ă�����true�A��v���Ă��Ȃ����false��Ԃ��B
    string�^�ϐ�A.equals(string�^�ϐ�B);
    int�^�̂悤�ȃv���~�e�B�u�^(�����̒l)���r����ۂ́A��r���Z�q��==�Ŕ�r�ł������Astring�^�̂悤�ȎQ�ƌ^�̃f�[�^�́A
    ��r���Z�q�ł͔�r�ł��Ȃ��ׁAString�^�̕ϐ����r���A��v�A�s��v���m�F���鎞�ɂ�equals();���\�b�h���g�p����B

    equals���\�b�h�́A�I�u�W�F�N�g�N���X�̃��\�b�h�Ȃ̂ŁA�g�p�O��import���̏����͈�ؕs�v�B
    �i���I�u�W�F�N�g�N���X�͑S�N���X�̃X�[�p�[�N���X�Ȃ̂ŁA�N���X�𗧂��グ�����_�ŁA���̒��̃��\�b�h�͑S�Ďg����B�j
*/

/*�@�y�ϐ��̃v���~�e�B�u�^�A�Q�ƌ^�̈Ⴂ�z
    �E�v���~�e�B�u�F�f�[�^���̂��̂��A�ϐ����Ɋi�[����Ă���ϐ��B�@���b�J�[
    �@�@�@�@�@�@�@�@�v���~�e�B�u�^�̕ϐ��͑S����8���(boolean char byte short int long floot double)
�@�@�@�@�@�@�@�@�@�@������1�@�ϐ��̎�ނ��ƂɃT�C�Y(1bit�`64bit)�����܂��Ă���B
�@�@�@�@�@�@�@�@�@�@������2�@�^�����S�ď������Ŏn�܂�B�@�@�@�@�@�@�@�@�@�@
�@�@�@�@�@�@�@�@�@�@�s �� �p�r���ƂɓK�؂Ȍ^��I�΂Ȃ��ƁA�������𖳑ʂɐH������A�X�y�[�X������Ȃ��Ȃ����肷��B�t

�@�@�E�@�Q�ƌ^�@�@�F�ϐ����ɂ̓f�[�^�̊i�[�ꏊ�̏�񂪊i�[����Ă��āA�f�[�^���̂��͕̂ʂ̏ꏊ�ɕۑ�����Ă���^�C�v�̕ϐ��B
�@�@�@�@�@�@�@�@�@�@���b�J�[�̌�
�@�@
�@�@�s�C���[�W�t
�@�@�@�l�����i�[�����v���~�e�B�u�^�͕ϐ��� "���b�J�[" �̃C���[�W�ŁA�l�̕ۑ����ϐ��Ɋi�[����Q�ƌ^�͕ϐ��� "���b�J�[�̌�" �̃C���[�W�B

�@�@�@�ϐ��́A��{�I�Ɏg�p���K�x�[�W(�f�[�^�̐��|)�����܂ł̓��������̗̈�ŕێ�����Ă���B
�@�@�@�v���~�e�B�u�^�̕ϐ��̒l�ƁA�Q�ƌ^�̕ϐ��̒l�̕ۑ������ێ����郁�����̗̈�� "�X�^�b�N�̈�"�@
�@�@�@�Q�ƌ^�̕ϐ��̒l�@���̂��ۑ�����郁�����̗̈�́A"�q�[�v�̈�" �ƂȂ��Ă���B

*/

/* MEMO
    Java�̖{�̊w�K���I������A�A�E�g�v�b�g���e�ō��v���O�����̌�
    �R�}���h���C���œ��͂����P����Q�Ƃ��āAjava�̗p������\������A�����c�[���������񂶂�Ȃ��H�@
*/

class TransWord {
    public static void main(String[] args) {//�R�}���h���C�������ɁA��������p�P������Ă����B
        try {
            BufferedReader in = new BufferedReader(new FileReader("mydic.txt"));
            String a = args[0]; //�R�}���h���C��������ϐ�a�Ɋi�[�B

            String eword, jword = null; //eword == �p�P��, jword == ���{����i�[����ϐ��B

            //�e�L�X�g�f�[�^�̓Ǎ��B
            while((eword = in.readLine()) != null){  //�p�ꕶ��ǂށB
                if(a.equals(eword)) {//�����������P��i�R�}���h���C�������j�ƁA���œǂ�ł���s�̕�������v���邩�m�F�B
                    jword = in.readLine();//��v���Ă�����A���̉��̕�(�|��)��ǂݍ��݁Ajword�Ɋi�[�B
                    break;
                }
            }

            if(jword == null){
                System.out.println(a + "�͂���܂���ł����B");
            }else{
                System.out.println(jword);
            }
            in.close();

        }catch(FileNotFoundException e) {  //FileNotFoundException ==�t�@�C�����J���Ȃ������ꍇ�ɐ��������A��O�N���X�B
            System.out.println("�t�@�C��������܂���B");
        }catch(Exception e) { //catch�̈�����Exception�ɂ��Ă����ƁA�ǂ̂悤�ȗ�O�N���X�ł��E���Ă����B
            System.out.println("�R�}���h���C������������܂���B");
        }
    }
}