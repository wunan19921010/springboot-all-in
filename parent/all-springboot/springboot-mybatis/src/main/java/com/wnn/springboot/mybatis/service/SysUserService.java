package com.wnn.springboot.mybatis.service;

import com.wnn.springboot.mybatis.entity.SysUser;

import java.util.List;

public interface SysUserService {

    List<SysUser> getSysUser();

    void addSysUser(SysUser sysUser);
}
