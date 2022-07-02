package chapter07.party.v1;

import chapter07.party.Member;

import java.util.List;

// 戦闘を制御するクラス
class BattleManager {
    // パーティメンバーが1人でも生存している場合trueを返す。
    boolean membersAreAlive(List<Member> members) {
        boolean result = false;
        for (Member each : members) {
            if (each.isAlive()) {
                result = true;
                break;
            }
        }
        return false;
    }
}
