package sam.springframework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCommand {

	public String firstName;
	public String lastName;

	public PersonCommand(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}

	public String sayMyName() {
		return "My name is " + firstName + " " + lastName;
	}

}
