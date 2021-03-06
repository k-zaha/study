import java.io.*;

/*　ソース説明
    cmdで入力した文字を、txtファイルを生成し、その内部に格納するプログラム。
  　準備部で　機能実装に必要なクラスのオブジェクトを生成。
    エディター処理部で、入力処理、ファイルへの書き出し処理、処理続行の可否を決めるループ文を定義。


  　textを書き終えた後、Enterで改行 !q　を入力し、再度Enterを押すことで、エディターが終了する。
    生成するファイル名が定義されてなかったり、Ctrl+C 等でプログラムを強制終了した場合は、例外処理が行われる。
*/

class MyEditor {
    public static void main(String[] args){

            //準備       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            FileWriter out = new FileWriter(args[0]); //FileWriterクラスのオブジェクトを作成する事で書き込み用ファイルの作成。
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//エディターで入力する文字を読み込むため、BufferedReaderクラスのオブジェクト作成
                                                            //ImputStreamReaderは引数で指定したデータをテキストデータで読み込む為のクラス。
                                                            //System.inはキーボードからの入力の意。
            String lf = System.getProperty("line.separator");//改行コード取得。
            String data; //エディターで入力した文字を保管する変数を作成。

    

            //エディター処理    /////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            System.out.println("データを入力してください。(終了：!q と入力しEnter)");
            //--------（文字入力部） ---------------------
            while(!(data = in.readLine()).equals("!q")){    //行に入力されている文字が"!q"以外の場合は無限ループ
                                                            //（先にreadLineで文字をエディターに入力された文字を読込み、dataに格納しておく）
                out.write(data + lf);                       //textファイルへの書き込み。
            }
            //------------------------------------------

            

            //終了処理       ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("終了します。");
            out.close();  //ファイルを保存して閉じる。





            //例外処理      ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } catch(Exception e) {
            System.out.println(e); //エラーの内容をcmdに表示。
        }
    }
}