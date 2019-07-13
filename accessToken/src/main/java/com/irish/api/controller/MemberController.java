package com.irish.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irish.base.BaseApiService;
import com.irish.base.ResponseBase;

@RestController
@RequestMapping("/openApi")
public class MemberController extends BaseApiService {

	@RequestMapping("/getUser")
	public ResponseBase getUser() {
		return setResultSuccess("获取会员信息接口");
	}
}
