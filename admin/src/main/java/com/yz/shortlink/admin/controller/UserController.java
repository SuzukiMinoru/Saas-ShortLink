package com.yz.shortlink.admin.controller;

import com.yz.shortlink.admin.common.convention.result.Result;
import com.yz.shortlink.admin.common.convention.result.Results;
import com.yz.shortlink.admin.common.enums.UserErrorCodeEnum;
import com.yz.shortlink.admin.dto.resp.UserRespDTO;
import com.yz.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     *
     * 根据用户名查询用户
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO userRespDTO = userService.getUserByUsername(username);
//        if (userRespDTO == null) {
//            return new Result<UserRespDTO>().setCode(UserErrorCodeEnum.USER_NULL.code())
//                    .setMessage(UserErrorCodeEnum.USER_NULL.message());
//        }
        return Results.success(userRespDTO);
    }
}
