class GoodsStock {
    String goodsCode;
    int stockNum;
    GoodsStock(String code, int num) {    //���� �Ķ���Ϳ� ������ �̸��� ���� ��� �տ� this.���ٿ���. (this.goodsCode = goodsCode;) �Ķ���� ������ ������ ������ �� ����. Ŭ���� �̸�
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