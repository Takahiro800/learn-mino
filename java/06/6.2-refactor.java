enum MagicType {
    fire, // ファイア。炎の魔法。
    shiden, // 紫雷。雷の魔法。
    hellFire, // 地獄の業火
}


class Member {
    int level;
    int agility;
    int magicAttack;
    int vitatlity;
}


class Magic {
    final String name;
    final int costMagicPoint;
    final int attackPower;
    final int costTechnicalPoint;

    Magic(final MagicType magicType, final Member member) {
        switch (magicType) {
            case fire:
                name = "ファイア";
                costMagicPoint = 2;
                attackPower = 20 + (int) (member.level * 0.5);
                costTechnicalPoint = 0;
                break;
            case shiden:
                name = "紫雷";
                costMagicPoint = 5 + (int) (member.level * 0.2);
                attackPower = 50 + (int) (member.agility * 1.5);
                costTechnicalPoint = 5;
                break;
            case hellFire:
                name = "地獄の業火";
                costMagicPoint = 16;
                attackPower = 200 + (int) (member.magicAttack * 0.5 + member.vitatlity * 2);
                costTechnicalPoint = 20 + (int) (member.level * 0.4);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
