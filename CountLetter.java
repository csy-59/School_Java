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
            char ch = buffer.charAt(i);
            if(ch == ' ') continue;
            else if(ch>='A'&&ch<='Z') count[ch-'A']++;
            else if(ch>='a'&&ch<='z') count[ch-'a']++;
        }

        //결과 출력
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            if(count[i] != 0) System.out.println(ch + " : " + count[i]);
        }

        scan.close();
    }
}