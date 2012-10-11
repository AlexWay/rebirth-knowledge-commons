/**
 * Copyright (c) 2005-2012-10-10 www.china-cti.com
 * Id: CategoryAndCircle.java,17:40:26
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.pojo.circle;

import java.util.*;

import cn.com.rebirth.knowledge.commons.entity.circle.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoryAndCircle.
 *
 * @author wuwei
 */
public class CategoryAndCircle {

	/** The category. */
	private CircleCategoryEntity category;

	/** The circles. */
	private List<CircleEntity> circles;

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public CircleCategoryEntity getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(CircleCategoryEntity category) {
		this.category = category;
	}

	/**
	 * Gets the circles.
	 *
	 * @return the circles
	 */
	public List<CircleEntity> getCircles() {
		return circles;
	}

	/**
	 * Sets the circles.
	 *
	 * @param circles the new circles
	 */
	public void setCircles(List<CircleEntity> circles) {
		this.circles = circles;
	}
}
