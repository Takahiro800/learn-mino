import java.util.*;

class Main {
    PurchaseHistory purchaseHistory;

    void method() {
        ExcellentCustomerPolicy goldCustomerPolicy = new ExcellentCustomerPolicy();
        goldCustomerPolicy.add(new GoldCustomerPurchaseAmountRule());
        goldCustomerPolicy.add(new PurcahseFrequencyRule());
        goldCustomerPolicy.add(new ReturnRateRule());

        goldCustomerPolicy.complyWithAll(purchaseHistory);
    }
}


// 6.49 ゴールド会員の方針
class GoldCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    GoldCustomerPolicy() {
        policy = new ExcellentCustomerPolicy();
        policy.add(new GoldCustomerPurchaseAmountRule());
        policy.add(new PurcahseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    /**
     * @param history 購入履歴
     * @return ルールを全て満たす場合 true
     */
    boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }
}


// 6.50 シルバー会員の方針
class SilverCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    SilverCustomerPolicy() {
        policy = new ExcellentCustomerPolicy();
        policy.add(new PurcahseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    /**
     * @parama history 購入履歴
     * @return ルールをすべて満たす場合true
     */
    boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }
}


interface ExcellentCustomerRule {
    /**
     * @return 条件を満たすtrue
     * @param history 購入履歴
     */
    boolean ok(final PurchaseHistory history);
}


// 6.44 ゴールド会員の購入金額ルール
class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 100000 <= history.totalAmount;
    }
}


// 6.45 購入頻度のルール
class PurcahseFrequencyRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 10 <= history.purcahseFrequencyPerMonce;
    }
}


// 6.46 返品率のルール
class ReturnRateRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return history.returnRate <= 0.01;
    }
}


// 6.47 優良顧客の方針を表現するクラス
class ExcellentCustomerPolicy {
    private final Set<ExcellentCustomerRule> rules;

    ExcellentCustomerPolicy() {
        rules = new HashSet();
    }

    /**
     * ルールを追加する。
     *
     * @param rule ルール
     */
    void add(final ExcellentCustomerRule rule) {
        rules.add(rule);
    }

    /**
     * @param history 購入りれき
     * @return ルールを全て満たす場合true
     */
    boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentCustomerRule each : rules) {
            if (!each.ok(history))
                return false;
        }
        return true;
    }
}


class PurchaseHistory {
    int totalAmount;
    int purcahseFrequencyPerMonce;
    float returnRate;
}
