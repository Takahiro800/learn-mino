// 6.1 if文で多重にネストした構造

class Bad {
    // 生存しているか判定
    if (member.hitPoint > 0) {
        // 行動可能か判定
        if (member.canAct()) {
            // 魔法力が残存しているか判定
            if (magic.costMagicPoint <= member.magicPoint) {
                member.consumeMagicPoint(magic.costMagicPoint);
                member.chant(magic);
            }
        }
    }
}


// 全てのネストを早期returnで解消
class Refacotr {
    // 生存していない場合returnで処理を終了する
    // 早期return への変更には、条件を反転してる

    if (member.hitPoint < 0) return;

    if (!member.canAct()) return ;
    if (member.magicPoint < magic.costMagicPoint) return;


    member.consumeMagicPoint(magic.costMagicPoint);
    member.chant(magic);
}