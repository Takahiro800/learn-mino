import java.math.BigDecimal;
import java.util.*;

class Main {
    public static void main(String[] args) {

    }
}


// 5.12 共通処理クラスを安易につくらず、オブジェクト指向設計の基本に基づいて設計する
class AmountIncludingTax {
    final BigDecimal value;

    AmountIncludingTax(final AmountExcludingTax amountExcludingTax, final TaxRate taxRate) {
        value = amountExcludingTax.value.multiply(taxRate.value);
    }

}
