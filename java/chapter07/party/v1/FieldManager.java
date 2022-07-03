package chapter07.party.v1;

import chapter07.party.Member;

import java.util.List;
import javax.management.RuntimeErrorException;

// 7.8
// フィールドマップ上の制御を担当するクラス
class FieldManager {
    // パーティの最大メンバー数
    static final int MAX_MAMBER_COUNT = 4;

    // 中略

    // メンバーを追加する
    void addMember(List<Member> members, Member newMember) {
        if (members.stream().anyMatch(member -> member.id == newMmeber.id)) {
            throw new RuntimeException("すでにパーティに加わっています");
        }
        if (members.size() == MAX_MAMBER_COUNT) {
            throw new RuntimeException("これ以上メンバーを追加できません");
        }

        members.add(newMember);
    }

    // パーティメンバーが1人でも生存してる場合trueを返す
    boolean partyIsAlive(List<Member> members) {
        return members.stream().anyMatch(member -> member.isAlive());
    }

}


// 7.9 ゲーム中の特別イベントを制御するクラス
class SpecialEventManager {
    // メンバーを追加する
    void addMember(List<Member> members, Member member) {
        members.add(member);
    }
}
