package org.acme.Bike.Service;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.Produces;

@Path("/api/bikes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BikeResource {

    @Inject
    BikeService bikeService;

    @GET
    public Response getAllBikes() {
        List<Bike> bikes = bikeService.retrieveBikes();
        return Response.ok(bikes).build();
    }

    @POST
    public Response postBike(Bike bike) {
        Bike newBike = bikeService.postBikeAd(bike);
        return Response.ok(newBike).build();
    }
}
