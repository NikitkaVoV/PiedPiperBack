package ru.piedpipers.backend.security.data;

import lombok.Getter;

@Getter
public enum RoleType {
    STUDENT("student"), GROUP("group"), TEACHER("teacher");

    private final String name;

    RoleType(String name) {
        this.name = name;
    }
}
