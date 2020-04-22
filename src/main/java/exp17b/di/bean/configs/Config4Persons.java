/**
 * 
 */
package exp17b.di.bean.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import exp17b.di.bean.pojos.Person;
import exp17b.di.bean.pojos.PersonBean1;
import exp17b.di.bean.pojos.PersonBean2;
import exp17b.di.bean.pojos.PersonBean3;
import exp17b.di.bean.pojos.PersonBean4;
import exp17b.di.bean.pojos.PersonContainer;
import exp17b.di.bean.pojos.PersonContainerBean1;

/**
 * @author ilker
 *
 */
@Configuration
public class Config4Persons {
	private static final Logger logger = LoggerFactory.getLogger(Config4Persons.class);

	@Value("${my.app.values.person1.name}")
	private String person1name;
	@Value("${my.app.values.person1.age}")
	private int person1age;

	@Value("${my.app.values.person2.name}")
	private String person2name;
	@Value("${my.app.values.person2.age}")
	private Integer person2age;

	@Value("${my.app.values.person3.name}")
	private String person3name;
	@Value("${my.app.values.person3.age}")
	private Integer person3age;

	@Value("${my.app.values.person4.name}")
	private String person4name;
	@Value("${my.app.values.person4.age}")
	private Integer person4age;
	
	@Bean
	public PersonBean1 personBean1() {
		return new PersonBean1(person1name, person1age);
	}
	
	@Bean
	// NOTE ilker below is equivalent to above line. By default below method name is used as name value of @Bean
//	@Bean(name="personBean2")	
	public Person personBean2() {
		return new PersonBean2(person2name, person2age);
	}
	
//	@Bean
	@Bean(name = "personBean3")
	public Person personBean3Creator() {
		return new PersonBean3(person3name, person3age);
	}
	
	@Bean
	public Person personBean4() {
		return new PersonBean4(person4name, person4age);
	}
	
	@Bean
	public PersonContainer personContainerBean1() {
		return new PersonContainerBean1(personBean4());
	}
}
