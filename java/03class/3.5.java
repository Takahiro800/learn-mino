/**
 * main
 */
import java.util.Currency;
import java.util.Locale;

class Money {
    // 3.7 final修飾子で不変にする
    final int amount;
    final Currency currency;

    // 3.4 コンストラクタで正常値のみが確実に設定される仕組み
    Money(int amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("金額には0以上を指定してください");
        }
        if (currency == null) {
            throw new IllegalArgumentException("通貨単位を指定してください");
        }
        this.amount = amount;
        this.currency = currency;
    }

    // 3.5 Moneyクラスに金額加算メソッドを用意
    // void add(int other) {
    // amount += other;
    // }

    // 3.9 変更値を持ったMoneyクラスのインスタンスを生成する
    // 3.10 メソッドの引数にもfinalをつける
    Money add(final int other) {
        // 3.13 ローカル変数も不変にする
        final int added = amount + other;
        return new Money(added, currency);
    }

};
