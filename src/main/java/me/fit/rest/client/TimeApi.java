package me.fit.rest.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import me.fit.model.TimeResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/timezone")
@RegisterRestClient(configKey = "time-api")
public interface TimeApi {

  @GET
  @Path("/{country}/{city}")
  public TimeResponse getTime(@PathParam("country") String country, @PathParam(value = "city") String city);

}
