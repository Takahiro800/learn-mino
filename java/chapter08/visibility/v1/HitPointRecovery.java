package chapter08.visibility.v1;

import chapter08.visibility.v1.Member;
import chapter08.visibility.v1.PositiveFeelings;

public class HitPointRecovery {
    /**
     * @param chanter 回復魔法の詠唱者
     * @param targetMemberId 回復魔法を受けるメンバーのID
     * @param positiveFeelings メンバー同士の好感度
     */

    public HitPointRecovery(final Member chanter, final int tergetMemberId,
            final chapter08_tightcoupling.visibility.v1.PositiveFeelings positiveFeelings) {
        final int basicRecoverAmount = (int) (chanter.magicPower * MAGIC_POWER_COEFFICIENT)
                + (int) (chanter.affection * AFFECTION_COEFFICIENT
                        * positiveFeelings.value(chanter.id, targeMember.id));
    }

    final float MAGIC_POWER_COEFFICIENT = 0.1f;
    final float AFFECTION_COEFFICIENT = 0.1f;
}
