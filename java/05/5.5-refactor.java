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


// 5.29 魔法力に関するロジックをカプセル化
class MagicPoint {
    private int currentAmount;
    private int originalMaxAmount;
    private final List<Integer> maxIncrements;

    // 省略

    /* @return 現在の魔法力残量 */
    int current() {
        return currentAmount;
    }

    /* @return 魔法力の最大量 */
    int max() {
        int amount = originalMaxAmount;
        for (int each : maxIncrements) {
            amount += each;
        }
        return amount;
    }

    /**
     * 魔法力を回復する
     *
     * @param recoveryAmount 回復量
     *
     */
    void recover(final int recoveryAmount) {
        currentAmount = Math.min(currentAmount + recoveryAmount, max());
    }

    /**
     * 魔法力を回復する
     *
     * @param consumeAmount 消費量
     */
    void consume(final int consumeAmount) {

    }
}
