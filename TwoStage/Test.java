import java.io.*;


/*ソース説明
  遊びで作ってみた。
  jpegファイルを読み込んでくれない。　同じディレクトリにあるのに。(usoyo.jpeg)
  コンパイルは可能。datファイルは読み込みも可能。jpegを読み込むときには別に処理が必要？
*/
class Test {
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("usoyo.jpeg");
            int c;
            c = in.read();

            in.close();
        
            FileOutputStream out = new FileOutputStream("file4.dat");
            out.write(65);
            out.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }

}