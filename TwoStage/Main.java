class Main {
    public static void main(String[] args) {


        
        try {
            dack(args[0]);
        }catch(Exception e){
        
            System.out.println("コマンドライン引数がありません。出直せ、クソ野郎。");
        }finally {
            System.out.println("終了します。");
        }
    }
    static void dack(String a) throws Exception {        
        System.out.println(a);
    }

}