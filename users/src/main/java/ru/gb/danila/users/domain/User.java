package ru.gb.danila.users.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String secondName;
}
