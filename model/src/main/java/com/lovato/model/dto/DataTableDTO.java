package com.lovato.model.dto;

import java.util.UUID;

public class DataTableDTO {

    private UUID id;

    private String name;

    private int ttl;

    private UUID dataSource;

    public DataTableDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public UUID getDataSource() {
        return dataSource;
    }

    public void setDataSource(UUID dataSource) {
        this.dataSource = dataSource;
    }
}
