/**
 * 
 */
package exp17b.di.dis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import exp17b.di.dis.services.EchoService;
import exp17b.di.dis.services.Service1;
import exp17b.di.dis.services.Service2;

/**
 * @author ilker
 *
 */
@Service
public class ServiceUser_viaPropertyInjection implements EchoServiceUser {
	private static final Logger logger = LoggerFactory.getLogger(ServiceUser_viaPropertyInjection.class);

	@Autowired
	private Service1 service1;
	
	@Autowired
	private Service2 service2;
	
	// NOTE ilker, how Spring figures out which one of the 6 implementations(Service1,2,3,4,5,6) of EchoService below?
	//             Spring by default uses Class name and variable name, basically as a qualifier values.
	//             Hence although no qualifer or name or value is explicitly specified in Service3 class
	@Autowired
	private EchoService service3;

//	@Autowired
//	private EchoService service3b;

	@Autowired
	@Qualifier("qualifier_service4")
	private EchoService service4;
	
	@Autowired
	@Qualifier("name_service5")	
	private EchoService service5;
	
	@Autowired
	@Qualifier("value_service6")	
	private EchoService service6;
	
	@Override
	public String useEchoService(String msg1, String msg2) {
		logger.debug("BEF useEchoService({},{})", msg1, msg2);
		return service1.echoService(msg1) + service2.echoService(msg2) +
			   service3.echoService("msg3") + service4.echoService("msg4") +
			   service5.echoService("msg5") + service6.echoService("msg6")
//			   + service3b.echoService("msg3b should fail")	// NOTE ilker this will ERROR complaining about there are 6 potential matches
			   ;
	}

}
