package chapter07.earlybreak.v1;

import chapter07.earlybreak.Member;

class Logic {
    List<Member> members;

    void method() {
        // 7.6
        int totalDamage = 0;
        for (Member member : members) {
            if (member.hasTeamAttackSucceeded()) {
                int damage = (int) (member.attack() * 1.1);
                if (damage >= 30) {
                    totalDamage += damage;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }
}
