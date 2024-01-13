package com.zzz.pms.application.controller;

import com.zzz.pms.generic.common.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/session/")
@Tag(name = "会话模块")
public class SessionController {

    @PostMapping(value = "login")
    @Operation(summary = "用户登录")
    @Parameter(name = "userName", description = "用户名")
    @Parameter(name = "passwd", description = "密码")
    public CommonResult<String> login(String userName, String passwd) {
        log.info(userName + " @ " + passwd);
        return CommonResult.success(userName);
    }

    @GetMapping(value = "logout")
    @Operation(summary = "用户退出")
    public CommonResult<String> logout() {
        return CommonResult.success("logout success");
    }

}
