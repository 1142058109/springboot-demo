package com.hjt.course01.service.impl;

import com.hjt.course01.dao.PermissionMapper;
import com.hjt.course01.dao.RoleMapper;
import com.hjt.course01.dao.UserMapper;
import com.hjt.course01.entity.Role;
import com.hjt.course01.entity.User;
import com.hjt.course01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private PermissionMapper permissionMapper;
    @Resource
    private RoleMapper roleMapper;

    @Override
    public Set<String> getRoles(String username) {
        User user = userMapper.selectByUsername(username);
        Role role = roleMapper.selectByPrimaryKey(user.getId());
        Set<String> list=new HashSet<>();
        list.add(role.getRolename());
        return list;
    }

    @Override
    public Set<String> getPermissions(String username) {
        User user = userMapper.selectByUsername(username);
        String permissionName = permissionMapper.selectByRoleId(user.getRoleId());
        HashSet<String> strings = new HashSet<>();
        strings.add(permissionName);
        return strings;
    }

    @Override
    public User getByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
