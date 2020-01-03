class Book{
    String title;
    String genre;

    void printbook(){
        System.out.println("タイトル：" + title);
        System.out.println("ジャンル：" + genre);

    }
}

class Novel extends Book{
    String writer;

    void printNov(){
        printbook();
        System.out.println("著  者：" + writer);
    }
}

class Magazine extends Book {
    int day;

    void printMag(){
        printbook();
        System.out.println("発売日：" + day + "日");
    }
}

class Bookshelf{
    public static void main(String[] args) {
        Novel nov = new Novel();
        nov.title = "しおりの大冒険";
        nov.genre = "ファンタジー";
        nov.writer = "アンク";
        Magazine mag = new Magazine();
        mag.title = "月刊Javaの絵本";
        mag.genre = "コンピュータ";
        mag.day = 20;
        nov.printNov();
        System.out.println();
        mag.printMag();
    }
}