package com.chaldev.belajarspringaop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Mahasiswa {

    private String name;
    private String nim;
    private Integer age;
}
