package com.tc.designPattern._13AdapterPattern.case4;

/**
 * 员工信息接口
 */
public interface IUserInfo {
    // 获得用户名
    public String getUserName();
    // 获得家庭地址
    public String getHomeAddress();
    // 手机号码、这个太重要，手机泛滥呀
    public String getMobileNumber();;
    // 办公电话，一般是座机
    public String getOfficeTelNumber();
    // 这个人的职位是什么
    public String getJobPosition();
    // 获得家庭住址。
    public String getHomeTelNumber();
}
