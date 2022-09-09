package com.example.cicdpipeline.repositories;
import com.example.cicdpipeline.model.Name;
import org.springframework.data.repository.CrudRepository;

public interface NameRepository extends CrudRepository<Name,Long> {
}
