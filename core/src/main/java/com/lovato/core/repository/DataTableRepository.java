package com.lovato.core.repository;

import com.lovato.model.domain.DataTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DataTableRepository extends JpaRepository<DataTable, UUID> {
}
