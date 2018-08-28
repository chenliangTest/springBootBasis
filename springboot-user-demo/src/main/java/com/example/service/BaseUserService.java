package com.example.service;


/**
 * @project: springBootBasis
 * @package: com.example.service
 * @author: chenliang
 * @date: 8/28/18 13:28
 * @description:
 */
public interface BaseUserService<T> {
    
    void createUser(T t);

    Boolean validate(int type);
}
