class Book{
    int price;
    int num = 0;
    String title;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    void print() {
        System.out.println("�^�C�g���F" + title);
        System.out.println("��@�@���F" + price);
        System.out.println("���������F" + num);
        System.out.println("���v���z�F" + price * num);

    }
}

class Books{
    public static void main(String[] args) {
        Book book = new Book("C�̊G�{", 1380);
        book.num = 10;
        book.print();

        Book misono = new Book("�e�^��X�̌��g", 500);
        misono.num = 2;
        misono.print();
    }
}
