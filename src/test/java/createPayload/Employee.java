package createPayload;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Serializable{
	
	
	private String firstName;
	private String lastName;
	private String profession;
	private List<Address> address;
	
}
