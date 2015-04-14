package com.talkweb.weixin.pojo;

/**
 * 复杂按钮（父按钮）
*    
* 项目名称：WeiChatService   
* 类名称：ComplexButton   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 15, 2013 4:00:39 PM    
* 修改备注：   
* @version    
*
 */
public class ComplexButton extends Button {
	
	private Button[] sub_button;

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}

}
