class Weather{
    public static void main(String[] args){
        //Wdata�N���X�̃I�u�W�F�N�g"today"���쐬�B(�C���X�^���X����)
        Wdata today = new Wdata();
        today.month = 1;
        today.day = 1;
        today.sky = "������";

        System.out.println(today.month + "��" + today.day + "��" + today.sky);
    }
}

class Wdata{
    //�t�B�[���h(main�ȊO�̃N���X�Œ�`����Ă���ϐ�)
    int month;
    int day;
    String sky;
}   