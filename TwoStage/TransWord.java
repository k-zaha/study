import java.io.*;

/* ソース説明
    コマンドライン引数に入力した英単語が、読み込んだファイル名の中に入っているかを確認し、入っていたらcmdに日本語訳を返す。
    事前に、読み取るファイル"mydic.txt"に、英単語⇒日本語⇒英単語⇒日本語と交互に入力し保存しておく。

    【新技術】
    equals();メソッド・・・　string型変数(下記の場合、変数AとB)を比べ、一致していたらtrue、一致していなければfalseを返す。
    string型変数A.equals(string型変数B);
    int型のようなプリミティブ型(ただの値)を比較する際は、比較演算子の==で比較できたが、string型のような参照型のデータは、
    比較演算子では比較できない為、String型の変数を比較し、一致、不一致を確認する時にはequals();メソッドを使用する。

    equalsメソッドは、オブジェクトクラスのメソッドなので、使用前のimport等の処理は一切不要。
    （※オブジェクトクラスは全クラスのスーパークラスなので、クラスを立ち上げた時点で、その中のメソッドは全て使える。）
*/

/*　【変数のプリミティブ型、参照型の違い】
    ・プリミティブ：データそのものが、変数内に格納されている変数。　ロッカー
    　　　　　　　　プリミティブ型の変数は全部で8種類(boolean char byte short int long floot double)
　　　　　　　　　　◎特徴1　変数の種類ごとにサイズ(1bit〜64bit)が決まっている。
　　　　　　　　　　◎特徴2　型名が全て小文字で始まる。　　　　　　　　　　
　　　　　　　　　　《 ※ 用途ごとに適切な型を選ばないと、メモリを無駄に食ったり、スペースが足りなくなったりする。》

　　・　参照型　　：変数内にはデータの格納場所の情報が格納されていて、データそのものは別の場所に保存されているタイプの変数。
　　　　　　　　　　ロッカーの鍵
　　
　　《イメージ》
　　　値が直格納されるプリミティブ型は変数が "ロッカー" のイメージで、値の保存先を変数に格納する参照型は変数が "ロッカーの鍵" のイメージ。

　　　変数は、基本的に使用中ガベージ(データの清掃)されるまではメモリ内の領域で保持されている。
　　　プリミティブ型の変数の値と、参照型の変数の値の保存先情報を保持するメモリの領域は "スタック領域"　
　　　参照型の変数の値　自体が保存されるメモリの領域は、"ヒープ領域" となっている。

*/

/* MEMO
    Javaの本の学習を終えた後、アウトプット第一弾で作るプログラムの件
    コマンドラインで入力した単語を参照して、javaの用語解説を表示する、辞書ツールがいいんじゃない？　
*/

class TransWord {
    public static void main(String[] args) {//コマンドライン引数に、検索する英単語を入れておく。
        try {
            BufferedReader in = new BufferedReader(new FileReader("mydic.txt"));
            String a = args[0]; //コマンドライン引数を変数aに格納。

            String eword, jword = null; //eword == 英単語, jword == 日本語を格納する変数。

            //テキストデータの読込。
            while((eword = in.readLine()) != null){  //英語文を読む。
                if(a.equals(eword)) {//検索したい単語（コマンドライン引数）と、一つ上で読んでいる行の文字が一致するか確認。
                    jword = in.readLine();//一致していたら、その下の文(翻訳文)を読み込み、jwordに格納。
                    break;
                }
            }

            if(jword == null){
                System.out.println(a + "はありませんでした。");
            }else{
                System.out.println(jword);
            }
            in.close();

        }catch(FileNotFoundException e) {  //FileNotFoundException ==ファイルが開けなかった場合に生成される、例外クラス。
            System.out.println("ファイルがありません。");
        }catch(Exception e) { //catchの引数をExceptionにしておくと、どのような例外クラスでも拾ってくれる。
            System.out.println("コマンドライン引数がありません。");
        }
    }
}