```go

// 2.6 単なる変数として用意
var int hitPoint

// 2.7 どこかに書かれる
hitPoint = hitPoint - damageAmount
if (hitpoint < 0) {
	hitpoint = 0
}

// 2.8 どこかでまた書かれる
hitPoint = hitPoint + revoceryAmount
if (999 < hitPoint) {
	hitPoint = 999
}


```