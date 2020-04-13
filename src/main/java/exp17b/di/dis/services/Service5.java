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
@Service("name_service5")
//@Qualifier("name_service5")
public class Service5 implements EchoService {
	private static final Logger logger = LoggerFactory.getLogger(Service5.class);
	
	@Override
	public String echoService(String msg) {
		logger.debug("BEF Service5.echoService({})", msg);
		return msg;
	}

}
