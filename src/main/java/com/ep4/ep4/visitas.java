package com.ep4.ep4;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

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
