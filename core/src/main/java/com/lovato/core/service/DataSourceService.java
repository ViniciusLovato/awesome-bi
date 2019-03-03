package com.lovato.core.service;

import com.lovato.core.converter.DataSourceConverter;
import com.lovato.core.repository.DataSourceRepository;
import com.lovato.model.domain.DataSource;
import com.lovato.model.dto.DataSourceDTO;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DataSourceService {

    private final DataSourceRepository repository;

    public DataSourceService(DataSourceRepository repository) {
        this.repository = repository;
    }

    public List<DataSourceDTO> findAll() { return repository.findAll().stream()
                .map(DataSourceConverter::fromDomainToDTO)
                .collect(Collectors.toList());
    }

    public DataSourceDTO save(DataSourceDTO dataSourceDTO) {
        DataSource dataSource = repository.save(DataSourceConverter.fromDTOToDomain(dataSourceDTO));
        return DataSourceConverter.fromDomainToDTO(dataSource);
    }

    public DataSourceDTO findById(UUID dataSourceId) throws EntityNotFoundException {

        Optional<DataSource> dataSource = repository.findById(dataSourceId);
        return DataSourceConverter.fromDomainToDTO(dataSource.orElseThrow(() -> new EntityNotFoundException()));
    }
}
