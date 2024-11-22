package org.zerock.serverex1rds.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zerock.serverex1rds.domain.SampleEntity;

@Repository
public interface TimeRepository extends CrudRepository<SampleEntity, Long> {

    @Query(value = "SELECT NOW()", nativeQuery = true)
    String getCurrentTime();
}