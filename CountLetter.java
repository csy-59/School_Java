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
            char ch = buffer.charAt(i);                 //ch�� ���� �޾ƿ���
            if(ch == ' ') continue;                     //������ ��� �ѱ��
            else if(ch>='A'&&ch<='Z') count[ch-'A']++;  //�빮��(A~Z)�� ���
            else if(ch>='a'&&ch<='z') count[ch-'a']++;  //�ҹ���(a~z)�� ���
        }

        //��� ���
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);                  //����� ���� ���� ch: ����Ϸ��� ���Ĺ� ����
            if(count[i] != 0) System.out.println(ch + " : " + count[i]);        //ī��Ʈ�� 0�� �ƴ� ��츸 ���
        }

        scan.close();
    }
}