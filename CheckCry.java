/* instanceof
    �I�u�W�F�N�g���w�肵���N���X�̃I�u�W�F�N�g�ł���΁Atrue���A�łȂ����false��Ԃ��B
    �܂��A�I�u�W�F�N�g���w�肵���C���^�[�t�F�[�X���������Ă���΁Ature���A�łȂ����false��Ԃ��B
    boolean flag = ObujectB instanceof ClassA;
    ��L�̗Ⴞ�ƁAClassA�̒��ɁAObjectC�����݂��Ă���΁Aboolean�^�̕ϐ�flag��true��Ԃ��d�g�݂ɂȂ��Ă���B

    ���̃v���O�����́B�B
    �C���^�[�t�F�[�XCry��Cry���������Ă���ACat�N���X�A�������Ă��Ȃ�Dog�N���X��p�ӂ����B
    ���s�N���X�ƂȂ�CheckCry�N���X�ŁA���ꂼ��Cat�ADog�̃C���X�^���X�𐶐����A
    Cry�C���^�[�t�F�[�X���������Ă���΁A�e�X�̖������\�������悤�ɂȂ��Ă���B

    �����Cat�N���X�̂݁ACry�C���^�[�t�F�[�X������(implements)���Ă���̂ŁA�L�������Ȃ��悤�ɂȂ��Ă���B
*/
interface Cry {
    void cry();
}

class Cat implements Cry {
    public void cry() {
        System.out.println("�ɂ�[");
    }
}

class Dog {
    public void cry() {
        System.out.println("���");
    }
}

class CheckCry {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();

        if(cat instanceof Cry) {
            cat.cry();
        }

        if(dog instanceof Cry){
            dog.cry();
        }

    }
}