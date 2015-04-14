package com.talkweb.weixin.message.resp;

/**
 * 以文本消息响应
*    
* 项目名称：WeiChatService   
* 类名称：TextMessage   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 10:05:40 AM    
* 修改备注：   
* @version    
*
 */
public class TextMessage extends BaseMessage {
	
	//回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
