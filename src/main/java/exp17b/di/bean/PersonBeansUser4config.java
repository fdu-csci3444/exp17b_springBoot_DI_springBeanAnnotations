/**
 * 
 */
package exp17b.di.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exp17b.di.bean.pojos.Person;
import exp17b.di.bean.pojos.PersonBean1;
import exp17b.di.bean.pojos.PersonBean2;
import exp17b.di.bean.pojos.PersonBean3;
import exp17b.di.bean.pojos.PersonContainer;

/**
 * Spring @Component that uses property injected into this class of @Bean s declared in a @Configuration
 * @author ilker
 *
 */
@Component
public class PersonBeansUser4config implements PersonBeanUser, PersonContainerBeanUser {
	private static final Logger logger = LoggerFactory.getLogger(PersonBeansUser4config.class);
	
	@Autowired
	private PersonBean1 personBean1;
	
	@Autowired
	private Person personBean2;
	
	@Autowired
	private Person personBean3;
	
	@Override
	public void usePersons(String genderPrefix) {
		logger.debug("BEF PersonBeansUser4config.usePersons({})", genderPrefix);
		personBean1.personInfo(genderPrefix+"_Config_1");
		personBean2.personInfo(genderPrefix+"_Config_2");
		personBean3.personInfo(genderPrefix+"_Config_3");
	}

	@Autowired
	private PersonContainer personContainerBean1;
	
	@Override
	public void usePersonContainers(String genderPrefix) {
		personContainerBean1.containedPersonInfo(genderPrefix+"_Config_Container_1");
		
	}
}
