package com.facishare.resteasy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * basic use for RestEasy
 */
@RestController
@Path("resteasy")
public class HelloResource {

    /**
     * curl http:localhost:8080/resteasy/hello/jack
     */
    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return "Hello " + name.toUpperCase();
    }

}

