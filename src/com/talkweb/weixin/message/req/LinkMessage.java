package com.talkweb.weixin.message.req;

/**
 * 请求的链接信息
*    
* 项目名称：WeiChatService   
* 类名称：LinkMessage   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 9:46:54 AM    
* 修改备注：   
* @version    
*
 */
public class LinkMessage extends BaseMessage {
	
	//消息标题
	private String Title;
	  // 消息描述   
    private String Description;  
    // 消息链接   
    private String Url;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}  

}
