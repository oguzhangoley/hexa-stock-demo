package com.oguz.stock.adapters.user.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private long id;
    private String name;
    private String surname;
    private String email;
    private double balance;
}

