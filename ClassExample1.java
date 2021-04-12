class ClassExample1 {
    public static void main(String args[]) {
        GoodsStock obj;	//변수 선언
        //obj = new GoodsStock();	//객체 생성. 해당 객체의 시작 주소를 obj에 넣음, 객체를 레퍼런스 하고 있음
        //obj.goodsCode = "52135";
        //obj.stockNum = 200;

        obj = new GoodsStock("52135", 200);    //생성자 함수 호출

        System.out.println("상품코드: " + obj.goodsCode);
        System.out.println("재고수량: " + obj.stockNum);
        obj.addStock(1000);
        System.out.println("상품코드: " + obj.goodsCode);
        System.out.println("재고수량: " + obj.stockNum);
    }
}
        