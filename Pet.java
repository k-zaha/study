/*�I�[�o�[���[�h
�I�[�o�[���[�h�Ƃ́A����̃N���X���ɁA�f�[�^�^�␔�Ȃǈ������قȂ铯���̃��\�b�h�𕡐���鎖�B
�I�[�o�[���[�h����΁A���\�b�h�Ăяo�����ɁA���̈����̓��e�ɓK���郁�\�b�h�������I�ɌĂяo�����B  
 */

class Cat {
    String name;
    String place;
    int age;

    void setData (String n, String p, int a){
        name = n;
        place = p;
        age = a;
    }

    void print (){
        System.out.println(place + ":" + name + " " + age + "��");
    }

    void print(String p, int a){
        place = p;
        System.out.println(place + ":�˂���" + a + "�C�ł��B");
    }

    void print(String variety){
        System.out.println(place +  ":" + name + " " + age + "��" + variety);
    }
}

class Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.setData("���r��", "����", 10);
        cat2.setData("����", "�ƂȂ�", 14);
        cat1.print("�G��");
        cat2.print();
        cat3.print("����", 0);

    }
}