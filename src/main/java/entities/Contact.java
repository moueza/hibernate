package entities;

import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * 1.1
 * http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#architecture-overview
 */
@Entity(name = "Contact")
public class Contact {

	@Id
	private Integer id;

	private Name name;

	private String notes;

	private URL website;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public URL getWebsite() {
		return website;
	}

	public void setWebsite(URL website) {
		this.website = website;
	}

	public boolean isStarred() {
		return starred;
	}

	public void setStarred(boolean starred) {
		this.starred = starred;
	}

	private boolean starred;

	// Getters and setters are omitted for brevity
}