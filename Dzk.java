import java.io.UnsupportedEncodingException;


class Dzk{
    public static void main(String[] args) {

        String a = "Java�̊G�{";
        int len = a.length();
        String b = a.substring(len-2, len);
        int c = b.compareTo("�G�{");

        System.out.println("�u" + a + "�v�̍Ō��2�����́u" + b + "�v");
        System.out.println("�G�{" + (c==0 ? "�ł�" : "�ł͂���܂���"));


    }

}