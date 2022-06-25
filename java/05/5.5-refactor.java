import java.util.*;


class RegularPrice {
    final int amount;

    /* @param amount 金額 */
    RegularPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }
}


// プリミティブではなくクラスの型を渡す
class DiscountedPrice {
    final int amount;

    /*
     * @param regularPrice 定価
     *
     * @param discountRate 割引率
     */
    DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
        // regularPriceと discountRateを使った計算

    }
}
