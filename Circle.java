public class Circle {
    //멤버 변수
    public double radius;		//private: 객체로 생성되어있을때, 객체 내에서는 접근, 확인 가능. but 외부에서는 직접 접근 불가. 맴버 함수로는 접근은 가능.
    final static double PI = 3.141592;	//final: 정적 상수 선언
    
    //생성자
    Circle() {	//매개 변수가 없는 생성자(0.0으로 반지름 설정
        radius = 0.0;
    }
    Circle(double radius) {		//반지름 매개 변수를 받아오는 생성자
        this.radius = radius;		//this. : 해당 객체의 멤버 변수/함수인 것을 알려줌.
    }

    //멤버 함수
    void setRadius(double raidus) {	//반지름 값을 초기화 해주는 함수(초기화이기 때문에 반환 필요X)
        this.radius = radius;
    }
    double getRadius() {	//반지름 값을 반환해주는 함수
        return radius;
    }
    double square(double num) {	//매개변수로 받은 값을 제곱해 반환
        return num*num;
    }
    double getArea() {	//원 면적 계산: square함수와 PI 사용
        return square(radius)*PI;
    }
    double getPerimeter() {	//원의 둘레 계산: PI 사용
        return radius*2*PI;
    }
    public static double getPI() {		//PI 값 반환(정적 메소드)
        return PI;
    }

    
    //main
    public static void main(String[] args) {
        //9번 문제: 객체 없이 square() 호출
        //square(10.0);		//square() 함수 호출: 결과>오류, 객체 생성 없이 접근할 수 없음.
        //10번 문제: 정적 메소드 getPI() 호출하기
        Circle c1 = new Circle();		//기본 생성자 호출
        c1.square(10.0);
        getPI();			//정적 메소드 호출: 결과>오류 없음
    }
    
}