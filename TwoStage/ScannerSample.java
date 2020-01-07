import java.util.Scanner;

/* Scannnerクラスとは
    キーボード入力をサポートするクラス。
    Scannerクラスのオブジェクトを作成することで使用可能。
    キーボードからの入力を引数にとる場合は、"System.in"を使用する。
    Scannerクラスのオブジェクトに格納したデータは、next()メソッドか、
    Integer型のデータの場合はnextInt()メソッドで、変数に格納できる。

    
*/
class ScannerSample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("駅名を入力してください：");
        String stName = sc.next();
        System.out.println("ホーム番号を入力してください：");
        int hNum = sc.nextInt();

        sc.close();


        System.out.println(stName + "駅の" + hNum +"番ホームで待っています");
    }
}
