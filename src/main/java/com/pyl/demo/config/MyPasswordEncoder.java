package com.pyl.demo.config;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

    // 加密需要的盐
    private static final String SALT = "666";


    /**
     * 加密
     * @return
     */
    @Override
    public String encode(CharSequence rawPassword) {

//        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
//            return encoder.encodePassword(rawPassword.toString(), SALT);
        return "123";
    }

    /**
     * 匹配
     * @return
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

//        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
//        return encoder.isPasswordValid(encodedPassword, rawPassword.toString(), SALT);
        return true;
    }
}
