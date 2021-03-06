package com.v5zhu.dubbo.api.facade;

import com.v5zhu.dubbo.dto.UserDto;

import javax.ws.rs.core.Response;

/**
 * Created by zhuxl@paxsz.com on 2016/7/25.
 */
public interface UserRestService {
    Response findByLoginName(String loginName);

    Response addUser(UserDto userDto);

    Response modifyUser(Long userId, UserDto userDto);

    Response deleteUser(Long userId);

}
