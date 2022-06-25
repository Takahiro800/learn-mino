import java.math.BigDecimal;

import java.util..*;;

class Main {
    public static void main(String[] args) {

    }
}

// 5.10 Commonクラス
/*
 * 色々なメソッドが雑多にあるため、底凝集構造でグローバル変数が出現しやすくなりがち
 */
class Common {
    // 税込金額を計算する
    static BigDecimal calcAmountIncludingTax(BigDecimal amountExcludingTax, BigDecimal taxRate) {}

    // ユーザーが退会済みの場合true
    static boolean hasResigned(User user){}

    // 有効な電話番号である場合true
    static boolean IsValidPhoneNumber(String phoneNumber) {}
}
