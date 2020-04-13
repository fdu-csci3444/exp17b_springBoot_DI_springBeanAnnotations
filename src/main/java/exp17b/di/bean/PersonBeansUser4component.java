/**
 * 
 */
package exp17b.di.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exp17b.di.bean.pojos.Person;
import exp17b.di.bean.pojos.PersonContainer;

/**
 * Spring @Component that uses property injected into this class of @Bean s declared in a @Component
 * @author ilker
 *
 */
@Component
public class PersonBeansUser4component implements PersonBeanUser, PersonContainerBeanUser {
	private static final Logger logger = LoggerFactory.getLogger(PersonBeansUser4component.class);
	
	@Autowired
	private Person personBean5;
	
	@Autowired
	private Person personBean6;
	
	@Autowired
	private Person personBean6b;
		
	@Override
	public void usePersons(String genderPrefix) {
		logger.debug("BEF PersonBeansUser4component.usePersons({})", genderPrefix);
		personBean5.personInfo(genderPrefix+"_Component_5");
		personBean6.personInfo(genderPrefix+"_Component_6");
		personBean6b.personInfo(genderPrefix+"_Component_6b");
	}

	@Autowired
	private PersonContainer personContainerBean2;
	
	@Override
	public void usePersonContainers(String genderPrefix) {
		personContainerBean2.containedPersonInfo(genderPrefix+"_Component_Container_2");
	}
}
