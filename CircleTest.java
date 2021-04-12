public class CircleTest {
    //main
    public static void main(String args[]) {
        //11번 문제
        Circle c1 = new Circle(5.0);
        System.out.println("원의 넓이: " + c1.getArea());	//c1객체의 getArea() 호출
        System.out.println("원의 둘레: " + c1.getPerimeter());	//c1객체의 getPerimeter() 호출

        //12번 문제
        //Circle.radius = 10.0;	//결과: 오류! radius는 private(외부에서 직접 접근 불가)
        //Circle.square(20.6);	//결과: 오류! square은 정적함수가 아님

        //13번 문제: 결과: 오류! radius/square은 정적변수/함수가 아님
        //14번 문제: 결과: 오류! radius/square은 정적변수/함수가 아님

        //15번 문제: 결과: 오류! square은 정적함수가 아님
        
    }
}