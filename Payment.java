class Drink {
    String name; //���i��
    int price; //�P��
    int count; //����

    //�R���X�g���N�^
    Drink(String n, int p, int c){
        name = n;
        price = p;
        count = c;
    }
    int getTotalPrice() { //���z���v�Z
        return count * price;
    }

    static void printTitle() {
        System.out.println("���i��\t\t�P��\t����\t���z"); //"\t" == �^�u��}��
    }

    void printData() {
        System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
    }
    
}

class Alcohol extends Drink {
    float alcper; //�A���R�[���x��

    //�R���X�g���N�^
    Alcohol(String n, int p, int c, float a) {
        super(n, p, c); // �X�[�p�[�N���X�̃R���X�g���N�^���Ăяo���B
        alcper = a;
    }
    //���\�b�h�̃I�[�o�[���C�h
    static void printTitle(){
        System.out.println("���i��(�x��[%])\t�P��\t����\t���z");
    }

    //���\�b�h�̃I�[�o�[���C�h
    void printData() {
        System.out.println(name + "(" + alcper + ")" + "\t" + price + "\t" + count +"\t"+ getTotalPrice());
    }
}

class Payment {
    public static void main(String[] args) {
        Drink coffee = new Drink("�R�[�q�[", 200, 3);
        Drink oolongtea = new Drink("�E�[������", 150, 2);
        Alcohol wine = new Alcohol("���C��", 300, 2, 15.0f); //�A���R�[���x������͂�������̃f�[�^�^���A
                                                            //float�Ȃ̂Ő����̌���f������K�v������B
        //�ʏ�h�����N���o��
        Drink.printTitle();
        coffee.printData();
        oolongtea.printData();
        System.out.println();
        
        //�A���R�[���h�����N���o��
        Alcohol.printTitle();
        wine.printData();

        //�����̍��v���z���v�Z�@���ʂ�sum�Ɋi�[�B
        int sum = coffee.getTotalPrice()
        + oolongtea.getTotalPrice() + wine.getTotalPrice();

        //���v���z�o��
        System.out.println("\n*** ���v���z" + sum + "�~***");
    }
}
