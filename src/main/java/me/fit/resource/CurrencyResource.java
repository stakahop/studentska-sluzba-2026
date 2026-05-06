package me.fit.resource;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import me.fit.model.CurrencyResponse;
import me.fit.rest.client.CurrencyApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/currency/")
public class CurrencyResource {

  @RestClient
  private CurrencyApi currencyApi;

  @GET
  @Path("/rates/")
  @RolesAllowed(value = {"admin"})
  public Response getRates(@QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("value") double value){
    CurrencyResponse response = currencyApi.getRates(from, to);

    response.setValue(value);
    response.setTotalValue(value * response.getRate());
    return Response.ok().entity(response).build();
  }
}
