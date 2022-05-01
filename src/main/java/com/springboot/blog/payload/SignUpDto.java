package com.springboot.blog.payload;

import lombok.Data;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
    public Object getName() {
        return null;
    }
    public Object getUsername() {
        return null;
    }
}
