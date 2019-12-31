class Fora{
    /*for文の拡張した使用
    　forをfor(int a = 0;a < 3;a++) ～　ではなく、
    　for(型名 a : 既存の配列変数　b)～にすることで、
    　その配列変数に入っている要素数分、繰り返し処理を行うという書き方が可能。
    　この場合、String型のフィールドを保持した配列でもfor文を回す事ができる。*/


    public static void main(String[] args){
        String[] season = {"春", "夏", "秋", "冬"};

        for (String s : season){
            System.out.println(s);
        }
    }
}