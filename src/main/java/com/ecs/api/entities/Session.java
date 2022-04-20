package com.ecs.api.entities;

public class Session {
    private int id;
    private int customer_id;

    public Session(int id, int customer_id) {
        this.id = id;
        this.customer_id = customer_id;
    }
}
