// 6.10
enum MagicType {
    fire, // ファイア。炎の魔法。
    shiden // 紫雷。雷の魔法。
}


class MAgicManager {
    // 6.11 switch文で表示名を切り替え
    String getName(MagicType magicType) {
        String name = "";

        switch (magicType) {
            case fire:
                name = "ファイア";
                break;
            case shiden:
                name = "紫雷";
                break;
        }
        return name;
    }

    // 6.12 消費魔法力をswtch文で切り替え
    int costMagcPoint(MagicType magicType, Member member) {
        int magicPoint = 0;

        switch (magicType) {
            case fire:
                magicPoint = 2;
                break;
            case shiden:
                magicPoint = 5 + (int) (member.level * 0.2);
                break;
        }
        return magicPoint;
    }

    // 6.13 魔法攻撃力をswitch文で切り替え
    int attackPower(MagicType magicType, Member member) {
        int attackPower = 0;

        switch (magicType) {
            case fire:
                attackPower = 20 + (int) (member.level * 0.5);
                break;
            case shiden:
                attackPower = 50 + (int) (member.level * 1.5);
                break;
        }
        return attackPower;
    }
}



// 6.12
class Member {
    int level;
}
