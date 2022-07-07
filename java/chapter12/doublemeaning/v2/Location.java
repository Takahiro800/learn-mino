package chapter12.doublemeaning.v2;

// 12.10 エラーは例外をスローする形にする
class Location {
    int x;
    int y;

    boolean valid(int x, int y) {
        return true;
    }

    // 省略

    Location(final int x, final int y) {
        if (!valid(x, y)) {
            throw new IllegalArgumentException("不正な値です");
        }

        this.x = x;
        this.y = y;
    }

    // 位置を移動する
    Location shift(final int shiftX, final int shiftY) {
        int nextX = x + shiftX;
        int nextY = y + shiftY;

        return new Location(nextX, nextY);
    }

}
