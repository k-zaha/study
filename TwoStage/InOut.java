import java.io.*;
/* ソース説明


    ◆新技術
    InputStreamReaderクラス　（Readerクラスのサブクラス）
    オブジェクトを生成することで、読み込んだバイナリデータのファイルを文字入力に変換する。
    引数に、バイナリファイルを読み込んだオブジェクトを指定することで、利用可能。
    FileInputStreamでバイナリファイルを読み込んだ後、InputStreamを指定することで、文字データに変換する。

    OutputStreamWriterクラス （Writerクラスのサブクラス）
    オブジェクトを生成することでバイナリ出力を文字出力に変換するクラス。
    引数に、バイナリデータを書き出すオブジェクトを指定することで、利用可能。
    (イメージ的には、FileOutputStreamでバイナリファイルを生成した後、OutputStreamWriterでそれを文字データに変換する感じ。)

    

*/

class InOut {
    public static void main(String[] args){
        try{
            String filename = "file.dat"; //変数filenameに読み込みと書き出し（output＆input）するファイルの名前を変数に格納。

            FileOutputStream out = new FileOutputStream("filename");//バイナリファイルを生成
            FileInputStream inFile = new FileInputStream("filename");//生成したバイナリファイルを読み込む
            InputStreamReader in = new InputStreamReader(inFile);//inputしたfile.datをバイナリから文字データに変換。(バイナリ⇒文字へ)

            //out:生成するファイル　inFile：生成したファイルの読み込み　in：inFileで読み込んだファイルを文字に変換

            /* ------------------------------------------------------------------------------------------------- *\
                上記で、バイナリファイルの生成、読み込み、変換(バイナリ⇒文字)を行ったが、
                ストリームはまだ閉じていないので、その処理の詳細を、下記で指定していく。
            \* ------------------------------------------------------------------------------------------------- */
 
            //<注意> 先に書き出す内容を記載してから、バイナリの中身の取得＆表示処理を行う。　順番を守るのが肝。
            
            for(byte i = 1; i <= 10; i++) {  //生成＆読み込みを行う、"file.dat"に書き出す内容を記載。
                out.write(i); 
            }

            int c;
            while((c = in.read()) != -1) {  //"InputStreamReader"でバイナリから文字化したファイルの中身を取得し表示。
                System.out.print(c + " ");  
            }

            //ストリームを閉じる
            in.close();
            out.close();

            //例外処理　ファイルを読み込みできなかった場合。
        } catch(IOException e) {
            System.out.println("ファイルがありません。");
        }
    }
}