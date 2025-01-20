package com.recruit.auth.controller;

import com.recruit.framework.biz.operationlog.aspect.ApiOperationLog;
import com.recruit.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DarkMatter
 * @date 2025年1月20日20点11分
 * @version 1.0.0
 * @description: TODO
 */
@RestController
public class Testcontroller {
    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test() {
        return Response.success("Hello World!");
    }
}
