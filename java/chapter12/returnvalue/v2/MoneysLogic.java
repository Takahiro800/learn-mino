package chapter12.returnvalue.v2;

public class MoneysLogic {
    Price productPrice;
    Price otherPrice;

    // 12.8 金額の種類が一目瞭然
    void method() {
        Price price = productPrice.add(otherPrice);
        DiscountedPrice discountedPrice = new DiscountedPrice(price);
        DeliveryPrice deliveryPrice = new DeliveryPrice(discountedPrice);
    }
}
