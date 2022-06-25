import java.util.*;

class Main {
    public static void main(String[] args) {

    }
}


// 5.18 引数を変更しない構造へ改善
class Location {
    final int x;
    final int y;

    Location(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    Location shift(final int shiftX, final int shiftY) {
        final int nextX = x + shiftX;
        final int nextY = x + shiftY;
        return new Location(nextX, nextY);
    }
}
