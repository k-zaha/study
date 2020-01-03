package Test;

class Test {
    public static void main (String... args){
        Student taro = new Student(12,"taro",95,83,76);
        Student jiro = new Student(7,"jiro",66,97,72);

        taro.print();
        jiro.print();
    } 


}

class Student {
    int studentNumber, japanese, math, english, ts, fs;
    String name;
    Student (int sn,String n, int j, int m, int e){
        ts = (j + m + e);
        studentNumber = sn;
        name = n;
        japanese = j;
        math = m;
        english= e;

        if(ts > 250){
            fs = 5;
        } else if(ts > 200){
            fs = 4;
        }else if(ts > 100){
            fs = 3;
        }else if(ts > 50){
            fs = 2;
        }else{
            fs =1;
        }


    }
    public void print(){
        System.out.println(studentNumber + "�F" + name);
        System.out.println("����:" + japanese + " ���w�F" + math + " �p��:" + english);
        System.out.println("�����_" + ts);
        System.out.println("5�i�K�]���F" + fs + "�ł��B");
    }

}