class Weather{
    public static void main(String[] args){
        //Wdataクラスのオブジェクト"today"を作成。(インスタンス生成)
        Wdata today = new Wdata();
        today.month = 1;
        today.day = 1;
        today.sky = "くもり";

        System.out.println(today.month + "月" + today.day + "日" + today.sky);
    }
}

class Wdata{
    //フィールド(main以外のクラスで定義されている変数)
    int month;
    int day;
    String sky;
}   