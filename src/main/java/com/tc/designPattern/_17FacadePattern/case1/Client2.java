package com.tc.designPattern._17FacadePattern.case1;

import com.tc.designPattern._17FacadePattern.case1.facade.GenCodeFacade;
import com.tc.designPattern._17FacadePattern.case1.module.CodeGenerate;

/**
 * 外观模式
 * Author:tangcheng
 * Date:2016/6/18
 * Time:16:37
 * DESCR:
 */
public class Client2 {
    public static void main(String args[]){
        CodeGenerate genCodeFacade = new GenCodeFacade();
        genCodeFacade.generate();
    }
}
