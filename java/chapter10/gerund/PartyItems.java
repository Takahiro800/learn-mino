package chapter10.gerund;

import java.util.ArrayList;
import java.util.List;
import chapter07_collection.prison.Item;

// 10.20 パーティの所持品を表現するクラス
class PartyItems {
    static final int MAX_ITEM_COUNT = 99;
    final List<Item> items;

    PartyItems() {
        items = new ArrayList<>();
    }

    private PartyItems(List<Item> items) {
        this.items = items;
    }

    PartyItems add(final Items newItem) {
        if (itmes.size() == MAX_ITEM_COUNT) {
            throw new RuntimeException("これ以上アイテムを持てません");
        }

        final List<Item> adding = new ArrayList<>(items);
        adding.add(newItem);
        return new PartyItems(adding);
    }
}
