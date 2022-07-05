package chapter08.util.v1;

import chapter08.util.MailMagazine;
import chapter08.util.ViewSettings;

// 8.18 責務の異なるメソッドが詰め込まれたクラス
class Util {
    private int reservationId; // 商品の予約ID
    private ViewSettings viewSettings; // 画面表示の設定
    private MAilMagazine mailMagazine; // メールマガジン

    void cancelReservation() {
        // reservationID を使った予約キャンセル処理
    }

    void darkMode() {
        // vewSettingsを使ったダークモード表示への変更処理
    }

    void beginSendMail() {
        // mailMagazineを使っためーrう配信開始処理
    }
}
