package chapter12.commandquery;

class ModifireLogic {
    int point;

    // 12.2 状態の変更と取得を実行している
    int gainAndGetPoint() {
        point += 10;
        return point;
    }
}
