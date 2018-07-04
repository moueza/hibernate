package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Name {

	private String first;

	private String middle;

	private String last;

	// getters and setters omitted
}