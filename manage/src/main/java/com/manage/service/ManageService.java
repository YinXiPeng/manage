package com.manage.service;

import com.manage.pojo.Menu;

public interface ManageService {
    //密码比对
    public Boolean EqPwd(String pwd,String uname);
    //根据mid查找权限
    public Menu FindMenu(String uname);
}
