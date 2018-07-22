package com.shcem.artemis.services;

import com.shcem.artemis.services.models.LoginModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LdapService {
    @Value("{ldapUrl}")
    String ldapUrl;

    public LoginModel login(String loginName,String pwd){
        return new LoginModel();
    }
}
