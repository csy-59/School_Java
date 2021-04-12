import java.util.Scanner;
class TestEmployee{
    public static void main(String args[]){
        //입력을 위한 Scanner
        Scanner scan = new Scanner(System.in);

        //Employee 배열 참조 변수 선언 & 생성
        Employee[] employeeList = new Employee[2];
        //후 for문에 사용하기 위한 상수 설정
        final int LIST_SIZE = employeeList.length;

        //사용자에게 데이터 받아오기: for문 이용. 
        for(int i=0;i<LIST_SIZE;i++){
            //배열에 저장 전 임시 저장소, 이 객체에 직원 데이터를 설정해준다.
            Employee buff = new Employee(); 
            System.out.print("이름을 입력하세요[직원번호" + (i+1) +"] : ");
            String name = scan.nextLine();
            buff.setName(name);
            System.out.print("주소을 입력하세요[직원번호" + (i+1) +"] : ");
            String address = scan.nextLine();
            buff.setAddress(address);
            System.out.print("연봉을 입력하세요[직원번호" + (i+1) +"] : ");
            int salary = scan.nextInt();
            buff.setSalary(salary);
            System.out.print("전화번호을 입력하세요[직원번호" + (i+1) +"] : ");
            int phoneNumber = scan.nextInt();
            buff.setPhoneNumber(phoneNumber);

            //buff를 배열에 저장
            employeeList[i] = buff;
            //오류해결! scanner의 버퍼 지우기
            scan.nextLine();
        }

        //3번: 수정 메뉴(y, Y만 고려)
        System.out.println("수정하시겠습니까?");
        //오류해결! 문자 하나만 받을 것이기 때문에 scan으로 받은 문자열의 첫문자만 사용.
        char modify = scan.nextLine().charAt(0);
        if(modify == 'y' || modify == 'Y'){ //y나 Y일 경우에만 실행
            System.out.println("수정하고 싶은 직원번호를 입력하세요 :");
            int modifyNum= scan.nextInt()- 1;   //받은 번호의 -1로 배열에 접근

            //scanner의 버퍼 지우기
            scan.nextLine();

            //직원정보 입력 코드 그대로 사용
            Employee buff = new Employee(); 
            System.out.print("이름을 입력하세요 : ");
            String name = scan.nextLine();
            buff.setName(name);
            System.out.print("주소을 입력하세요 : ");
            String address = scan.nextLine();
            buff.setAddress(address);
            System.out.print("연봉을 입력하세요 : ");
            int salary = scan.nextInt();
            buff.setSalary(salary);
            System.out.print("전화번호을 입력하세요 : ");
            int phoneNumber = scan.nextInt();
            buff.setPhoneNumber(phoneNumber);

            //buff를 배열에 저장
            employeeList[modifyNum] = buff;
        }

        //배열에 저장된 모든 데이터 출력
        for(int i=0;i<LIST_SIZE;i++){
            System.out.println("직원번호[" + (i+1) + "]\t" + employeeList[i].toString());
        }
    }
}