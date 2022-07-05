package chapter08.selling.good;

// 8.27 販売価格クラス
class SellingPrice {
    final int amount;

    SellingPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("価格が０以上でありません。");
        }
        this.amount = amount;
    }
}
