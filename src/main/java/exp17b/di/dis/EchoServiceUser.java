/**
 * 
 */
package exp17b.di.dis;

import exp17b.di.dis.services.EchoService;

/**
 * @author ilker
 *
 */
public interface EchoServiceUser {
	/**
	 * Uses {@link EchoService#echoService(String)}
	 * @param msg1 to pass to 1st {@link EchoService}
	 * @param msg2 to pass to 2nd {@link EchoService}
	 * @return what {@link EchoService#echoService(String)} returns
	 */
	public String useEchoService(String msg1, String msg2);
}
