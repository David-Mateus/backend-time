package com.example.crud.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_TIMES")
public class TimeModels  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTime;
    private String name;
    private String time;
    private String textComent;

    public long getIdTime() {
        return idTime;
    }

    public void setIdTime(long idTime) {
        this.idTime = idTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTextComent() {
        return textComent;
    }

    public void setTextComent(String textComent) {
        this.textComent = textComent;
    }
}
