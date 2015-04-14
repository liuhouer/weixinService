package com.talkweb.weixin.message.resp;

import java.util.List;

/**
 * 响应图文消息
*    
* 项目名称：WeiChatService   
* 类名称：NewsMessage   
* 类描述：   
* 创建人：zhouling
* 创建时间：Nov 13, 2013 10:17:30 AM    
* 修改备注：   
* @version    
*
 */
public class NewsMessage extends BaseMessage {
	
	// 图文消息个数，限制为10条以内   
	private int ArticleCount;
	// 多条图文消息信息，默认第一个item为大图   
	private List<ArticleModel> Articles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<ArticleModel> getArticles() {
		return Articles;
	}

	public void setArticles(List<ArticleModel> articles) {
		Articles = articles;
	}

}
