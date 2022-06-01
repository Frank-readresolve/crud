package co.simplon.p25.crud.dtos;

public class PersonUpdate {

    private String firstName;

    private String lastName;

    private Long attitudeId;

    private Long hobbyId;

    public PersonUpdate() {
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

    public Long getAttitudeId() {
	return attitudeId;
    }

    public void setAttitudeId(Long attitudeId) {
	this.attitudeId = attitudeId;
    }

    public Long getHobbyId() {
	return hobbyId;
    }

    public void setHobbyId(Long hobbyId) {
	this.hobbyId = hobbyId;
    }
}
