import java.util.Scanner;
class CountLetter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        //26개 정수를 저장할 수 있는 배열 count를 선언/생성
        int count[] = new int[26];

        System.out.println("문자열을 입력하시오 : ");
        String buffer = scan.nextLine();

        //각 문자가 등장하는 회수를 계산
        for(int i=0;i<buffer.length();i++){
            char ch = buffer.charAt(i);                 //ch에 문자 받아오기
            if(ch == ' ') continue;                     //공백일 경우 넘기기
            else if(ch>='A'&&ch<='Z') count[ch-'A']++;  //대문자(A~Z)일 경우
            else if(ch>='a'&&ch<='z') count[ch-'a']++;  //소문자(a~z)일 경우
        }

        //결과 출력
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);                  //출력을 위한 변수 ch: 출력하려는 알파뱃 설정
            if(count[i] != 0) System.out.println(ch + " : " + count[i]);        //카운트가 0이 아닐 경우만 출력
        }

        scan.close();
    }
}