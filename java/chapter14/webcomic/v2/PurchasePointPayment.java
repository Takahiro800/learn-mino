package chapter14.webcomic.v2;

import chapter14.webcomic.*;
import chapter14_refactoring.webcomic.Comic;
import chapter14_refactoring.webcomic.Customer;
import chapter14_refactoring.webcomic.PurchasePoint;
import java.time.LocalDateTime;

// 14.2 条件を反転してネスト解消
// 14.3
class PurchasePointPayment {
    final CustomerId customerId;
    final ComicId comicId;
    final PurchasePoint consumeptionPoint;
    final LocalDateTime paymentDateTime;

    PurchasePointPayment(final Customer customer, final Comic comic) {
        if (!customer.isEnabled()) {
            throw new IllegalArgumentException("有効な購入者ではありません");
        }
        customerId = customer.id;
        if (!comic.isEnabled()) {
            throw new IllegalArgumentException("現在取り扱いのできないコミックです");
        }
        cmoicId = comic.id;
        if (cutomer.possessionPoint.amount < comic.currentPurchasePoint.amount) {
            throw new RuntimeException("所持ポイントが不足しています");
        }
        consumeptionPoint = comic.currentPurchasePoint;
        paymentDateTime = LocalDateTime.now();

    }
}
