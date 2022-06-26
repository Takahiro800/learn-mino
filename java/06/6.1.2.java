class HealthCondition {
    static HealthCondition dead;
    static HealthCondition danger;
    static HealthCondition caution;
    static HealthCondition fine;
}


class Bad {


    HealthCondition currentHealthCondition;

    HealthConditon test() {
        float hitPointRate = member.hitPoint / member.maxHitPoint;
        HealthCondition currentHealthCondition;

        if (hitPointRate == 0) {
            currentHealthCondition = HealthCondition.dead;
        } else if (hitPointRate < 0.3) {
            currentHealthCondition = HealthCondition.danger;
        } else if (hitPointRate < 0.5) {
            currentHealthCondition = HealthCondition.caution;
        } else {
            currentHealthCondition = HealthCondition.fine;
        }

        return currentHealthCondition;

    }


}


class Refactor {
    HealthConditon test() {
        float hitPointRate = member.hitPoint / member.maxHitPoint;
        HealthCondition currentHealthCondition;

        if (hitPointRate == 0)
            return HealthCondition.dead;
        if (hitPointRate < 0.3)
            return HealthCondition.danger;

        if (hitPointRate < 0.5)
            return HealthCondition.caution;

        return HealthCondition.fine;


    }
}
