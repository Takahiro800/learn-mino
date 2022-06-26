import java.util.*;

class Main {
    // 6.32 処理切り替えをMapで実現
    final Map<MagicType, Magic> magics = new HashMap<>();

    Member member = new Member();

    final Fire fire = new Fire(member);
    final Shiden shiden = new Shiden(member);

    final HellFire hellFire = new HellFire(member);

    // magics.put(Magictype.fire,fire);
    // magics.put(Magictype.shiden,shiden);
    // magics.put(Magictype.hellFire,hellFire);

    // 6.33 魔法攻撃力の切り替え
    // 6.34 Magic interfaceによる魔法処理の全切替
    void magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
        consumeTechnicalPoint(usingMagic);
        magicDamage(usingMagic);
    }

    // 魔法の名前を画面表示する
    void showMagicName(final Magic magic) {
        final String name = magic.name();
        // nameを使った処理
    }

    // 魔法を消費する
    void consumeMagicPoint(final Magic magic) {
        final int costMagicPoint = magic.costMagicPoint();
        // costMagicPointを使った魔法力消費処理
    }

    // テクニカルポイントを消費する
    void consumeTechnicalPoint(final Magic magic) {
        final int costTechniaclPoint = magic.costTechnicalPoint();
        // costTechnicalPointを使ったテクニカルポイント消費処理
    }

    // ダメージ計算する
    void magicDamage(final Magic magic) {
        final int attackPower = magic.attackPower();
        // attackPowerを使ったダメージ計算
    }

}


enum MagicType {
    fire, // ファイア。炎の魔法。
    shiden, // 紫雷。雷の魔法。
    hellFire, // 地獄の業火
}


// 6.28 魔法型を表現するinterface
interface Magic {
    String name();

    int costMagicPoint();

    int attackPower();

    int costTechnicalPoint();
}


// 6.29 魔法『ファイア』を表現するクラス
class Fire implements Magic {
    private final Member member;

    Fire(final Member member) {
        this.member = member;
    }

    public String name() {
        return "ファイア";
    }

    public int costMagicPoint() {
        return 2;
    }

    public int attackPower() {
        return 20 + (int) (member.level * 0.5);
    }

    public int costTechnicalPoint() {
        return 0;
    }

}


// 6.30 魔法『紫雷』を表現するクラス
class Shiden implements Magic {
    private final Member member;

    Shiden(final Member member) {
        this.member = member;
    }

    public String name() {
        return "紫雷";
    }

    public int costMagicPoint() {
        return 5 + (int) (member.level * 0.2);
    }

    public int attackPower() {
        return 50 + (int) (member.agility * 1.5);
    }

    public int costTechnicalPoint() {
        return 5;
    }
}


// 6.31 魔法『地獄の業火』を表現するクラス
class HellFire implements Magic {
    private final Member member;

    HellFire(final Member member) {
        this.member = member;
    }

    public String name() {
        return "地獄の業火";
    }

    public int costMagicPoint() {
        return 16;
    }

    public int attackPower() {
        return 200 + (int) (member.magicAttack * 0.5 + member.vitality * 2);
    }

    public int costTechnicalPoint() {
        return 20 + (int) (member.level * 0.4);
    }
}


class Member {
    int level;
    int agility;
    int magicAttack;
    int vitality;
}
