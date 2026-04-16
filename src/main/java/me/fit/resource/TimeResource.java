package me.fit.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import me.fit.model.TimeResponse;
import me.fit.rest.client.TimeApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/time")
public class TimeResource {

  @Inject
  @RestClient
  private TimeApi timeApi;

  @GET
  @Path("/getTime/{country}/{city}")
  public Response getTime(@PathParam("country")String country, @PathParam("city") String city) {

    TimeResponse timeResponse = timeApi.getTime(country, city);
    return Response.ok().entity(timeResponse).build();
  }
}
