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