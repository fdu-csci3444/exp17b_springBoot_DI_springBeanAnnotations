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
public class PersonBean6b implements Person {
	private static final Logger logger = LoggerFactory.getLogger(PersonBean6b.class);

	private String name;
	private int    age;
	
	public PersonBean6b(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String personInfo(String genderPrefix) {
		logger.debug("BEF PersonBean6b.personInfo({})", genderPrefix);
		return genderPrefix + " " + name + " " +  age;
	}
	
}
