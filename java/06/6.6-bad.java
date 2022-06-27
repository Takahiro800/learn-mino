public class FlagLogic {
    Member member;

    // 6.60
    // 引数でメソッドの機能を切り替えているboolean型をフラグ引数。
    void damage(boolean damageFalg, int damageAmount) {
        if (damageFalg == true) {
            // ヒットポイントダメージ
            member.hitPoint -= damageAmount;
            if (0 < member.hitPoint)
                return;

            member.hitPoint = 0;
            member.addState(StateType.dead);
        } else {
            // 魔法力ダメージ
            member.magicPoint -= damageAmount;
            if (0 < member.magicPoint)
                return;

            member.magicPoint = 0;
        }

    }
}


class Member {
    final int hitPoint;
    final int magicPoint;

    Member(int hitPoint, int magicPoint) {
        this.hitPoint = hitPoint;
        this.magicPoint = magicPoint;
    }

}
