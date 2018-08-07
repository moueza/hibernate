package oneToMany;

import javax.persistence.Entity;

/**
 * https://blog.moove-it.com/jpa-onetomany-i-need-fk-child-table/ Option 2
 * 
 * @author mouez
 *
 */
@Entity
public class Phone {
	private Long id;
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}