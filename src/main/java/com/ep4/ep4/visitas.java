package com.ep4.ep4;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "visitas")
public class visitas {

    @Id
    private int id;
    private String local;
    private String dni;
    private Date fecha;
    private Time hora;

}
