import java.util.*;

class Main {

}

class HitPoint {
    int amount;
}

class Member {
    final HitPoint hitPoint;
    final States states;

    /*
     * @param damageAmount ダメージ量
     */

    void damage(int damageAmount) {
        hitPoint.amount -= damegeAmount;
    }
}