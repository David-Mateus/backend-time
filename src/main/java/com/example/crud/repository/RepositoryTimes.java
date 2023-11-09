package com.example.crud.repository;

import com.example.crud.models.TimeModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryTimes extends JpaRepository<TimeModels, UUID> {

}
