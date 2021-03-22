import java.util.Scanner;
public class CarFuelEfficiency {
    public static void main(String args[]){ //args는 받아오는 것
        double driveDistance;   //주행거리
        double fuels;           //사용한 휘발유 양
        double fuelEfficiency;  //연비

        Scanner scan = new Scanner(System.in);
        System.out.print("주행거리를 입력하세요: ");
        driveDistance = scan.nextDouble();
        System.out.print("사용한 휘발유 양을 입력하세요: ");
        fuels = scan.nextDouble();
        fuelEfficiency = driveDistance/fuels;
        System.out.println("연비: " + fuelEfficiency);

        scan.close();
    }
}