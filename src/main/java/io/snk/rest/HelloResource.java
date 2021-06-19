package io.snk.rest;

import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

@Component
@RestxResource
public class HelloResource {
    @PermitAll
    @GET("/message")
    public String sayHello(String who) {
        return "Hello";
    }
}
