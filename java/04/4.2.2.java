import java.util.*;

class Main {
    public static void main(String[] args) {
        AttackPower attackPowerA = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPowerA);
        System.out.println("Weapon A attack power: " + weaponA.attackPower.value);

        attackPowerA.reinForce(new AttackPower(15));
        System.out.println("Weapon A attack power: " + weaponA.attackPower.value);
    }


}


// 攻撃力を表現するクラス
class AttackPower {
    static final int MIN = 0;
    // 4.18
    final int value;

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    /*
     * 攻撃力を強化する
     *
     * @params incremet 攻撃力の増分
     */
    AttackPower reinForce(final AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    /*
     * 無力化する
     */

    AttackPower disable() {
        return new AttackPower(MIN);
    }
}


// 武器を表現するクラス
class Weapon {
    final AttackPower attackPower;

    Weapon(AttackPower attackPower) {
        this.attackPower = attackPower;
    }

    /*
     * 武器を強化する
     *
     * @param increment 攻撃力の増分
     *
     * @return 強化した武器
     */

    Weapon reinForce(final AttackPower increment) {
        final AttackPower reinForced = attackPower.reinForce(increment);

        return new Weapon(reinForced);
    }

}
