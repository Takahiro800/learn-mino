package chapter14.webcomic.v6;

import chapter14.webcomic.*;
import chapter14_refactoring.webcomic.Comic;
import chapter14_refactoring.webcomic.ComicId;
import chapter14_refactoring.webcomic.Customer;
import chapter14_refactoring.webcomic.PurchasePoint;
import java.time.LocalDateTime;

class PurchasePointPayment {
    final CustomerId customerId; // 購入者のID
    final ComicId comicId; // 購入するWebコミックのID
    final PurchasePoint consumptionPoint; // 購入で消費するポイント
    final LocalDateTime paymentDateTime; // 購入日時

    PurchasePointPayment(final Customer customer, final Comic comic) {
        if (customer.isDisabled()) {
            throw new IllegalArgumentException("有効な購入者ではありません。");
        }
        if (comic.isDisabled()) {
            throw new IllegalArgumentException("現在取り扱いのできないコミックです。");
        }
        // 14.7 目的を表すメソッドに置き換え
        if (customer.isShortOfPoint(comic)) {
            throw new RuntimeException("所持ポイントが不足しています。");
        }

        customerId = customer.id;
        comicId = comic.id;
        consumptionPoint = comic.currentPurchasePoint;
        paymentDateTime = LocalDateTime.now();
    }
}
