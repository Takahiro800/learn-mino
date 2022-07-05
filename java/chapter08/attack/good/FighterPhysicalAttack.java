package chapter08.attack.good;

// 8.9 武闘家の物理攻撃クラス（コンポジション版）
class FighterPhysicalAttack {
    private final PhysicalAttack physicalAttack;

    FigherPhysicalAttack(){
        physicalAttack = new PhysicalAttack();
    }
    // 省略

    int singleAttackDamage() {
        return physicalAttack.singleAttackDamage() + 20;
    }

    int doubleAttackDamage() {
        return physicalAttack.doubleAttackDamage() + 10;
    }
}
