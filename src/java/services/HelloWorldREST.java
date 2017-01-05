/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author c0587637
 */
@Path("/hello")
public class HelloWorldREST {

    @GET
    @Produces("application/json")
    public String hello() {
        JsonObject json = Json.createObjectBuilder()
                .add("Hello", Json.createArrayBuilder()
                        .add("World")
                        .add("Moon")
                        .add("Bob")
                    )
                .build();

        return json.toString();
    }
}
