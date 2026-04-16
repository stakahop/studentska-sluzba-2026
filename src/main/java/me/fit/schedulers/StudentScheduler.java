package me.fit.schedulers;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import me.fit.model.TimeResponse;
import me.fit.rest.client.TimeApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class StudentScheduler {

  @Inject
  @RestClient
  TimeApi timeApi;

  @Scheduled(every="5s")
  public void increment(){

    TimeResponse timeResponse = timeApi.getTime("Europe", "Podgorica");
    System.out.println(timeResponse.getDatetime());


  }
}
