package chapter10.gerund;

import java.util.List;

// 10.19 敵を表現するクラス・メソッド名に注目
class Enemy {
    boolean isAppeared;
    int magicPoint;
    Item dropItem;

    // 逃げる
    void escape() {
        isAppeared = false;
    }

    // 魔法力を消費する
    void consumeMagicPoint(int costMagicPoint) {
        magicPoing -= costMagicPoint;
        if (magicPoint < 0) {
            magicPoint = 0;
        }
    }

    // 主人公らのパーティにアイテムを追加する
    // 追加できた場合はtrueを返す
    boolean addItemParty(List<Item> items) {
        if (itmes.size() < 99) {
            items.add(dropItem);
            return true;
        }
        return false;
    }
}
