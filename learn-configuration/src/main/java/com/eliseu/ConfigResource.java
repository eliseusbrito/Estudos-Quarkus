package com.eliseu;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/configs")
public class ConfigResource {

    @ConfigProperty(name = "sistema.propriedade1")
    String propriedade1;

    @ConfigProperty(name = "sistema.propriedade2")
    Optional<Integer> propriedade2;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String methodname(){
        return "p1: "+propriedade1+"   "+propriedade2.get();
    }

}
