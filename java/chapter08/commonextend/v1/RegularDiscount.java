package chapter08.commonextend.v1;

/**
 * 8.13 オーバーライドでの仕様変更 割引価格を400に変更した
 */
class RegularDiscount extends DiscountBase {
    @Override
    int getDiscountedPrice() {
        int discountedPrice = price - 400;
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }

        return discountedPrice;
    }
}
