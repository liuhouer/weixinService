package com.talkweb.weixin.message.req;

/**
 * 请求的地图信息
*    
* 项目名称：WeiChatService   
* 类名称：LocationMessage   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 9:44:34 AM    
* 修改备注：   
* @version    
*
 */
public class LocationMessage extends BaseMessage {

	// 地理位置维度   
    private String Location_X;  
    // 地理位置经度   
    private String Location_Y;  
    // 地图缩放大小   
    private String Scale;  
    // 地理位置信息   
    private String Label;
    
	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}
	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}  

}
