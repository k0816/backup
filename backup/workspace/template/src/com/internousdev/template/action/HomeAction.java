package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{

	/**
	 * ログインボタン押下時に続行
	 * ログイン画面へ遷移します。
	 *
	 * @return SUCCESS
	 */
	public String execute(){
		return SUCCESS;
	}
}