package chapter07.prison.v1;

import chapter07.prison.Item;

import java.util.List;


// 7.1 『牢屋の鍵』の所持を調べるコード
public class PrisonLogic {
    List<Item> items;

    void method() {
        boolean hasPrisonKey = false;
        for (Item each : items) {
            if (each.name.equals("牢屋の鍵")) {
                hasPrisonKey = true;
                break;
            }
        }

    }
}
