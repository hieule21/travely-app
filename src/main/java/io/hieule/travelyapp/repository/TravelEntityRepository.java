package io.hieule.travelyapp.repository;

import io.hieule.travelyapp.model.TravelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelEntityRepository extends JpaRepository<TravelEntity, Long> {
}
