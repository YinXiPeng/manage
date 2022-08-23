package com.manage.controller;

import com.manage.pojo.Menu;
import com.manage.utils.Result;
import com.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    ManageService manageService;


    @RequestMapping("/pwd")
    @ResponseBody
    public Result match(@PathVariable String username,@PathVariable String password){
            Boolean check=manageService.EqPwd(username,password);
            return new Result(200,"ok",check);
    }
    @RequestMapping("/getMenu/{username}")
    @ResponseBody
    public Result menu(@PathVariable String username){
        Menu man=manageService.FindMenu(username);
        if(man==null){
            return new Result<Menu>(200,"error");

        }
        System.out.println(man.toString());
        System.out.println("12");
        return  new Result<Menu>(200,"ok",man);

    }

}
