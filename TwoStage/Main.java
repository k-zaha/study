class Main {
    public static void main(String[] args) {


        
        try {
            dack(args[0]);
        }catch(Exception e){
        
            System.out.println("�R�}���h���C������������܂���B�o�����A�N�\��Y�B");
        }finally {
            System.out.println("�I�����܂��B");
        }
    }
    static void dack(String a) throws Exception {        
        System.out.println(a);
    }

}