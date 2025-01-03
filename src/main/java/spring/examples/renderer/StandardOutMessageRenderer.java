/**
 * @author JONATHAN
 */
package spring.examples.renderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.examples.provider.MessageProvider;

/**
 * rendered implementation
 */

@Service("renderer")

public class StandardOutMessageRenderer implements MessageRenderer {
	 private MessageProvider messageProvider;
	 
	 @Override
	 public void render() {
	 if (messageProvider == null) {
	 throw new RuntimeException(
	 "You must set the property messageProvider of class:" 
	+ StandardOutMessageRenderer.class.getName());
	 }
	 System.out.println(messageProvider.getMessage());
	 }
	 
	 @Override
	 @Autowired   //INJECT Message Provider
	 public void setMessageProvider(MessageProvider provider) {
	 this.messageProvider = provider;
	 }
	 @Override
	 public MessageProvider getMessageProvider() {
	 return this.messageProvider;
	 }

}
