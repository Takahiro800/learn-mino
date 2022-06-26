import java.util.EmptyStackException;

class Bad {
    /**
     * 鎧を装備する
     *
     * @param memberID 装備変更したいメンバーのID
     * @param newArmor 装備する鎧
     */

    void equipArmor(int memberId, Armor newAromor) {
        if (party.members[memberId].equipments.canChange) {
            party.members[memberId].equipments.armor = newAromor;
        }
    }
    /*
     * メソッドチェインを使い、階層構造になっているくるの、かなり深い要素にアクセスしている
     *
     * 低凝集になる、よくない例
     *
     * - armorへ代入しているが、代入するコードをどこでも書けてしまう
     *
     * - 似たようなコードが複数箇所に実装される恐れがある
     *
     * - membersやeequipmentsも同様
     */

}


// ##########################################################
class Equipment {
    String name;
    int price;
    int defence;
    int magicDefence;
}


class Equipments {
    private boolean canChange;
    private Equipment head;
    private Equipment armor;
    private Equipment arm;

    /**
     * 鎧を装備する
     *
     * @parama newAromor 装備する鎧
     */
    void equipArmor(final Equipment newArmor) {
        if (canChange) {
            armor = newArmor;
        }
    }

    /*
     * 全装備を解除する
     */
    void deactivateAll() {
        head = Equipment.EMPTY;
        armor = Equipment.EMPTY;
        arm = Equipment.EMPTY;
    }
}
