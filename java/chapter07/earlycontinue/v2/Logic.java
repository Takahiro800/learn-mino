package chapter07.earlycontinue.v2;

import chapter07.earlycontinue.Member;
import chapter07.earlycontinue.StateType;

import java.util.List;

public class Logic {
    List<Member> members;

    void method() {
        for (Member member : members) {
            // 生存していない場合continueで次のループ処理に移行する
            // 早期continueへの変更には、条件を反転させる。
            if (member.hitPoint == 0)
                continue;
            if (member.containState(StateType.poison)) {
                member.hitPoint -= 10;
                if (member.hitPoint <= 0) {
                    member.hitPoint = 0;
                    member.addState(StateType.dead);
                    member.removeState(StateType.posion);
                }
            }
        }
    }
}
