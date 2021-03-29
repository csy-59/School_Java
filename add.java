public class add {
    public static void main(String args[]){
        //second try
        System.out.println("결과는 " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])) + "입니다");
        
        /*
        //first try
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("결과는 " + (num1 + num2) + "입니다");
        */

        /*
        //classmate's
        int intVal = 0;
        for(String str:args){
            intVal += Integer.valueOf(str);
        }
        System.out.println("결과는 " + intVal + "입니다")
        */
        
        /*
        //third try
        int result = 0;
        for(String str:args){
            result += Integer.parseInt(str);
        }
        System.out.println("결과는 " + result + "입니다");
        */
        
    }
}
