package rediments

// 2.1
// 何の計算をしているか謎
func bad1(p1, p2, d1, d2 int) int {
	var d int = 0
	d = p1 + p2
	d = d - ((d1 + d2) / 2)
	if d < 0 {
		d = 0
	}
	return d
}

// 2.2
// 意図が伝わる名前をつける
// todo: 同じ変数に何度も代入する『再代入』をしている。
func refactor2(playerArmPower, playerWeaponPower, enemyBodyDevnce, enemyArmorDefence int) int {
	var damageAmount = 0
	damageAmount = playerArmPower + playerWeaponPower
	damageAmount = damageAmount - ((enemyBodyDevnce + enemyArmorDefence) / 2)

	if damageAmount < 0 {
		return 0
	}
	return damageAmount
}

// 2.3 目的ごとの変数を用意する
func refactor3(playerArmPower, playerWeaponPower, enemyBodyDevnce, enemyArmorDefence int) int {
	totalPlayerAttackPower := playerArmPower + playerWeaponPower
	totalEnemyDefence := enemyBodyDevnce + enemyArmorDefence

	var damageAmount int = totalPlayerAttackPower - (totalEnemyDefence / 2)

	if damageAmount < 0 {
		return 0
	}
	return damageAmount
}
