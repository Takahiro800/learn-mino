package chapter07.earlycontinue.v3;

import chapter07.earlycontinue.Member;
import chapter07.earlycontinue.StateType;

import java.util.List;

public class Logic {
    List<Member> members;

    void method() {
        for (Member member : members) {
            if (member.hitPoint == 0)
                continue;
            if (!member.containsState(StateType.poison))
                continue;


            member.hitPoint -= 10;

            if (member.hitPoint > 0)
                continue;

            member.hitPoint = 0;
            member.addState(StateType.dead);
            member.removeState(stateType.poison);
        }
    }
}
