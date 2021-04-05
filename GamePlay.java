import java.util.Scanner;
public class GamePlay {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //철수의 선택 입력받기
        System.out.print("철수: ");
        String charsueChoice = input.next();

        //영희의 선택 입력받기
        System.out.print("영희: ");
        String youghiChoice = input.next();

        //결과 출력
        printResult(charsueChoice, youghiChoice);

        input.close();
    }

    //결과 출력
    public static void printResult(String charChoice, String yougChoice){
        if(charChoice.equals(yougChoice)){      //무승부일 경우
            System.out.println("무승부입니다.");
        } else if(charChoice.equals("가위")) {  //철수가 가위일 경우
            System.out.println( yougChoice.equals("바위") ? "영희의 승리" : "철수의 승리" );
        } else if(charChoice.equals("바위")){   //철수가 바위일 경우
            System.out.println( yougChoice.equals("보") ? "영희의 승리" : "철수의 승리" );
        } else if(charChoice.equals("보")){     //철수가 보일 경우
            System.out.println( yougChoice.equals("가위") ? "영희의 승리" : "철수의 승리" );
        }
        //else if 구분 안에는 조건 연산자를 이용하여 판별. 조건은 영희의 승리 경우로(ex. 철: 가위 -> 조건: 바위)
    }
}
