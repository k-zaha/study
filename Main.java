class Main{
    /* mainクラスのargsは、コマンドライン上でjava プログラム名　～でプログラムを起動する際、
       ～の部分に、引数を入れた場合、その引数はメインで指定されているString[] またはString...の変数　
       argsに格納される。

       その為、argsをメインクラス内で呼び出せば、コマンドライン上で入力した引数を使用する事も可能である。
    */

    public static void main(String... args){
        int i;

        if(args.length == 0){
            System.out.println("コマンドライン引数がありません。");
        } else {
            for(i = 0;i < args.length; i++){
                System.out.println((i+1) + "：" + args[i]);
                if(i == 8){
                    break;
                }
            }
        }
    }
}