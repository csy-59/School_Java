public class Employee {
    //데이터 필드
    private String name;        //직원이름
    private String address;     //주소
    private int salary;         //급여
    private int phoneNumber;    //전화번호

    //setter 설정: this. 사용
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    //getter 설정
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getSalary(){
        return salary;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    //toString메소드: String 객체를 바로 반환
    public String toString(){
        return new String("name: " + name + "\tAddress: " + address + "\tannual_salary: " + salary + "\tphone: " + phoneNumber);
    }
}
