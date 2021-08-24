package com.redhat.endpoint;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.redhat.model.User;
import org.jboss.resteasy.annotations.cache.NoCache;


import io.quarkus.security.identity.SecurityIdentity;

@Path("/api/users")
public class UserResource {
    @Inject
    SecurityIdentity identity;

    @GET
    @Path("/me")
    @NoCache
    public User me(){
        return new User(identity);
    }

}
