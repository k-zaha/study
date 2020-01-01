class VarargsSample {

    /* �ϒ��̈��������\�b�h�ɒ�`�������ꍇ�A�@���\�b�h���i�f�[�^�^... �ϐ����j{�`�@�ŉ\�B
        �������i�[����ϐ��́A�ꎟ���̔z��ɂȂ�B*/
    int getMax(int... nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0) {
                max = nums[0];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        VarargsSample vt = new VarargsSample();
        System.out.println("(2, 5, 7, 0, 1) �ő�l:" + vt.getMax(2, 5, 7, 0, 1));
        System.out.println("(100, 54, 1)    �ő�l:" + vt.getMax(100, 54, 1));
        System.out.println("(10)            �ő�l:" + vt.getMax(10));
    }
}