package com.wnn.springboot.mybatis.service.impl;

import com.wnn.springboot.mybatis.entity.SysUser;
import com.wnn.springboot.mybatis.dao.SysUserDao;
import com.wnn.springboot.mybatis.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    public List<SysUser> getSysUser(){
        List<SysUser> list = sysUserDao.getSysUser();
        return list;
    }

    public void addSysUser(SysUser sysUser){
        sysUserDao.addSysUser(sysUser);
    }

}
