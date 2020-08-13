package com.codermy.myspringsecurityplus.service;

import com.codermy.myspringsecurityplus.utils.Result;

/**
 * @author codermy
 * @createTime 2020/7/13
 */
public interface RoleUserService {
    /**
     * 返回用户拥有的角色
     * @param userId
     * @return
     */
    Result getMyRoleUserByUserId(Integer userId);
}
