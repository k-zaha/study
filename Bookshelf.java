class Book{
    String title;
    String genre;

    void printbook(){
        System.out.println("�^�C�g���F" + title);
        System.out.println("�W�������F" + genre);

    }
}

class Novel extends Book{
    String writer;

    void printNov(){
        printbook();
        System.out.println("��  �ҁF" + writer);
    }
}

class Magazine extends Book {
    int day;

    void printMag(){
        printbook();
        System.out.println("�������F" + day + "��");
    }
}

class Bookshelf{
    public static void main(String[] args) {
        Novel nov = new Novel();
        nov.title = "������̑�`��";
        nov.genre = "�t�@���^�W�[";
        nov.writer = "�A���N";
        Magazine mag = new Magazine();
        mag.title = "����Java�̊G�{";
        mag.genre = "�R���s���[�^";
        mag.day = 20;
        nov.printNov();
        System.out.println();
        mag.printMag();
    }
}