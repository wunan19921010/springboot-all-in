package com.wnn.springboot.mybatis.dao;

import com.wnn.springboot.mybatis.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sysUserDao")
public interface SysUserDao {

    List<SysUser> getSysUser();

    void addSysUser(SysUser sysUser);
}
