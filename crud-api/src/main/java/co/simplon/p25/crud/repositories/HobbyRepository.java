package co.simplon.p25.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.crud.entities.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {
    //
}
