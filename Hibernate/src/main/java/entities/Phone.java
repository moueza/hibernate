package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * https://blog.moove-it.com/jpa-onetomany-i-need-fk-child-table/ Option 2
 * 
 * @author mouez
 *
 */
@Entity
public class Phone {
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String phoneNumber;

	public Phone() {

	}

	public Phone(String stringPhone) {
		phoneNumber = stringPhone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}