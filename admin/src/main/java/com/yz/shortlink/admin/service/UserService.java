package com.yz.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yz.shortlink.admin.dao.entity.UserDO;
import com.yz.shortlink.admin.dto.resp.UserRespDTO;

public interface UserService extends IService<UserDO> {

    UserRespDTO getUserByUsername(String username);
}
