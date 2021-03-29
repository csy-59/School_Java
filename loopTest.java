public class loopTest{
    public static void main(String args[]){
        forTest();
        whileTest();
        dowhileTest();
    }
    
    public static void forTest(){
        int sum, i;
        System.out.println("for문 이용");
        for(sum = 0, i = 1; i<=100;i++)
            if(i%2!=0) sum+=i;
        System.out.printf("\tsum = %d\n", sum);
    }

    public static void whileTest(){
        int sum=0, i=1;
        System.out.println("while문 이용");
        while(i<=100){
            if(i%2!=0) sum+=i;
            i++;
        }
        System.out.printf("\tsum = %d\n", sum);
    }

    public static void dowhileTest(){
        int sum=0, i=1;
        System.out.println("do-while문 이용");
        do{
            if(i%2!=0) sum+=i;
            i++;
        } while(i<=100);
        System.out.printf("\tsum = %d\n", sum);
    }
}