package com.mashibing.serviceverificationcode.service;

import com.mashibing.internalcommon.dto.ResponseResult;
import com.mashibing.internalcommon.dto.serviceverificationcode.response.VerifyCodeResponse;

public interface VerifyCodeService {
    public ResponseResult<VerifyCodeResponse> generate(int identity , String phoneNumber);

    public ResponseResult verify(int identity,String phoneNumber,String code);
}
