package co.simplon.p25.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.crud.entities.Attitude;

@Repository
public interface AttitudeRepository extends JpaRepository<Attitude, Long> {
    //
}
