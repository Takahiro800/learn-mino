package chapter10.booleanmethod.v2;

import chapter10.booleanmethod.StateType;
import chapter10.booleanmethod.States;

// 10.22 英文にして違和感のないクラスへメソッドを移動
class Member {
    private final chapter10_namedesign.booleanmethod.States states;

    boolean isInConfusion() {
        return states.contains(StateType.confused);
    }
}
