/**
 * 
 */
package exp17b.di.bean.pojos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ilker
 *
 */
public class PersonContainerBean2 implements PersonContainer {
	private static final Logger logger = LoggerFactory.getLogger(PersonContainer.class);
	
	private Person personContained;
	
	public PersonContainerBean2(Person personContained) {
		super();
		this.personContained = personContained;
	}

	@Override
	public String containedPersonInfo(String genderPrefix) {
		logger.debug("BEF PersonContainerBean2.containedPersonInfo({})", genderPrefix);
		return personContained.personInfo(genderPrefix);
	}

}
