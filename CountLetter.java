import java.util.Scanner;
class CountLetter {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        //26�� ������ ������ �� �ִ� �迭 count�� ����/����
        int count[] = new int[26];

        System.out.println("���ڿ��� �Է��Ͻÿ� : ");
        String buffer = scan.nextLine();

        //�� ���ڰ� �����ϴ� ȸ���� ���
        for(int i=0;i<buffer.length();i++){
            char ch = buffer.charAt(i);
            if(ch == ' ') continue;
            else if(ch>='A'&&ch<='Z') count[ch-'A']++;
            else if(ch>='a'&&ch<='z') count[ch-'a']++;
        }

        //��� ���
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            if(count[i] != 0) System.out.println(ch + " : " + count[i]);
        }

        scan.close();
    }
}