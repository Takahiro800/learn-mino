import java.util.*;

class Main {
    public static void main(String[] args) {
        // 5.5 標準会員の入会ポイント
        GiftPoint standarMemberShipPoint = new GiftPoint(3000);
        GiftPoint premiumMemberShipPoint = new GiftPoint(10000);

        /*
         * 引数で会員の種別ごとに付与するポイントを分けているが、この場合、付与ポイントを変更する際に全てのソースを確認する必要が出てくる
         *
         *
         */

    }
}


class GiftPoint {
    private static final int MIN_POINT = 0;
    final int value;

    GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("ポイントが0以上ではありません");
        }
        value = point;
    }

    /*
     * ポイントを加算する
     *
     * @param other 加算ポイント
     *
     * @return 加算後の残余ポイント
     */
    GiftPoint add(final GiftPoint other) {
        return new GiftPoint(value + other.value);
    }

    /*
     * @return 残余ポイントが消費ポイント以上であればtrue
     */
    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    /*
     * ポイントを消費する。
     *
     * @param point 消費ポイント
     *
     * @return 消費後の残余ポイント
     */

    GiftPoint consume(final ConsumptionPoint point) {
        if (!isEnough(point)) {
            throw new IllegalArgumentException("ポイントが不足しています");
        }
        return new GiftPoint(value - point.value);
    }

}
