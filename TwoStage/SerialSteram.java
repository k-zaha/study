/* ソース説明
    Helloクラスとそのオブジェクトhelloを作成し、helloオブジェクトをシリアライズしてファイルに保存する。
    ※ファイルはFileOutputStreamで用意。
    保存したhelloオブジェクトを、保存したファイルから読み込み、デシリアライズして、別の変数に格納。
    元の変数をデシリアライズ後、格納し直した別の変数名で呼び出し、Helloクラスのメソッドを使用するプログラム。

    ◆新技術
    シリアライズ：オブジェクトをビット列化すること。
    デシリアライズ：シリアライズしたオブジェクトを元に戻すこと。
    オブジェクトをビット列化することによって、インスタンスデータをファイルに保存しておくことができる。
    ==プログラム終了後も半永久的にインスタンスの情報を残して置ける。

    シリアライズを使用するには、クラスにSerializableインターフェースを実装する。
    Serializableインターフェースには、メソッドがない為、メソッドのオーバライド不要。
*/

import java.io.*;

class Hello implements Serializable { //Serualizableをimplementsすることで、オブジェクトのシリアライズ、デシリアライズが可能となる。
    void check(){
        System.out.println("こんにちは");
    }

} 


public class SerialSteram {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.check();

        try{
            FileOutputStream outFile = new FileOutputStream("Serialcheck.dat");//オブジェクトデータを保存するファイルを作成。
            ObjectOutputStream outObject = new ObjectOutputStream(outFile);//byte列の状態でオブジェクトのデータを保存する。
            outObject.writeObject(hello); //オブジェクトをファイルに書き込む。
            outObject.close();
            outFile.close();


            FileInputStream inFile = new FileInputStream("serialcheck.dat");//オブジェクトを保存したファイルを読み込む。
            ObjectInputStream inObject = new ObjectInputStream(inFile); //オブジェクトを読み込む。
            Hello chkhello = (Hello)inObject.readObject(); /*37行目でエラー吐くので、小文字(chkHello⇒chkhello)にしてみた。

                                                             オブジェクトを変数に入れ込んでいる。　オブジェクトのreadみたいなイメージ
                                                             readObjectはオブジェクトが他の変数を返すので、()でどのクラスの
                                                             オブジェクト化を指定しないと行けない。　キャスト*/
            inObject.close();
            inFile.close();
            chkhello.check(); //デシリアライズしたオブジェクトは、chkehelloに入れ込んだので、オブジェクト名がchkhelloで
                              //インスタンス化されている。その為、chkhelloのメソッドとして、checkを呼び出す。
        

        } catch(IOException ioe){
        } catch(ClassNotFoundException e){
        }

    }

}
