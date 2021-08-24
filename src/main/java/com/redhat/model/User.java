package com.redhat.model;
import io.quarkus.security.identity.SecurityIdentity;

public class User {
    
    public String userName;

    public User(SecurityIdentity identity) {
        this.userName = identity.getPrincipal().getName();
    }

    public String getUserName() {
        return userName;
    }
}
