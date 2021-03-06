package com.cheng.weixin.rpc.user.service;

/**
 * Desc: 用户
 * Author: cheng
 * Date: 2016/7/7
 */
public interface RpcUserService {
    /**
     * 保存帐号信息
     * @param phone
     * @param password
     * @param nickname
     */
    void saveAccess(String phone, String password, String nickname, String ip);
}
