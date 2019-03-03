package com.lovato.model.domain;


import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "data_source")
public class DataSource {

    @Id
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "database_name", nullable = false)
    private String databaseName;

    @Column(name = "port", nullable = false)
    private String port;

    @Column(name = "database_type", nullable = false)
    private String databaseType;

    @OneToMany(mappedBy = "dataSource", cascade = CascadeType.ALL)
    private Set<DataTable> dataTableSet;

    public DataSource() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public Set<DataTable> getDataTableSet() {
        return dataTableSet;
    }

    public void setDataTableSet(Set<DataTable> dataTableSet) {
        this.dataTableSet = dataTableSet;
    }
}
