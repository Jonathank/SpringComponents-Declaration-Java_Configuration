/**
 * 
 */
package spring.examples.provider;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
	 @Override
	 public String getMessage() {
	 return "Hello World! MY NAME IS JONATHAN";
	 }
}
