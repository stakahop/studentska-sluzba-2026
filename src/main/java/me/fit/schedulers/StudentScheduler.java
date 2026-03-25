package me.fit.schedulers;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudentScheduler {

  //@Scheduled(every="1s")
  public void increment(){
    int i =0;
    System.out.println(i);
  }
}
