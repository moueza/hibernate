package entities;

import java.net.URL;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contact.class)
public abstract class Contact_ {

	public static volatile SingularAttribute<Contact, URL> website;
	public static volatile SingularAttribute<Contact, String> notes;
	public static volatile SingularAttribute<Contact, Boolean> starred;
	public static volatile SingularAttribute<Contact, Name> name;
	public static volatile SingularAttribute<Contact, Integer> id;

}

