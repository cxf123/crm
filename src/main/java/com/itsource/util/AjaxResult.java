package com.itsource.util;

/**
 * 此domain是封装ajax请求结果的对象 增删改:都要返回结果;
 * 
 * @author MySQL
 *
 */
public class AjaxResult {
	// 给一个默认的值就是true;
	private boolean success = true;
	// 默认值操作成功;
	private String message = "操作成功!";

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {

		this.success = success;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	public AjaxResult() {

	}

	public AjaxResult(String message) {
		//当需要填入信息时就肯定是有错,所以这里默认给false;
		this.success=false;
		this.message = message;
	}

}
