package me.fit.exception;

import lombok.Getter;
import lombok.Setter;

public class StudentException extends Exception{

  public StudentException(String message){
    super(message);
  }


}
