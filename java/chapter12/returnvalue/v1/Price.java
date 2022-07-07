package chapter12.returnvalue.v1;

// 12.4 プリミティブ型では意図が不明瞭になる
class Price {
    int amount;

    // 省略

    int add(final Price other) {
        return amount + other.amount;
    }
}
