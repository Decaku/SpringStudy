package com.decaku.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("decaku")
    public void setName(String name) {
        this.name = name;
    }
}
