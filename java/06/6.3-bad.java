class Customer {
    /**
     *
     * @param history 購入履歴
     * @return ゴールド会員である場合true
     *
     */
    boolean isGoldCoustomer(PurchaseHistory history) {
        if (100000 <= history.totalAmount) {
            if (10 <= history.purcahseFrequencyPerMonce) {
                if (history.returnRate <= 0.01) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return シルバー会員である場合true
     * @param history 購入履歴
     */
    boolean isSilverCustomer(PurchaseHistory history) {
        if (10 < history.purcahseFrequencyPerMonce) {
            if (history.returnRate <= 0.01) {
                return true;
            }
        }
        return false;
    }
}


class PurchaseHistory {
    int totalAmount;
    int purcahseFrequencyPerMonce;
    float returnRate;
}
