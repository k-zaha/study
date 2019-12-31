class DoWhile{

    public static void main(String[] args){
        /*while文
          while(条件){}の条件がtrueの間だけ、{}内に記載した処理を繰り返し行う。
          forと違い、カウンタ(a++)がない。主に、繰り返し数が不特定な場合に使用する。
        */

        /*do ～ while文
          while文の前にdoを記入して、do ～　whileで繰り返し処理をはさむことによって、
          whileで繰り返し処理の続行可否判定する前に、一度、処理を行う。
          そのため、最初から条件外でも、必ず1度は処理をするよう設定できる。
        */

        int s =0, i =0;

        do{
            i = ++i;  
            s = s + i;
            System.out.println("i=" + i + " s=" + s);
        }while(i < 10);
        System.out.println(
            "1から" + i + "までの和は" + s);
        
    }
}
