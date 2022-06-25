
```java
Currency yen = Currency.getInstance(Locale.JAPAN);
Money money = new Money(300, yen);
final int ticketCount = 3; // チケット枚数
money.add(ticketCount);
```
こんな感じで明らかに、バグになってしまう

### 解決策
- Money型同士のみで加算できるようにする
- プリミティブ型ではなく、独自の型を定義することで思わぬ値を渡すことを防ぐ
