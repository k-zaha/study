class BookA {
    String title;
    String writer;

    BookA(String t, String w){
        title = t;
        writer = w;
    }

    BookA(BookA copy){
        title = copy.title;
        writer = copy.writer;
    }

    void print(){
        System.out.println("�^�C�g���F" + title);
        System.out.println("���@�@�ҁF" + writer);
    }
}

class Books2 {
    public static void main(String[] args) {
        BookA book1 = new BookA("C�̊G�{","�A���N");
        book1.print();

        BookA book2 = new BookA(book1);
        book2.title = "java�̊G�{";
        book2.print();
    } 
}