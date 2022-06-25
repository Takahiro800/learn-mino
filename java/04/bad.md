```java
int damage (){
	// メンバーの腕力と武器性能が基本攻撃力
	int tmp = member.power() + member.weaponAttck();

	// メンバーのスピードで攻撃力を補正
	tmp = (int)(tmp * (1f + member.speed() / 100f));

	// 攻撃力から敵の防御力を差し引いたのがダメージ
	tmp = tmp - (int)(enemy.defenc / 2);

	// ダメージが負数にならないように補正
	tmp = Math.max(0, tmp);

	return tmp
}
```

### 不変にして再代入を防ぐ
```java
int damage() {
	final int basicAttackPower = member.power() + member.weaponAttack();
	final int finalAttackPower = (int) (basicAttackPower * (1f + member.speed() / 100f));
	final int reduction = (int)(enemy.defenc / 2);
	final int damage = Math.max(0, finalAttackPower - reduction);

	return damage;
 }

```

- 引数もfinalを付与して不変にする

```java

void addPrice(final int productPrice) {
	final int increasedTotalPrice = toalPrice + productPrice;
	if (MAX_TOTAL_PRICE < increasedTotalPrice) {
		throw new IllegalArgumentException("購入金たくの上限を超えています")
	}
}

```