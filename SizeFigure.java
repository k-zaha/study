/*
    ���ۃN���XFigure�ƁA������p������N���XSquare�ACircle��p�ӁB

    Square == �l�p�`�̖ʐςƊO����\���B
    �R���X�g���N�^�𗘗p���A�C���X�^���X�������ɁA�l�p�`�̉��Əc��ǂݍ��ގd�g�݂ƂȂ��Ă��邪�A
    �R���X�g���N�^���I�[�o�[���[�h���A�����`�̏ꍇ�́A����1�Ŏ����I�ɏc�A���T�C�Y���ǂݍ��܂��悤�ɂȂ��Ă���B

    Circle == �~�̖ʐςƊO����\���B
    �R���X�g���N�^�𗘗p���A�C���X�^���X�������ɉ~�̒��a��ǂݍ��ގd�g�݂ƂȂ��Ă���B
    �~����3.14�͕s�ςȂ̂ŁACircle�N���X�Ńt�B�[���h��`����final�C���q��t���āA�萔���B

    
    ���s�N���XSizeFigure�ɂāA
    �C���X�^���X�����̐錾��Figure�N���X�A�f�[�^�^�̐錾�̓T�u�N���X��Square��Circle���w�肵�Ă��邪�A
    �C���X�^���X�����̐錾���T�u�N���X�ōs���Ă����Ȃ��B

    �X�[�p�[�N���X���ŃC���X�^���X�����̐錾���s���ƁA�ʂ̌^�ɕύX���悤�Ƃ����ۂɁA���̃f�[�^�Ɏ��������K�v���Ȃ��B
    �Ƃ��������b�g������B
    �������A�C���X�^���X�����̐錾���T�u�N���X�ōs���ƁA�T�u�N���X���ɂ����Ȃ����\�b�h��t�B�[���h���g���₷��
    �����b�g������B

    
*/

abstract class Figure {
    abstract void area();  //�ʐ�
    abstract void around(); //�O��

    void measure() {
        area();
        around();
        System.out.println();
    }
}

// ���ۃN���X�̃T�u�N���Xsquare
class Square extends Figure {
    double side;
    double height;

    Square(double s){  //Square�̃R���X�g���N�^
        side = height = s;
    }

    Square(double s, double h){ //�R���X�g���N�^�̃I�[�o�[���[�h
        side = s;
        height = h;
    }

    void area() { //���ۃ��\�b�h�̃I�[�o�[���C�h
        System.out.println("�l�p�`�̖ʐρF" + (side * height));
    }

    void around() { //���ۃ��\�b�h�̃I�[�o�[���C�h
        System.out.println("�l�p�`�̊O���F" + (2 * (side * height)));
    }
}

class Circle extends Figure {
    final double pi = 3.14;
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() { //���ۃ��\�b�h�̃I�[�o�[���C�h
        System.out.println("�~�̖ʐρF" + (radius * radius * pi));
    }

    void around() { //���ۃ��\�b�h�̃I�[�o�[���C�h
        System.out.println("�~�̊O���F" + (2 * radius * pi));
    }
    void nmethod(){
        System.out.println("�e�X�g�f�[�^");
    }
}


class SizeFigure {
    public static void main(String[] args) {
        Figure fig1 = new Square(2.5);
        Figure fig2 = new Square(2.3, 3.7);
        Figure fig3 = new Circle(3.6);
        //Figure fig4 = new Circle(5);
        fig1.measure();
        fig2.measure();
        fig3.measure();
        fig3.nmethod();
        //Circle�N���X�ŐV���ɒ�`�����Anmethod�́A��`���Ȃ���Ă��Ȃ��e�N���X��
        //Figure�ŃI�u�W�F�N�g�̐錾������(84���)�ƁA�G���[���o��B(�R���p�C���Ǝ��s�͂ł���B)
        //fig4.measure();
        System.out.println();
    
    }
}