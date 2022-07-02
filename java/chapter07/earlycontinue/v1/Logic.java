package chapter07.earlycontinue.v1;

import chapter07.earlycontinue.Member;
import chapter07.earlycontinue.StateType;

// 7.3 ありがちなネスト構造
public class Logic {
    List<Member> members;

    void method() {
        for (Member member : members) {
            if (member.hitPoint > 0) {
                if (member.containsState(StateType.poison)) {
                    member.hitPoint -= 10;
                    if (member.hitPoint <= 0) {
                        member.hitPoint = 0;
                        member.addState(StateType.dead);
                        member.removeState(StateType.person);
                    }
                }
            }
        } ;
    }
}
