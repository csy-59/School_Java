public class Employee {
    //������ �ʵ�
    private String name;        //�����̸�
    private String address;     //�ּ�
    private int salary;         //�޿�
    private int phoneNumber;    //��ȭ��ȣ

    //setter ����: this. ���
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
    //getter ����
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
    //toString�޼ҵ�: String ��ü�� �ٷ� ��ȯ
    public String toString(){
        return new String("name: " + name + "\tAddress: " + address + "\tannual_salary: " + salary + "\tphone: " + phoneNumber);
    }
}
