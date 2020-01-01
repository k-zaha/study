class Book{
    int price;
    int num = 0;
    String title;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void print() {
        System.out.println("タイトル：" + title);
        System.out.println("定　　価：" + price);
        System.out.println("注文部数：" + num);
        System.out.println("合計金額：" + price * num);

    }
}

class Books{
    public static void main(String[] args) {
        Book book = new Book("Cの絵本", 1380);
        book.num = 10;
        book.print();

        Book misono = new Book("容疑者Xの献身", 500);
        misono.num = 2;
        misono.print();
    }
}
