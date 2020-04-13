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
public class PersonBean3 implements Person {
	private static final Logger logger = LoggerFactory.getLogger(PersonBean3.class);

	private String name;
	private int    age;
	
	public PersonBean3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String personInfo(String genderPrefix) {
		logger.debug("BEF PersonBean3.personInfo({})", genderPrefix);
		return genderPrefix + " " + name + " " +  age;
	}
	
}
