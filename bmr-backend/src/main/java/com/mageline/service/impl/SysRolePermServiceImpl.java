package com.mageline.service.impl;

import com.mageline.dao.SysRolePermMapper;
import com.mageline.entity.SysRolePerm;
import com.mageline.service.SysRolePermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysRolePermServiceImpl extends ServiceImpl<SysRolePermMapper, SysRolePerm> implements SysRolePermService {
}
