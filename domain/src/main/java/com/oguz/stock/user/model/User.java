package com.oguz.stock.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User{
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
