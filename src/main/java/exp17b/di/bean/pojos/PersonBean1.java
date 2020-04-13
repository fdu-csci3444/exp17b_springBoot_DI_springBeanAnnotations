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
public class PersonBean1 implements Person {
	private static final Logger logger = LoggerFactory.getLogger(PersonBean1.class);
	
	private String  name;
	private Integer age;
	
	public PersonBean1(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String personInfo(String genderPrefix) {
		logger.debug("BEF PersonBean1.personInfo({})", genderPrefix);
		return genderPrefix + " " + name + " " +  age;
	}
	
}
