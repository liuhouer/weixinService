package com.talkweb.weixin.message.req;

/**
 * 请求文本消息
*    
* 项目名称：WeiChatService   
* 类名称：TextMessage   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 9:39:23 AM    
* 修改备注：   
* @version    
*
 */
public class TextMessage extends BaseMessage {
	
	   // 消息内容   
    private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}  
	

}
