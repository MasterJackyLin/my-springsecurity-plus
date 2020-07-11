package com.codermy.myspringsecurityplus.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author codermy
 * @createTime 2020/5/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends  RuntimeException {
    private  Integer code;//状态码
    private String  msg;//异常信息
}