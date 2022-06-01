package co.simplon.p25.crud.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.p25.crud.dtos.PersonCreate;
import co.simplon.p25.crud.dtos.PersonUpdate;
import co.simplon.p25.crud.entities.Attitude;
import co.simplon.p25.crud.entities.Hobby;
import co.simplon.p25.crud.entities.Person;
import co.simplon.p25.crud.repositories.AttitudeRepository;
import co.simplon.p25.crud.repositories.HobbyRepository;
import co.simplon.p25.crud.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    private final AttitudeRepository attitudes;

    private final HobbyRepository hobbies;

    private final PersonRepository persons;

    public PersonServiceImpl(AttitudeRepository attitudes,
	    HobbyRepository hobbies, PersonRepository persons) {
	this.attitudes = attitudes;
	this.hobbies = hobbies;
	this.persons = persons;
    }

    @Transactional
    @Override
    public void create(PersonCreate inputs) {
	Person person = new Person();
	person.setLearnerNumber(inputs.getLearnerNumber());
	person.setFirstName(inputs.getFirstName());
	person.setLastName(inputs.getLastName());
	Attitude attitude = attitudes.getReferenceById(inputs.getAttitudeId());
	person.setAttitude(attitude);
	Hobby hobby = hobbies.getReferenceById(inputs.getHobbyId());
	person.setHobby(hobby);
	persons.save(person);
    }

    @Transactional
    @Override
    public void update(Long id, PersonUpdate inputs) {
	Person person = persons.findById(id).get();
	person.setFirstName(inputs.getFirstName());
	person.setLastName(inputs.getLastName());
	Attitude attitude = attitudes.getReferenceById(inputs.getAttitudeId());
	person.setAttitude(attitude);
	Hobby hobby = hobbies.getReferenceById(inputs.getHobbyId());
	person.setHobby(hobby);
	persons.save(person);
    }

    @Transactional
    @Override
    public void delete(Long id) {
	persons.deleteById(id);
    }
}
