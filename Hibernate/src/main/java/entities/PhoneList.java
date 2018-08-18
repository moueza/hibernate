package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


/** https://blog.moove-it.com/jpa-onetomany-i-need-fk-child-table/ */
@Entity
public class PhoneList {
	private Long id;
	private String name;
	private String description;
	private List<Phone> phones = new ArrayList();// Example 172
													// http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#associations-one-to-many

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPhones(List phones) {
		this.phones = phones;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "phone_list_id", referencedColumnName = "id")
	public List<Phone> getPhones() {
		return phones;
	}
}