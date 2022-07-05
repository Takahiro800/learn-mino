package chapter08.commonextend.v1;

// 8.10 基底クラスでの悪しき共通化
// 割引の抽象基底
abstract class DiscountBase {
    protected int price; // 元値

    // 割引価格を返す
    int getDiscountedPrice() {
        int discountedPrice = price - 300;
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }
        return discountedPrice;
    }
}
