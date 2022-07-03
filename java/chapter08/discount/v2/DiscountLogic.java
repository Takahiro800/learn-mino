package chapter08.discount.v2;

// 8.3 割引金額の仕様変更
public class DiscountLogic {
    static int getDiscountPrice(int price) {
        int discountPrice = price - 400;
        if (discountPrice < 0) {
            discountPrice = 0;
        }
        return discountPrice;
    }
}
