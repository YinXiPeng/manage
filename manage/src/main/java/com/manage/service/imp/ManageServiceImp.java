package com.manage.service.imp;

import com.manage.pojo.Menu;
import com.manage.mapper.ManageMapper;
import com.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManageServiceImp implements ManageService {
    @Resource
    ManageMapper manageMapper;
    @Override
    public Boolean EqPwd(String pwd,String uname) {
       String upwd= manageMapper.findByName(uname).getUpwd();
       if(upwd.equals(pwd)) return true;
       else return false;
    }

    @Override
    public Menu FindMenu(String uname) {
       Integer uid= manageMapper.findByName(uname).getUid();
       Integer rid= manageMapper.findByUid(uid);
       Integer mid= manageMapper.findByRid(rid);
       Menu give=manageMapper.findByMid(mid);
        return give;
    }

}
