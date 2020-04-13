/**
 * 
 */
package exp17b.di.dis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exp17b.di.dis.services.Service1;
import exp17b.di.dis.services.Service2;

/**
 * @author ilker
 *
 */
@Service
public class ServiceUser_viaConstuctorInjection implements EchoServiceUser {
	private static final Logger logger = LoggerFactory.getLogger(ServiceUser_viaConstuctorInjection.class);

	private Service1 service1;

	private Service2 service2;

	// NOTE ilker constructor injection is really the best
	@Autowired
	public ServiceUser_viaConstuctorInjection(Service1 service1, Service2 service2) {
		super();
		this.service1 = service1;
		this.service2 = service2;
	}

	@Override
	public String useEchoService(String msg1, String msg2) {
		logger.debug("BEF useEchoService({},{})", msg1, msg2);
		return service1.echoService(msg1) + service2.echoService(msg2);
	}

}
