package me.fit.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Phone {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phone_seq")
  @SequenceGenerator(name = "phone_seq", sequenceName = "phone_seq", allocationSize = 1)
  private Long id;

  private String number;
}
