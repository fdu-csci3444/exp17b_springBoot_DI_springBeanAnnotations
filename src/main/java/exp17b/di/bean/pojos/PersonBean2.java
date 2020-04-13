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
public class PersonBean2 implements Person {
	private static final Logger logger = LoggerFactory.getLogger(PersonBean2.class);

	private String name;
	private int    age;
	
	public PersonBean2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String personInfo(String genderPrefix) {
		logger.debug("BEF PersonBean2.personInfo({})", genderPrefix);
		return genderPrefix + " " + name + " " +  age;
	}
	
}
