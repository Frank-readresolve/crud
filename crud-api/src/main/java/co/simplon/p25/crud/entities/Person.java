package co.simplon.p25.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "learner_number")
    private String learnerNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "attitude_id")
    private Attitude attitude;

    @ManyToOne
    @JoinColumn(name = "hobby_id")
    private Hobby hobby;

    public Person() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getLearnerNumber() {
	return learnerNumber;
    }

    public void setLearnerNumber(String learnerNumber) {
	this.learnerNumber = learnerNumber;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public Attitude getAttitude() {
	return attitude;
    }

    public void setAttitude(Attitude attitude) {
	this.attitude = attitude;
    }

    public Hobby getHobby() {
	return hobby;
    }

    public void setHobby(Hobby hobby) {
	this.hobby = hobby;
    }
}
