package chapter08.visibility.v1;

import chapter08.visibility.v1.PositiveFeelings;

// 8.24 内的に扱いたいクラスが他のパッケージから呼び出されている
/** 戦闘画面 */
public class BattleView {
    PositiveFeelings positiveFeelings;
    Member member1;
    Member member2;

    // 中略

    /** 攻撃アニメーションを開始する */
    public void startAttackAnimation() {
        // 中略
        positiveFeelings.increase(member1.id, member2.id);
    }
}
