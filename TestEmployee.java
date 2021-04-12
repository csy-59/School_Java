import java.util.Scanner;
class TestEmployee{
    public static void main(String args[]){
        //�Է��� ���� Scanner
        Scanner scan = new Scanner(System.in);

        //Employee �迭 ���� ���� ���� & ����
        Employee[] employeeList = new Employee[2];
        //�� for���� ����ϱ� ���� ��� ����
        final int LIST_SIZE = employeeList.length;

        //����ڿ��� ������ �޾ƿ���: for�� �̿�. 
        for(int i=0;i<LIST_SIZE;i++){
            //�迭�� ���� �� �ӽ� �����, �� ��ü�� ���� �����͸� �������ش�.
            Employee buff = new Employee(); 
            System.out.print("�̸��� �Է��ϼ���[������ȣ" + (i+1) +"] : ");
            String name = scan.nextLine();
            buff.setName(name);
            System.out.print("�ּ��� �Է��ϼ���[������ȣ" + (i+1) +"] : ");
            String address = scan.nextLine();
            buff.setAddress(address);
            System.out.print("������ �Է��ϼ���[������ȣ" + (i+1) +"] : ");
            int salary = scan.nextInt();
            buff.setSalary(salary);
            System.out.print("��ȭ��ȣ�� �Է��ϼ���[������ȣ" + (i+1) +"] : ");
            int phoneNumber = scan.nextInt();
            buff.setPhoneNumber(phoneNumber);

            //buff�� �迭�� ����
            employeeList[i] = buff;
            //�����ذ�! scanner�� ���� �����
            scan.nextLine();
        }

        //3��: ���� �޴�(y, Y�� ���)
        System.out.println("�����Ͻðڽ��ϱ�?");
        //�����ذ�! ���� �ϳ��� ���� ���̱� ������ scan���� ���� ���ڿ��� ù���ڸ� ���.
        char modify = scan.nextLine().charAt(0);
        if(modify == 'y' || modify == 'Y'){ //y�� Y�� ��쿡�� ����
            System.out.println("�����ϰ� ���� ������ȣ�� �Է��ϼ��� :");
            int modifyNum= scan.nextInt()- 1;   //���� ��ȣ�� -1�� �迭�� ����

            //scanner�� ���� �����
            scan.nextLine();

            //�������� �Է� �ڵ� �״�� ���
            Employee buff = new Employee(); 
            System.out.print("�̸��� �Է��ϼ��� : ");
            String name = scan.nextLine();
            buff.setName(name);
            System.out.print("�ּ��� �Է��ϼ��� : ");
            String address = scan.nextLine();
            buff.setAddress(address);
            System.out.print("������ �Է��ϼ��� : ");
            int salary = scan.nextInt();
            buff.setSalary(salary);
            System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
            int phoneNumber = scan.nextInt();
            buff.setPhoneNumber(phoneNumber);

            //buff�� �迭�� ����
            employeeList[modifyNum] = buff;
        }

        //�迭�� ����� ��� ������ ���
        for(int i=0;i<LIST_SIZE;i++){
            System.out.println("������ȣ[" + (i+1) + "]\t" + employeeList[i].toString());
        }
    }
}