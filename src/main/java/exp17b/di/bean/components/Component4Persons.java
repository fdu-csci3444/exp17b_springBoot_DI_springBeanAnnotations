/**
 * 
 */
package exp17b.di.bean.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import exp17b.di.bean.pojos.Person;
import exp17b.di.bean.pojos.PersonBean5;
import exp17b.di.bean.pojos.PersonBean6;
import exp17b.di.bean.pojos.PersonContainer;
import exp17b.di.bean.pojos.PersonContainerBean2;

/**
 * @author ilker
 *
 */
@Component
public class Component4Persons {
	private static final Logger logger = LoggerFactory.getLogger(Component4Persons.class);

	@Value("${my.app.values.person5.name}")
	private String person5name;
	@Value("${my.app.values.person5.age}")
	private Integer person5age;

	@Value("${my.app.values.person6.name}")
	private String person6name;
	@Value("${my.app.values.person6.age}")
	private Integer person6age;
	
	@Bean
	public Person personBean5() {
		return new PersonBean5(person5name, person5age);
	}
	
	@Bean
	public Person personBean6() {
		logger.debug("BEF Component4Persons.personBean6() --> -->");
		return new PersonBean6(person6name, person6age);
	}
	
	@Bean
	public Person personBean6b() {
		logger.debug("BEF Component4Persons.personBean6b() ==> ==>");
		return new PersonBean6(person6name, person6age);
	}
	
	// NOTE ilker below is WRONG, since below line is in a @Component, personBean6() method call will be a regular method call and hence return an instance of PersonBean5 instance that is NOT in spring context. Use approach after this
	//            below would be OK in a @Config, but NOT in a @Component
	@Bean(name="personContainerBean2WillContainPersonBean6NotInSpringContext")
	public PersonContainer personContainerBean1Creator() {
		return new PersonContainerBean2(personBean6b());
	}

	// NOTE ilker below is CORRECT(use below instead of above block when another bean needs to injected into bean to be created)
	@Autowired
	@Qualifier("personBean6")	// NOTE this is required(when using @Component and @Bean) to avoid collision of multiple implementations of Person 
	private Person personBean6;  
	@Bean
	public PersonContainer personContainerBean2() {
		return new PersonContainerBean2(personBean6);
	}
}
