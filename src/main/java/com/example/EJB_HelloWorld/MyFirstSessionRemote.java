package com.example.EJB_HelloWorld;

import javax.ejb.Remote;

@Remote
public interface MyFirstSessionRemote {
    public String sayHello();
}
