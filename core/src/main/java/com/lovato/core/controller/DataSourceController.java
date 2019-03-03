package com.lovato.core.controller;

import com.lovato.core.service.DataSourceService;
import com.lovato.model.domain.DataSource;
import com.lovato.model.dto.DataSourceDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Api(
    value = "DataSources",
    description = "Data Sources Resources"
)
@RestController
@RequestMapping(value = "/datasources")
public class DataSourceController {

    private final DataSourceService dataSourceService;

    public DataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    @ApiOperation(value = "Create a Data Source")
    @ApiResponse(
            code = 201,
            message = "Promotion created successfully.",
            response = DataSourceDTO.class
    )
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DataSourceDTO save(DataSourceDTO dataSourceDTO) {
        return dataSourceService.save(dataSourceDTO);
    }


    @GetMapping
    public List<DataSourceDTO> findAll() {
        return dataSourceService.findAll();
    }


    @GetMapping(path = "/{id}")
    public DataSourceDTO findById(@PathVariable("id") UUID dataSourceId) {
        return dataSourceService.findById(dataSourceId);
    }


}
