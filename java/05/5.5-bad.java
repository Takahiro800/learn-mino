import java.util.*;

class Main {

    // 5.23 たくさんの値をバラバラに渡している。→ 引数が多くなっている
    // 不注意で正しくない値を代入してしまう可能性が高まる
    int recoverMagicPoint(int currentMagicPoint, int originalMagicPoint,
            List<Integer> maxMagicPointIncrements, int recoveryAmount) {
        int currentMaxMagicPoint = originalMagicPoint;
        for (int each : maxMagicPointIncrements) {
            currentMaxMagicPoint += each;

        }

        return Math.min(currentMaxMagicPoint + recoveryAmount, currentMaxMagicPoint);
    }

}


// 5.24 プリミティブ執着の例
class Common {
    /*
     * @param regularPrice 定価
     *
     * @param discountRate 割引率
     *
     * @return 割引価格
     */

    int discountedPrice(int regularPrice, float discountRate) {
        if (regularPrice < 0) {
            throw new IllegalArgumentException();
        }
        if (discountRate < 0.0f) {
            throw new IllegalArgumentException();
        }
    }
}


// 5.25 プリミティブ型に執着するとコード重複が生じやすい
// 重複コードや演算ロジックがあちこちに無秩序に実装されやすくなる
class Utill {
    /*
     * @param regularPrice 定価
     *
     * @return 適切価格である場合true
     */

    Boolean isFairPrice(int regularPrice) {
        if (regularPrice < 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}


// 5.28 引数ではなくインスタンス変数として表現する
// 魔法力
class MAgicPoint {
    // 現在の魔法力残量
    int currentAmount;

    // オリジナルの魔法力最大値
    int originalMaxAmount;

    // 魔法力最大値の増分
    List<Integer> maxIncrements;
}
