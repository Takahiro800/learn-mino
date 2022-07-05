package chapter09.nullproblem.v1;

public class ShowLogic {
    Equipment body;

    // 体防具を表現する
    void showBodyEquipment() {
        if (body != null) {
            showParam(body.name);
            showPram(body.defence);
            showPram(body.magicDefence);
        }
    }

    void showPram(Object text) {}
}
