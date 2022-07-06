package chapter10.booleanmethod.v1;

import chapter10.booleanmethod.StateType;

// 10.21 混乱状態を調べるメソッド
class Common {
    // メンバーが混乱状態であればtrueを返す
    static boolean isMemberInConfusion(Member member) {
        return member.states.contains(StateType.confused);
    }
}
