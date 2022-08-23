package com.manage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private byte mid;
    private byte madd;
    private byte model;
    private byte mupdate;
    private byte msel; //查询权限字段
    private byte mgive; //授权权限字段
    private byte mpwd;  //修改密码权限字段
}
