public class Circle {
    //��� ����
    public double radius;		//private: ��ü�� �����Ǿ�������, ��ü �������� ����, Ȯ�� ����. but �ܺο����� ���� ���� �Ұ�. �ɹ� �Լ��δ� ������ ����.
    final static double PI = 3.141592;	//final: ���� ��� ����
    
    //������
    Circle() {	//�Ű� ������ ���� ������(0.0���� ������ ����
        radius = 0.0;
    }
    Circle(double radius) {		//������ �Ű� ������ �޾ƿ��� ������
        this.radius = radius;		//this. : �ش� ��ü�� ��� ����/�Լ��� ���� �˷���.
    }

    //��� �Լ�
    void setRadius(double raidus) {	//������ ���� �ʱ�ȭ ���ִ� �Լ�(�ʱ�ȭ�̱� ������ ��ȯ �ʿ�X)
        this.radius = radius;
    }
    double getRadius() {	//������ ���� ��ȯ���ִ� �Լ�
        return radius;
    }
    double square(double num) {	//�Ű������� ���� ���� ������ ��ȯ
        return num*num;
    }
    double getArea() {	//�� ���� ���: square�Լ��� PI ���
        return square(radius)*PI;
    }
    double getPerimeter() {	//���� �ѷ� ���: PI ���
        return radius*2*PI;
    }
    public static double getPI() {		//PI �� ��ȯ(���� �޼ҵ�)
        return PI;
    }

    
    //main
    public static void main(String[] args) {
        //9�� ����: ��ü ���� square() ȣ��
        //square(10.0);		//square() �Լ� ȣ��: ���>����, ��ü ���� ���� ������ �� ����.
        //10�� ����: ���� �޼ҵ� getPI() ȣ���ϱ�
        Circle c1 = new Circle();		//�⺻ ������ ȣ��
        c1.square(10.0);
        getPI();			//���� �޼ҵ� ȣ��: ���>���� ����
    }
    
}