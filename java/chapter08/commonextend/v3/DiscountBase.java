package chapter08.commonextend.v3;

// 8.17 基底クラスに継承側のロジックを実装
abstract class DiscountBase {
    int price;
    // 省略

    int getDiscountedPrice() {
        if (this instanceof RegularDiscount) {
            int discountedPrice = price - 400;
            if (discountedPrice < 0) {
                discountedPrice = 0;
            }
            return discountedPrice;
        } else if (this instanceof SummerDiscount) {
            return (int) (price * (1.00 - 0.05));
        }

        return 0;
    }
}
