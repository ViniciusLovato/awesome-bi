package com.lovato.core.converter;

import com.lovato.model.domain.DataSource;
import com.lovato.model.dto.DataSourceDTO;

public class DataSourceConverter {

    public static DataSource fromDTOToDomain(DataSourceDTO dataSourceDTO) {
        DataSource dataSource = new DataSource();

        dataSource.setId(dataSourceDTO.getId());
        dataSource.setName(dataSourceDTO.getName());
        dataSource.setDatabaseName(dataSourceDTO.getDatabaseName());
        dataSource.setDatabaseType(dataSourceDTO.getDatabaseType());
        dataSource.setUrl(dataSourceDTO.getUrl());
        dataSource.setPort(dataSourceDTO.getPort());
        dataSource.setDataTableSet(dataSourceDTO.getDataTableSet());

        return dataSource;
    }

    public static DataSourceDTO fromDomainToDTO(DataSource dataSource) {
        DataSourceDTO dataSourceDTO = new DataSourceDTO();

        dataSourceDTO.setId(dataSource.getId());
        dataSourceDTO.setName(dataSource.getName());
        dataSourceDTO.setDatabaseName(dataSource.getDatabaseName());
        dataSourceDTO.setDatabaseType(dataSource.getDatabaseType());
        dataSourceDTO.setUrl(dataSource.getUrl());
        dataSourceDTO.setPort(dataSource.getPort());
        dataSourceDTO.setDataTableSet(dataSource.getDataTableSet());

        return dataSourceDTO;
    }
}
