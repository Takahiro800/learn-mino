package chapter08.selling.good;

// 8.30 配送料クラス
class DeliveryCharge {
    private static final int DELIVERY_FREE_MIN = 2000;
    final int amount;

    DeliveryCharge(final SellingPrice sellingPrice) {
        amount = DELIVERY_FREE_MIN <= sellingPrice.amount ? 0 : 500;
    }
}
