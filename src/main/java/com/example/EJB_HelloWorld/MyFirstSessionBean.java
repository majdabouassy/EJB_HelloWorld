package com.example.EJB_HelloWorld;

import javax.ejb.Stateless;

@Stateless
public class MyFirstSessionBean implements MyFirstSessionRemote {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
