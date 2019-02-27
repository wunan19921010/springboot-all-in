package com.wnn.springboot.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.wnn.springboot.mybatis.Constants.WebConstans;
import com.wnn.springboot.mybatis.entity.SysUser;
import com.wnn.springboot.mybatis.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SysUserController {

    @Autowired
    @Qualifier("sysUserService")
    private SysUserService sysUserService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<SysUser> getSysUser(){
        return sysUserService.getSysUser();
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addSysUser(SysUser sysUser){
        System.out.println(sysUser);
        Map<String, Object> map = new HashMap<>();
        map.put("returnCode",WebConstans.FAILED);
        try {
            sysUserService.addSysUser(sysUser);
            map.put("returnCode",WebConstans.SUCCESS);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return JSON.toJSONString(map);
    }

}
