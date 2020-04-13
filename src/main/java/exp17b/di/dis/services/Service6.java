/**
 * 
 */
package exp17b.di.dis.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ilker
 *
 */
@Service(value = "value_service6")
//@Qualifier("value_service6")
public class Service6 implements EchoService {
	private static final Logger logger = LoggerFactory.getLogger(Service6.class);
	
	@Override
	public String echoService(String msg) {
		logger.debug("BEF Service6.echoService({})", msg);
		return msg;
	}

}
