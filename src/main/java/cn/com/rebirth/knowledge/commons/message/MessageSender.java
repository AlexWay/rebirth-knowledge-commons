/**
 * Copyright (c) 2005-2012-9-27 www.china-cti.com
 * Id: MessageSender.java,14:04:50
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.message;


// TODO: Auto-generated Javadoc
/**
 * The Interface MessageSender.
 * 发送消息接口
 * @author wuwei
 */
public interface MessageSender {

	/**
	 * Send.
	 *  发送消息
	 * @param message the message
	 * @return true, if successful
	 */
	public boolean send(Object message);
}
