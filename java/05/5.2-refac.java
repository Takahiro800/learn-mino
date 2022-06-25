import java.util.*;

class Main {
    public static void main(String[] args) {

    }
}


class GiftPoint {
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBER_POINT = 3000;
    private static final int PREMIUM_MEMBER_POINT = 3000;
    final int value;

    // 外部からはインスタンス生成できない
    // クラス内部でのみインスタンス生成できる
    private GiftPoint(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("ポイントが0以上ではありません");
        }
        value = point;
    }

    /*
     * @return 標準会員向け入荷ギフろポイント
     */
    static GiftPoint forStandarMembership() {
        return new GiftPoint(STANDARD_MEMBER_POINT);
    }

    /*
     * @return プレミアム会員向け入荷ギフろポイント
     */
    static GiftPoint forPremiumMembership() {
        return new GiftPoint(STANDARD_MEMBER_POINT);
    }
}
