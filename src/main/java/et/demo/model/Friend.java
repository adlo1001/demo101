package et.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	
    public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public Friend(String firstName, String lastName, String email, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}


	private String firstName;
    private String lastName;
    private String email;
    
    @Embedded
    private Address address;
}
