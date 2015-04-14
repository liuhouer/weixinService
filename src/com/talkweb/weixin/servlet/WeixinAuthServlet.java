package com.talkweb.weixin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.talkweb.weixin.main.MenuManager;
import com.talkweb.weixin.service.CoreService;
import com.talkweb.weixin.util.LogUtil;
import com.talkweb.weixin.util.SignUtil;

/**
 * 微信接入认证类
*    
* 项目名称：WeiChatService   
* 类名称：WeixinAuthServlet   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 12, 2013 3:57:51 PM    
* 修改备注：   
* @version    
*
 */
public class WeixinAuthServlet extends HttpServlet {
	
	private LogUtil log=new LogUtil(WeixinAuthServlet.class);

	/**
	 * Constructor of the object.
	 */
	public WeixinAuthServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * 确认请求来自微信服务器
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 // 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
		log.debug("-------开始验证请求是否来自微信！");
		//微信加密签名
		String signature =request.getParameter("signature");
		//时间戳 
		String timestamp=request.getParameter("timestamp");
		//随机数
		String nonce=request.getParameter("nonce");
		//随机字符串
		String echostr=request.getParameter("echostr");
		log.debug("---接收到的来自"+request.getRemoteHost()+",请求参数：signature:"+signature+",timestamp:"+timestamp+",nonce:"+nonce+",echostr:"+echostr);
		PrintWriter out=response.getWriter();
		//通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败   
		if(signature==null||timestamp==null||nonce==null||echostr==null){
			out.write("you records has recorded,please leave it now !");
		}else {
			if(SignUtil.checkSignature(signature, timestamp, nonce)){
				out.write(echostr);
			}			
		}
		
		out.close();
		out=null;
		
		
		
        
	}

   /**
    * 处理来自微信的消息
    */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 // 将请求、响应的编码均设置为UTF-8（防止中文乱码）   
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//调用核心业务类处理微信请求
		String respMsg=CoreService.processRequest(request);
		
		PrintWriter writer=response.getWriter();
		writer.write(respMsg);
		writer.close();
		writer=null;
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	
	}

}
