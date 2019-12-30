class Truth{

/*
「? :」を使用した判定を行う構文。

　変数A　＝ boolian型変数　?　値B　: 値C;

　としたときに、
　boolian型変数の値がtrueだったら、:の左側の値B、
　boolian型変数の値がfalseだったら、:の右側の値Cが
　変数Aに入れ込まれるようになっている。

*/
    public static void main(String[] args){
        String right = "正解", wrong = "不正解";
        boolean value;

        value = true;
        String answer = value ? right : wrong;
        System.out.println(answer);

        value = false;
        answer = value ? right : wrong;
        System.out.println(answer);

    }
}