package com.venus.market.app;

import java.io.Serializable;

/**
 * mail to minglin.zml<href a="895589685@qq.com"> edit on 2019年3月5日 下午7:50:15
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3344886605786100797L;
	private String name;
	private int age;
	private String pic;
	private String title;
	private double originPrice;
	private double promotionPrice;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getOriginPrice() {
		return originPrice;
	}

	public void setOriginPrice(double originPrice) {
		this.originPrice = originPrice;
	}

	public double getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}
