class Animal {
    String name;
    int age;

    void printPet() {
        System.out.println("���O�F" + name);
        System.out.println("�N��F" + age);
    }
}

class Cat extends Animal {
    String variety;

    void printPet() {
        super.printPet();
        System.out.println("��ށF" + variety);
    }
}

class Pets {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "����";
        cat.age = 5;
        cat.variety = "�y���V��";
        cat.printPet();
    }
}