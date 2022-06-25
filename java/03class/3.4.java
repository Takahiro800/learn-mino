/**
 * main
 */
import java.util.Currency;

class Money {
    int amount;
    Currency currency;

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

}
