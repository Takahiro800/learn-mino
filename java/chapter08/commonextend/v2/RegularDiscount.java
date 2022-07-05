package chapter08.commonextend.v2;

class RegularDiscount extends DiscountBase {
    @Override
    protected int discountCharge() {
        return 400;
    }
}
