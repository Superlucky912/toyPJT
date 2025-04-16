package com.bankmanager.common.springSecurity.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankmanager.common.service.loginService;
import com.bankmanager.common.service.vo.loginVo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final loginService loginService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    public CustomUserDetailsService(loginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        log.info("======>>{}", id);
        loginVo vo = new loginVo();
        vo.setId(id);
        loginVo user = loginService.login(vo);


        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
           

        return User.builder()
            .username(user.getId())
            .password(user.getPw())
            .roles("USER") // 필요 시 변경
            .build();
    }
}
