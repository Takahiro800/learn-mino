// 6.63
interface Damage {
    void execute(final int damageAmount);
}


// 6.64
class HitPointDamage implements Damage {
    Member member;

    // 中略
    public void execute(final int damageAmount) {
        member.hitPoint -= damageAmount;
        if (member.hitPoint > 0)
            return;
        member.hitPoint = 0;
        member.addState(StateType.dead);
    }
}


// 魔法力ダメージ
class MagicPointDamage implements Damage {
    // 中略
    public void execute(final int damageAmount) {
        member.magicPoint -= damageAmount;
        if (member.magicPoint > 0)
            return;
        member.magicPoint = 0;
    }
}


// 6.65 Mapで処理切り替え
enum DamageType {
    hitPoint, magicPoint}

private final Map<DamageType, Damage> damages;

void applyDamage(final DamageType damageType, final int damageAmount) {
    final Damage damage = damages.get(damageType);
    damage.execute(damageAmount);
}
