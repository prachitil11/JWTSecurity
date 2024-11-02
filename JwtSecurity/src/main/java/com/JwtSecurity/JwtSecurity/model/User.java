package com.JwtSecurity.JwtSecurity.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
}
