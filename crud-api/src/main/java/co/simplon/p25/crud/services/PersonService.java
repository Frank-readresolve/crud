package co.simplon.p25.crud.services;

import co.simplon.p25.crud.dtos.PersonCreate;
import co.simplon.p25.crud.dtos.PersonUpdate;

public interface PersonService {

    void create(PersonCreate inputs);

    void update(Long id, PersonUpdate inputs);

    void delete(Long id);
}
