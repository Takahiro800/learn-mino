package chapter14.webcomic;

import chapter14_refactoring.webcomic.PurchasePoint;

public class Comic {
    public Comic id;
    public PurchasePoint currentPurchasePoint;

    public boolean isEnabled() {
        return true;
    }

    public boolean isDisabled() {
        return false;
    }
}
