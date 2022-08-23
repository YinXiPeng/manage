package com.manage.mapper;

import com.manage.pojo.Menu;
import com.manage.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ManageMapper {

    //根据用户名查找 (密码比对)
    @Select("select * from user where uname=#{uname}")
    public User findByName(String uname);
    //根据uid查找角色
    @Select("select * from role where uid=#{uid}")
    public Integer findByUid(Integer uid);
    //根据rid找mid
    @Select("select * from rm where rid=#{rid}")
    public Integer findByRid(Integer rid);
    //根据mid查找权限
    @Select("select * from menu where mid=#{mid}")
    public Menu findByMid(Integer mid);
}
