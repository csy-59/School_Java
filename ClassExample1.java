class ClassExample1 {
    public static void main(String args[]) {
        GoodsStock obj;	//���� ����
        //obj = new GoodsStock();	//��ü ����. �ش� ��ü�� ���� �ּҸ� obj�� ����, ��ü�� ���۷��� �ϰ� ����
        //obj.goodsCode = "52135";
        //obj.stockNum = 200;

        obj = new GoodsStock("52135", 200);    //������ �Լ� ȣ��

        System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
        System.out.println("������: " + obj.stockNum);
        obj.addStock(1000);
        System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
        System.out.println("������: " + obj.stockNum);
    }
}
        