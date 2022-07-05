package chapter08.commonextend.v2;

// 8.16 基底メソッドを完全に上書きしたオーバーライド
class SummerDiscount extends DiscountBase {
    @Override
    int getDiscountedPrice() {
        return (int) (price * (1.00 - 0.05));
    }
}

/**
 * DiscountBase.discountChargeが無関係になる ある継承クラスにとっては関係があっても、別の継承クラスにとっては無関係なメソッドが登場し始めると問題です。
 * どこからどこまで関連があるのか、ロジックの追跡が困難になり、デバッグや仕様変更で辛い思いを味わうことになります。
 */
