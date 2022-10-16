package com.daxian.product.BZexception;

import com.daxian.common.exception.BizCodeEnum;
import com.daxian.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: daxian
 * @Date: 2022/9/28 16:16
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.daxian.product.controller")
public class BzExceptionAdvice {
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public R handlerValidException(MethodArgumentNotValidException excetion) {
        Map<String, String> map = new HashMap<>();
        BindingResult result = excetion.getBindingResult();
        result.getFieldErrors().forEach((item)->{
            String message = item.getDefaultMessage();
            String field = item.getField();
            map.put(field, message);
        });
        log.error("数据校验出现问题:{},异常类型{}",excetion.getMessage(),excetion.getClass());
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(), BizCodeEnum.VAILD_EXCEPTION.getMsg()).put("data", map);
    }
}
