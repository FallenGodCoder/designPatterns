package com.tc.designPattern._13AdapterPattern.case2;

/**
 * Author:tangc
 * Date:2016/6/18
 * Time:17:12
 * DESCR:
 */
public class RectActionHandler implements Action {
    public void click() {
        System.out.println("你单击了矩形！~");
    }

    public void dbclick() {

    }

    public void mouseOver() {

    }
}
