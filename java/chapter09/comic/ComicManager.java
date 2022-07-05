package chapter09.comic;

// 9.2 マジックナンバー
class ComicManager {
    int value;

    // 中略
    boolean isOk() {
        return 60 <= value;
    }

    void tryConsume() {
        int tmp = value - 60;
        if (tmp < 0) {
            throw new RuntimeException();
        }
        value = tmp;
    }
}
// 60が何を意味するのかわからない・変更の際にすべての箇所を変更する必要が出てくる
