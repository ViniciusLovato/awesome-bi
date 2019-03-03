package com.lovato.model.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "data_table")
public class DataTable {

    @Id
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ttl", nullable = false)
    private int ttl;

    @ManyToOne
    @JoinColumn(name = "data_source")
    private DataSource dataSource;

    public DataTable() {
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

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
