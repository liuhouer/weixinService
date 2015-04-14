package com.talkweb.weixin.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.talkweb.weixin.message.resp.TextMessage;
import com.talkweb.weixin.util.MessageUtil;

/**
 * 微信核心服务类
*    
* 项目名称：WeiChatService   
* 类名称：CoreService   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 3:25:15 PM    
* 修改备注：   
* @version    
*
 */
public class CoreService {
	
	/**
	 * 处理微信用户发来的请求
	 * @param request
	 * @return
	 */
	public static String processRequest(HttpServletRequest request){
		
		String respMessage=null;
		try{
			//默认的文本回复
			String respContent="请求处理异常，请稍后再试！";
			
			//解析发过来的xml请求
			Map<String, String> requestMap=MessageUtil.parseXml(request);
			
			//发送发方账号（open_id）
			String fromUserName=requestMap.get("FromUserName");
			
			//公众账号
			String toUserName=requestMap.get("ToUserName");
			
			//消息类型
			String msgType=requestMap.get("MsgType");
			
			//回复文本消息
			TextMessage textMessage=new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setFuncFlag(0);
			
			//文本消息
			if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				respContent = "您发送的是文本消息！"; 
			}
			//图片消息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
				 respContent = "您发送的是图片消息！";  
				
			}
			//地理位置消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				respContent = "您发送的是地理位置消息！";  
			}
			//链接消息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				 respContent = "您发送的是链接消息！";  
			}
			//事件推送消息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//事件类型
				String eventType=requestMap.get("Event");
				//订阅
				if(eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)){
					respContent="谢谢您的关注";
				}
				//取消订阅
				else if(eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)){
					// TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息   
				}
				//菜单点击事件
				else if(eventType.equals(MessageUtil.EVENT_TYPE_CLICK)){
					//事件KEY值
					String eventKey=requestMap.get("EventKey");
					String menuName="";
					//TODO 根据自定义菜单值与eventKey比较来进行下一步操作
					switch (Integer.valueOf(eventKey)) {
					case 11:
						menuName="消费明细";
						break;
					case 12:
						menuName="考勤记录";
						break;
					case 13:
						menuName="门禁记录";
						break;
					case 21:
						menuName="钱包余额";
						break;
					case 22:
						menuName="挂失解挂";
						break;
					case 31:
						menuName="客服电话";
						break;
					case 32:
						menuName="使用帮助";
						break;
					case 33:
						menuName="拓维手机一卡通，旨在为广大企业，学校提供数字化管理解决方案！";
						break;						

					default:
						break;
					}
					respContent=menuName+",菜单建设中，谢谢关注！";
				}
			}
			
			textMessage.setContent(respContent);
			respMessage=MessageUtil.textMessageToXml(textMessage);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return respMessage;
		
	}
	

}
