/**
 * main
 */

// ヒットポイント（HP）を表現するクラス
public class HitPoint {
    private static final int MIN = 0;
    private static final int MAX = 999;
    final int value;

    HitPoint(final int value) {
        if (value < MIN)
            throw new IllegalArgumentException(MIN + "以上を指定してください");
        if (value > MAX)
            throw new IllegalArgumentException(MAX + "以下を指定してください");

        this.value = value;
    }

    // ダメージを与える
    HitPoint damage(final int damageAmount) {
        final int damaged = value - damageAmount;
        final int corrected = damaged < MIN ? MIN : damaged;
        return new HitPoint(corrected);
    }

    // 回復する
    HitPoint recover(final int recoveryAmount) {
        final int recoverd = value + recoveryAmount;
        final int corrected = recoverd > MAX ? MAX : recoverd;

        return new HitPoint(corrected);
    }

}
