package com.tc.designPattern._18MementoPattern.case1;

/**
 * 备忘录
 */
public class Memento {
    // 男孩的状态
    private String state = "";
    // 通过构造函数传递状态信息
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
