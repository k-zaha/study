class Test {
    public static void main (String... args){
        Student taro = new Student(12,"taro",95,83,76);
        Student jiro = new Student(7,"jiro",66,97,72);

        taro.print();
        jiro.print();
    } 


}

class Student {
    int sn, j, m, e, ts, fs;
    String n;
    Student (int sn,String n, int j, int m, int e){
        ts = (j + m + e);
        sn = this.sn;
        n = this.n;
        j = this.j;
        m = this.m;
        e = this.e;

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
        System.out.println(sn + "�F" + n);
        System.out.println("����F" + j + " ���w" + m + " �p��F" + e);
        System.out.println("�����_�F" + ts);
        System.out.println("5�i�K�]���F" + fs + "�ł��B");
    }

}