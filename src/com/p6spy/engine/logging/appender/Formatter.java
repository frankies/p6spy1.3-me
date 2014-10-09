//Ref hibernate...
package com.p6spy.engine.logging.appender;

/**
 * Formatter contract
 *
 * @author Steve Ebersole
 */
public interface Formatter {
	public String format(String source);
}
