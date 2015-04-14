package com.talkweb.weixin.pojo;

/**
 * 普通按钮(子按钮)
*    
* 项目名称：WeiChatService   
* 类名称：CommonButton   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 15, 2013 3:51:39 PM    
* 修改备注：   
* @version    
*
 */
public class CommonButton extends Button {
	private String type;
	
	private String key;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	

}
