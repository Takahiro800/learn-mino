package chapter09.nullproblem.v2;

// 9.11 「装備なし」をnullでない方法で表現
class Equipment {
    static final Equipment EMPTY = new Equipment("装備なし", 0, 0, 0);

    final String name;
    final int price;
    final int defence;
    final int magicDefence;

    Equipment(final String name, final int price, final int defence, final int magicDefence) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("無効な名前");
        }

        this.name = name;
        this.price = price;
        this.defence = defence;
        this.magicDefence = magicDefence;
    }
}
