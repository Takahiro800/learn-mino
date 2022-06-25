import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("aaa");
    }

}


class HitPoint {
    private static final int MIN = 0;
    int amount;

    HitPoint(final int amount) {
        if (amount < MIN) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    /*
     * @param damageAmount ダメージ量
     */
    void damage(final int damageAmount) {
        final int nextAmount = amount - damageAmount;
        amount = Math.max(MIN, nextAmount);
    }

    // @return ヒットポイントがゼロであればtrue
    boolean isZero() {
        return amount == MIN;
    }

}


class Member {
    final HitPoint hitPoint;
    final States states;

    /*
     * ダメージを与える
     *
     * @param damageAmount ダメージ量
     */
    void damage(final int damageAmount) {
        hitPoint.damage(damageAmount);
        if (hitPoint.isZero()) {
            states.add(StateType.dead);
        }
    }
}
