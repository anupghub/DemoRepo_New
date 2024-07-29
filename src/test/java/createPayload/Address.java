package createPayload;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address{
	
	private String FlatNumber;
	private String Society;
	private String city;
	private String state;
	private String country;

}
