/**
 * 
 */
package exp17b.di.dis.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author ilker
 *
 */
//@Component	// WRONG - not suggested. Use below one instead if this class is really a "service"
@Service
public class Service2 implements EchoService {
	private static final Logger logger = LoggerFactory.getLogger(Service2.class);
	
	@Override
	public String echoService(String msg) {
		logger.debug("BEF Service2.echoService({})", msg);
		return msg;
	}

}
