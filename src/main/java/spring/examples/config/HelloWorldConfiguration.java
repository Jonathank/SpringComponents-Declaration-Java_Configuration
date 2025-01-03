/**
 * 
 */
package spring.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.examples.provider.HelloWorldMessageProvider;
import spring.examples.provider.MessageProvider;
import spring.examples.renderer.MessageRenderer;
import spring.examples.renderer.StandardOutMessageRenderer;

/**
 * @author JONATHAN
 */
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		
		return renderer;
		
	}
}
