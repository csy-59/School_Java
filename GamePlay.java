import java.util.Scanner;
public class GamePlay {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //ö���� ���� �Է¹ޱ�
        System.out.print("ö��: ");
        String charsueChoice = input.next();

        //������ ���� �Է¹ޱ�
        System.out.print("����: ");
        String youghiChoice = input.next();

        //��� ���
        printResult(charsueChoice, youghiChoice);

        input.close();
    }

    //��� ���
    public static void printResult(String charChoice, String yougChoice){
        if(charChoice.equals(yougChoice)){      //���º��� ���
            System.out.println("���º��Դϴ�.");
        } else if(charChoice.equals("����")) {  //ö���� ������ ���
            System.out.println( yougChoice.equals("����") ? "������ �¸�" : "ö���� �¸�" );
        } else if(charChoice.equals("����")){   //ö���� ������ ���
            System.out.println( yougChoice.equals("��") ? "������ �¸�" : "ö���� �¸�" );
        } else if(charChoice.equals("��")){     //ö���� ���� ���
            System.out.println( yougChoice.equals("����") ? "������ �¸�" : "ö���� �¸�" );
        }
        //else if ���� �ȿ��� ���� �����ڸ� �̿��Ͽ� �Ǻ�. ������ ������ �¸� ����(ex. ö: ���� -> ����: ����)
    }
}
