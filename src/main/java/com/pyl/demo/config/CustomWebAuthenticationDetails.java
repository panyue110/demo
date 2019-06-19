package com.pyl.demo.config;

import lombok.Data;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

@Data
public class CustomWebAuthenticationDetails extends WebAuthenticationDetails {

    private static final long serialVersionUID = 6975601077710753878L;
    private final String vercode;


    public CustomWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        vercode = request.getParameter("vercode");
    }

}
