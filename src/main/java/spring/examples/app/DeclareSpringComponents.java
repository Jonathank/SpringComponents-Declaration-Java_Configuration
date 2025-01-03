/**
 * 
 */
package spring.examples.app;

import spring.examples.config.HelloWorldConfiguration;
import spring.examples.renderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */
public class DeclareSpringComponents {

	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext
				 (HelloWorldConfiguration.class);
				 MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
				 mr.render();
		 }
}
