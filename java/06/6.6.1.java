public class DamageLogic {
    Member member;

    void hitPointDamage(final int damageAmount) {
        member.hitPoint -= damageAmount;
        if (member.hitPoint > 0)
            return;

        member.hitPoint = 0;
        member.addState(StateType.dead);
    }

    void magicPointDamage(final int damageAmount) {
        member.magicPoint -= damageAmount;
        if (0 < member.magicPoint)
            return;

        member.magicPoint = 0;
    }
}
