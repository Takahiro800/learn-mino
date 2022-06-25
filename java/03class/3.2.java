/**
 * main
 */
import java.util.Currency;

// 3.2 必ずコンストラクターで初期化する
class Money {
    int amount;
    Currency currency;

    Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
        // todo: 不正値を渡せてしまう
        // Money money = new Money(-100, null);
    }

}
