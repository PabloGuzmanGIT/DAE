package com.ep4.ep4;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="login")
public class login {

    @Id

    private int id;
    private String nombre;
    private String pasword;
}
