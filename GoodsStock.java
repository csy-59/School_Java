class GoodsStock {
    String goodsCode;
    int stockNum;
    GoodsStock(String code, int num) {    //만약 파라미터와 저장할 이름이 같은 경우 앞에 this.을붙여줌. (this.goodsCode = goodsCode;) 파라미터 설정을 생성시 가져갈 수 있음. 클래스 이륵
        goodsCode = code;
        stockNum = num;
    }
    void addStock(int amount) {
        stockNum += amount;
    }
    int substractStock(int amount) {
        if(stockNum < amount)
            return 0;
        stockNum -= amount;
        return amount;
    }
}