package com.hjt.course01.service;

import com.hjt.course01.entity.User;

import java.util.Set;

public interface UserService {
     Set<String> getRoles(String username);

     Set<String> getPermissions(String username);

     User getByUsername(String username);
}
