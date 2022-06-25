import java.util.*;

class Main {
    public static void main(String[] args) {
        // 5.16 何が起こるだろう？
        discountMAnager.set(money);

    }
}


class ActorManager {
    // ゲームキャラの位置を移動する
    void shift(Location location, int shiftX, int shiftY) {
        location.x += shiftX;
        location.y += shiftY;
    }
}

/*
 * 出力として用いる引数を出力引数と呼ぶ。 低凝集を引き起こす
 *
 *
 */


// 5.15 全く同じメソッドが別のクラスにも実装される恐れがある
class SpecialAttackManager {
    void shift(Location locatin, int shiftX, int shiftY) {

    }
}


class DiscountManager {
    // 割引を適用する
    void set(MoneyData money) {
        money.amount -= 2000;
        if (money.amount < 0) {
            money.amount = 0;
        }
    }
}

/*
 * 引数が入力値なのか出力なのか、メソッドの内部を確認しないとわからなくなってしまう。
 *
 *
 * 出力引数として設計せず、オブジェクト指向設計の基本に基づいてデータとデータを操作するロジックを同じクラスに凝集すべき
 */
