//1부터 100사이의 발생된 임의의 숫자를 5번안에 맞추는 게임.
//

import java.util.Scanner;
import java.util.Random;

public class FindNumGame {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ranGen = new Random();
		int ranNum, answer, count=1;
		ranNum=ranGen.nextInt(100)+1;
		while(count<6) {
		// 여기를 채우세요
		// 입력한 숫자와 랜덤값을 비교해서 작은가 큰가를 사용자에게 알려준다
		//  맞춘경우는  몇번만에 정답을 맞추었습니다  라고 표시 후 종료
			System.out.print("숫자 입력: ");	
			answer = scan.nextInt();	//입력받기

			if(ranNum == answer){		//정답일 시
				System.out.println("축하합니다! "+count+"번만에 정답을 맞추었습니다!");
				break;
			}
			else if(ranNum>answer){		//랜덤값이 더 클 경우
				System.out.println("오답! 정답은 " + answer + "보다 큽니다");
				count++;
			}
			else if(ranNum<answer){		//랜덤값이 더 작을 경우
				System.out.println("오답! 정답은 " + answer + "보다 작습니다");
				count++;
			}
		}
		if (count==6)
			System.out.println("정답을 5번 시도에 맞추지 못했습니다.");

		scan.close();

	}

}
