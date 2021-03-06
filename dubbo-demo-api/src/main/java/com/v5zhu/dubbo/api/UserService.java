package com.v5zhu.dubbo.api;

import com.v5zhu.dubbo.dto.UserDto;

/**
* Created by zhuxl on 2015/5/20.
*/
public interface UserService {

    /**根据用户名查询用户
     * @param loginName
     * @return
     */
    UserDto findByLoginName(String loginName);

    /**添加用户
     * @param userDto
     */
    void createUser(UserDto userDto) throws Exception;

    /**修改指定用户
     * @param userId
     * @param userDto
     */
    void modifyUser(Long userId,UserDto userDto) throws Exception;

    /**逻辑删除用户
     * @param userId
     */
    void deleteUser(Long userId) throws Exception;

}
