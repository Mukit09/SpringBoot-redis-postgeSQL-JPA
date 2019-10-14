package com.example.demoNaz.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee implements Serializable {

    private static final long serialVersionID = 2343243243242432341L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // client, acc, id
    @Column(name = "client")
    private String client;

    @Column(name = "acc")
    private String acc;
}
