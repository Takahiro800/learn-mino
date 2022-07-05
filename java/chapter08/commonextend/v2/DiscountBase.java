package chapter08.commonextend.v2;

// 8.14 割引金額以外を基底クラスで共通化
abstract class DiscountBase {
    int price;
    // 省略

    int getDiscountedPrice() {
        int discountedPrice = price - discountCharge();
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }

        return discountedPrice;
    }

    // 割引料金
    protected int discountCharge() {
        return 300;
    }
}
