/**
 * Copyright (c) 2005-2012-10-10 www.china-cti.com
 * Id: CategoryAndTopic.java,17:40:45
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.pojo.circle;

import java.util.*;

import cn.com.rebirth.knowledge.commons.entity.circle.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoryCircleShow.
 *
 * @author wuwei
 */
public class CategoryAndTopic {

	/** The circle category. */
	private CircleCategoryEntity circleCategory;

	/** The topics. */
	private List<CircleTopicEntity> topics;

	/** The secondary category. */
	private List<CategoryAndTopic> secondaryCategory;

	/** The category and circles. */
	private List<CategoryAndCircle> categoryAndCircles;

	/**
	 * Gets the circle category.
	 *
	 * @return the circle category
	 */
	public CircleCategoryEntity getCircleCategory() {
		return circleCategory;
	}

	/**
	 * Sets the circle category.
	 *
	 * @param circleCategory the new circle category
	 */
	public void setCircleCategory(CircleCategoryEntity circleCategory) {
		this.circleCategory = circleCategory;
	}

	/**
	 * Gets the topics.
	 *
	 * @return the topics
	 */
	public List<CircleTopicEntity> getTopics() {
		return topics;
	}

	/**
	 * Sets the topics.
	 *
	 * @param topics the new topics
	 */
	public void setTopics(List<CircleTopicEntity> topics) {
		this.topics = topics;
	}

	/**
	 * Gets the secondary category.
	 *
	 * @return the secondary category
	 */
	public List<CategoryAndTopic> getSecondaryCategory() {
		return secondaryCategory;
	}

	/**
	 * Sets the secondary category.
	 *
	 * @param secondaryCategory the new secondary category
	 */
	public void setSecondaryCategory(List<CategoryAndTopic> secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

	/**
	 * Gets the category and circles.
	 *
	 * @return the category and circles
	 */
	public List<CategoryAndCircle> getCategoryAndCircles() {
		return categoryAndCircles;
	}

	/**
	 * Sets the category and circles.
	 *
	 * @param categoryAndCircles the new category and circles
	 */
	public void setCategoryAndCircles(List<CategoryAndCircle> categoryAndCircles) {
		this.categoryAndCircles = categoryAndCircles;
	}
}
