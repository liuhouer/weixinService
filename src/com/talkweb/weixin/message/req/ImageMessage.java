package com.talkweb.weixin.message.req;

/**
 * 请求图片消息
*    
* 项目名称：WeiChatService   
* 类名称：ImageMessage   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 9:41:49 AM    
* 修改备注：   
* @version    
*
 */
public class ImageMessage extends BaseMessage {
	
	// 图片链接   
    private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}  


}
