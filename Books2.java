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
        System.out.println("タイトル：" + title);
        System.out.println("著　　者：" + writer);
    }
}

class Books2 {
    public static void main(String[] args) {
        BookA book1 = new BookA("Cの絵本","アンク");
        book1.print();

        BookA book2 = new BookA(book1);
        book2.title = "javaの絵本";
        book2.print();
    } 
}