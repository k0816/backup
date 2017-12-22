package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	/**
	 * アイテム購入個数
	 */
	private int stock;

	/**
	 * 支払い方法
	 */
	private String pay;

	/**
	 * アイテム情報を格納
	 */
	public Map<String, Object>  session;

	/**
	 * 処理結果
	 */
	private String result;

	/**
	 * 商品情報取得メソッド
	 *
	 * @author internous
	 */
	public String execute() {
		result = SUCCESS;

		session.put("stock", stock);
		// "stock"というString型の名前が付いたstockというオブジェクト

		// String型のstokをint型のintStokへ代入します。
		// セッションから取得したObject型のデータをString型へ変換 → String型をint型へ変換
		// それをint型のintStockに代入
		int intStock = Integer.parseInt(session.get("stock").toString());
        //             Int型への変換                         String型への変換

		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());

		session.put("buyItem_price", intStock * intPrice);
		//"buyItem_price"というString型の名前が付いた,intStock*intPriceしたオブジェクト

		String payment;

		if(pay.equals("1")) {

			payment = "現金払い";
			session.put("pay", payment);
		} else {

			payment = "クレジットカード";
			session.put("pay", payment);
		}
		return result;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
