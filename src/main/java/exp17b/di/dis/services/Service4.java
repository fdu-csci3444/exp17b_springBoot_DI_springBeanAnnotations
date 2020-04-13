/**
 * 
 */
package exp17b.di.dis.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ilker
 *
 */
@Service
@Qualifier("qualifier_service4")
public class Service4 implements EchoService {
	private static final Logger logger = LoggerFactory.getLogger(Service4.class);
	
	@Override
	public String echoService(String msg) {
		logger.debug("BEF Service4.echoService({})", msg);
		return msg;
	}

}
