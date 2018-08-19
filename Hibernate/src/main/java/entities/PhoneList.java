package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/** https://blog.moove-it.com/jpa-onetomany-i-need-fk-child-table/ */
@Entity
public class PhoneList {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Phone> phonesCollection = new ArrayList();// Example 172
	// http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#associations-one-to-many


	public Long getId() {
		return id;
	}

		public List<Phone> getPhonesCollection() {
		return phonesCollection;
	}

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

	public void setId(Long id) {
		this.id = id;
	}

	public void setPhonesCollection(List<Phone> phonesCollection) {
		this.phonesCollection = phonesCollection;
	}

}