import java.util.*;

class Main {
    public static void main(String[] args) {
        AttackPower attackPowerA = new AttackPower(20);
        AttackPower attackPowerB = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPowerA);
        Weapon weaponB = new Weapon(attackPowerB);

        weaponA.attackPower.value += 5;

        System.out.println("Weapon A attack power: " + weaponA.attackPower.value);
        System.out.println("Weapon B attack power: " + weaponB.attackPower.value);

    }


}


// 攻撃力を表現するクラス
class AttackPower {
    static final int MIN = 0;
    int value; // finalが付いてないので可変

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }
}


// 武器を表現するクラス
class Weapon {
    final AttackPower attackPower;

    Weapon(AttackPower attackPower) {
        this.attackPower = attackPower;
    }

}
