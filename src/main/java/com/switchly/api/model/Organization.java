package com.switchly.api.model;

public class Organization {

    private final UUID id;
    private final String name;

    public Organization(Organization organization) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
}
