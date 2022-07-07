package chapter12.returnvalue.v1;

public class MoneysLogic {
    Price productPrice;
    Price otherPrice;

    int calcDiscountedPrice(int value) {
        return 0;
    }

    int calcDeliveryPrice(int value) {
        return 0;
    }

    // 12.5 どれがどの金額か分かりにくくなる
    void method() {
        int price = productPrice.add(ohterPrice); // 商品価格の総額
        int discountedPrice = calcDiscountedPrice(price); // 割引金額
        int deliveryPrice = calcDeliveryPrice(discountedPrice); // 配送料
    }
}
