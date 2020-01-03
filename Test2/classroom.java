//package Test2;

class Test {
    String subject;  //���Ȗ�
    int point; //���_

    void setPoint(String s, int p){ //���_��ݒ肷�郁�\�b�h
        subject = s;
        point = p;

    }

    String getPoint(){  //1���Ȃ̓��_�𓾂郁�\�b�h
        return subject + "�F" + point;
    }
}

class Student {
    int id; //�t�B�[���h�@���k�̔ԍ�
    String name; //�t�B�[���h�@���k��
    int subnum; //���Ȑ�
    Test[] test; //Test�N���X�̎����Ă���ݒ�������Ȑ������ꍞ�ނ��߁A�z��p�ӁB
                 //Test�N���X��setPoint���\�b�h�ƁAgetPoint���\�b�h��(����:�_��)�̕\�����\�ƂȂ�B

    Student(int i, String n, int s){ //�R���X�g���N�^
        id = i;
        name = n;
        subnum = s;
        test = new Test[s];
        for(int j = 0; j < s; j++){
            test[j] = new Test(); //test�N���X�̃I�u�W�F�N�g�Ƃ����������ATest�z��ɋ��Ȑ����ǉ����Ă���B
        }
    }

    String getName(){ //���O�𓾂�
        return id + "�F" + name;
    }

    int getGrade() { //getGrade �������_�𓾂��
        int sum = 0; //�����_�̃t�B�[���h
        for(int i = 0; i < subnum; i++) {
            sum += test[i].point;
        }
        return sum;
    }

    //���\�b�h�̃I�[�o�[���[�h  getGrade ��5�i�K�]���𓾂��
    int getGrade(int a) { //5�i�K�]���𓾂�
        int base = 100 * subnum / a;   //���Ȑ��~100��5(5�i�K�]���̏ꍇ)���]��̃x�[�X�ɂȂ�B�@
        int rank = getGrade() / base + 1;
        // �� �����_��]��x�[�X�Ŋ�����5�i�K�]�����s���B
        //0�`59�F1 60�`119�F2 120�`179�F3�@180�`239�F4�@240�`300�F5
        
        /*�y���ӓ_�I�z�����_��]��x�[�X�Ŋ����������̒l�ɂ��Ă��܂��ƁA1�����B
           (59��60=0 ?����59�_�]��P 239��60=3 ?����239�_�]��3�ɂȂ�)�ׁA������
           �l��1�𑫂��Ȃ��Ƃ����Ȃ��B

           �����_��300(���_�j�ɂȂ�Ƌt��5+1=�]��6�ɂȂ��Ă��܂��̂ŁA
           return(63�s��)��rank��5�𒴂���Ƃ��ɁA5����ꍞ��swith����p�ӂ��Ă����B
        */

        //System.out.println("subnum�F" + subnum + " base�F" + base + " �����_�F" + getGrade() + " rank�F" + rank);
        return (rank > a) ? a : rank;   //rank��a���傫���ꍇ��a���A����ȊO��rank��Ԃ��B
    }

    void printScore() {
        System.out.println(getName());
        for(int i = 0; i < subnum; i++){
            System.out.print(test[i].getPoint() + " ");
        }
        System.out.println();
        System.out.println("�����_" + getGrade());
        int rank = 5;  //rank�̏����l��ウ��Ε]���̒i�K���ς��B(5�Őݒ肵�Ă��邩��5�i�K�]��)
        System.out.println(rank + "�i�K�]��" + getGrade(rank));
        System.out.println();
    }
}

class classroom{
    public static void main(String[] args) {
        Student taro = new Student(12, "taro", 3);
        taro.test[0].setPoint("����", 95);
        taro.test[1].setPoint("���w", 83);
        taro.test[2].setPoint("�p��", 76);
        taro.printScore();

        Student jiro = new Student(7, "jiro", 3);
        jiro.test[0].setPoint("����", 66);
        jiro.test[1].setPoint("���w", 97);
        jiro.test[2].setPoint("�p��", 72);
        jiro.printScore(); 
        //System.out.println (400/5);

        Student saburo = new Student(3, "saburo", 3);
        saburo.test[0].setPoint("����", 46);
        saburo.test[1].setPoint("���w", 87);
        saburo.test[2].setPoint("�p��", 92);
        saburo.printScore(); 


        
        Student siro = new Student(4, "siro", 3);
        siro.test[0].setPoint("����", 98);
        siro.test[1].setPoint("���w", 100);
        siro.test[2].setPoint("�p��", 99);
        siro.printScore(); 
        
        Student goro = new Student(5, "goro", 3);
        goro.test[0].setPoint("����", 100);
        goro.test[1].setPoint("���w", 100);
        goro.test[2].setPoint("�p��", 100);
        goro.printScore(); 

        Student baka = new Student(53, "baka", 3);
        baka.test[0].setPoint("����", 0);
        baka.test[1].setPoint("���w", 0);
        baka.test[2].setPoint("�p��", 0);
        baka.printScore(); 
    }
}