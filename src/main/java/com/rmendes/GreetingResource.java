package com.rmendes;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
    
    
    @GET
    @Path("/ok")
    @Produces(MediaType.TEXT_PLAIN)
    public String endpoint() {
    	return "okidoki rollout";
    }
}
