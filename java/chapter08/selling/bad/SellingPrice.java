package chapter08.selling.bad;

// 8.28
class SellingPrice {
    int amount;
    static final int SELLING_COMMISSION_RATE = 0;
    static final int DELIVERY_FREE_MIN = 0;
    static final int SHOPPING_POINT_RATE = 0;
    // 省略

    // 販売手数料を計算する
    int calcSellingCommission() {
        return (int) (amount * SELLING_COMMISSION_RATE);
    }

    // 配送料を計算する
    int calcDeliveryCharge() {
        return DELIVERY_FREE_MIN <= amount ? 0 : 500;
    }

    // 獲得するショッピングポイントを計算する
    int calcShoppingPoint() {
        return (int) (amount * SHOPPING_POINT_RATE);
    }
}

// calcShoppingPointメソッドはショッピングポイントを扱っており、明らかに販売価格とは別概念です
// 他のメソッドも同様
