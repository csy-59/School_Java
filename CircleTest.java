public class CircleTest {
    //main
    public static void main(String args[]) {
        //11�� ����
        Circle c1 = new Circle(5.0);
        System.out.println("���� ����: " + c1.getArea());	//c1��ü�� getArea() ȣ��
        System.out.println("���� �ѷ�: " + c1.getPerimeter());	//c1��ü�� getPerimeter() ȣ��

        //12�� ����
        //Circle.radius = 10.0;	//���: ����! radius�� private(�ܺο��� ���� ���� �Ұ�)
        //Circle.square(20.6);	//���: ����! square�� �����Լ��� �ƴ�

        //13�� ����: ���: ����! radius/square�� ��������/�Լ��� �ƴ�
        //14�� ����: ���: ����! radius/square�� ��������/�Լ��� �ƴ�

        //15�� ����: ���: ����! square�� �����Լ��� �ƴ�
        
    }
}