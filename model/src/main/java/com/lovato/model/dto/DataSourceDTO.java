package com.lovato.model.dto;

import com.lovato.model.domain.DataTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Set;
import java.util.UUID;

@ApiModel(
    value = "DataSource",
    description = "DataSource Model"
)
public class DataSourceDTO {

    @ApiModelProperty(
            value = "DataSource identification field",
            dataType = "string",
            example = "91b4a2dd-1797-48bb-8353-7371888129a1",
            required = false
    )
    private UUID id;

    @ApiModelProperty(
            value = "DataSource name",
            dataType = "string",
            example = "Data Source 1",
            required = true
    )
    private String name;

    @ApiModelProperty(
            value = "Database host",
            dataType = "string",
            example = "localhost",
            required = true
    )
    private String url;

    @ApiModelProperty(
            value = "Database name",
            dataType = "string",
            example = "db_name",
            required = true
    )
    private String databaseName;

    @ApiModelProperty(
            value = "Database port",
            dataType = "string",
            example = "5432",
            required = true
    )
    private String port;

    @ApiModelProperty(
            value = "Database",
            dataType = "string",
            example = "PostgreSQL",
            required = true
    )
    private String databaseType;

    private Set<DataTable> dataTableSet;

    public DataSourceDTO() {
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
