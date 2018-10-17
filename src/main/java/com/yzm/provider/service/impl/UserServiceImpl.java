package com.yzm.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yzm.provider.service.UserService;

/**
 * @author songpeihao
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String insert() {
        return "insert success";
    }
}
