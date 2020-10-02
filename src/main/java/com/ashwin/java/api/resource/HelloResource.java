package com.ashwin.java.api.resource;

import com.ashwin.java.domain.service.MessageService;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {
    @Inject
    public MessageService messageService;

    @GET
    @Path("/")
    public Response hello() {
        return Response.ok(messageService.getMessage()).build();
    }
}
