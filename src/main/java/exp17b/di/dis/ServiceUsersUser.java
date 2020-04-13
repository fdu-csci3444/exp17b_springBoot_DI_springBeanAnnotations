/**
 * 
 */
package exp17b.di.dis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ilker
 *
 */
@Service
public class ServiceUsersUser implements EchoServiceUserUser {
	private static final Logger logger = LoggerFactory.getLogger(ServiceUsersUser.class);

	@Autowired
	private ServiceUser_viaPropertyInjection serviceUser_viaPropertyInjection;
	
	@Autowired
	private ServiceUser_viaSetterInjection serviceUser_viaSetterInjection;
	
	@Autowired
	private ServiceUser_viaConstuctorInjection serviceUser_viaConstuctorInjection;
	
	@Override
	public void useUseEchoServices(String msg1, String msg2) {
		logger.debug("BEF useUseEchoServices({},{})", msg1, msg2);
		serviceUser_viaPropertyInjection.useEchoService(msg1, msg2);
		serviceUser_viaSetterInjection.useEchoService(msg1, msg2);
		serviceUser_viaConstuctorInjection.useEchoService(msg1, msg2);
	}

}
