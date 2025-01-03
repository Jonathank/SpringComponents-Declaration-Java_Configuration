/**
 * @author JONATHAN
 */
package spring.examples.renderer;

import spring.examples.provider.MessageProvider;

/**
 * renderer interface
 */
public interface MessageRenderer {

	void render();
	void setMessageProvider(MessageProvider provider);
	MessageProvider getMessageProvider();
}
