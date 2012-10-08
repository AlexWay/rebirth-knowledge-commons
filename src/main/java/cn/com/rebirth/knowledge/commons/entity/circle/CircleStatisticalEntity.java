/**
 * Copyright (c) 2005-2012-9-25 www.china-cti.com
 * Id: CircleStatisticalEntity.java,11:23:36
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.entity.circle;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import cn.com.rebirth.commons.entity.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CircleStatisticalEntity.
 * 圈子统计信息
 * @author wuwei
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "CIRCLE_STATC_INFO")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CircleStatisticalEntity extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1637072887057370568L;

	/** The circle entity. */
	private CircleEntity circleEntity;

	/** The total visit count. */
	private Integer totalVisitCount;

	/** The total topic count. */
	private Integer totalTopicCount;

	/** The total reply count. */
	private Integer totalReplyCount;

	/** The week visit count. */
	private Integer weekVisitCount;

	/** The week topic count. */
	private Integer weekTopicCount;

	/** The week reply count. */
	private Integer weekReplyCount;

	/** The day visit count. */
	private Integer dayVisitCount;

	/** The day topic count. */
	private Integer dayTopicCount;

	/** The day reply count. */
	private Integer dayReplyCount;

	/**
	 * Gets the circle entity.
	 *
	 * @return the circle entity
	 */
	@OneToOne
	@JoinColumn(name = "CIRCLE_ID")
	public CircleEntity getCircleEntity() {
		return circleEntity;
	}

	/**
	 * Sets the circle entity.
	 *
	 * @param circleEntity the new circle entity
	 */
	public void setCircleEntity(CircleEntity circleEntity) {
		this.circleEntity = circleEntity;
	}

	/**
	 * Gets the total visit count.
	 *
	 * @return the total visit count
	 */
	public Integer getTotalVisitCount() {
		return totalVisitCount;
	}

	/**
	 * Sets the total visit count.
	 *
	 * @param totalVisitCount the new total visit count
	 */
	public void setTotalVisitCount(Integer totalVisitCount) {
		this.totalVisitCount = totalVisitCount;
	}

	/**
	 * Gets the total reply count.
	 *
	 * @return the total reply count
	 */
	public Integer getTotalReplyCount() {
		return totalReplyCount;
	}

	/**
	 * Sets the total reply count.
	 *
	 * @param totalReplyCount the new total reply count
	 */
	public void setTotalReplyCount(Integer totalReplyCount) {
		this.totalReplyCount = totalReplyCount;
	}

	/**
	 * Gets the week visit count.
	 *
	 * @return the week visit count
	 */
	public Integer getWeekVisitCount() {
		return weekVisitCount;
	}

	/**
	 * Sets the week visit count.
	 *
	 * @param weekVisitCount the new week visit count
	 */
	public void setWeekVisitCount(Integer weekVisitCount) {
		this.weekVisitCount = weekVisitCount;
	}

	/**
	 * Gets the week reply count.
	 *
	 * @return the week reply count
	 */
	public Integer getWeekReplyCount() {
		return weekReplyCount;
	}

	/**
	 * Sets the week reply count.
	 *
	 * @param weekReplyCount the new week reply count
	 */
	public void setWeekReplyCount(Integer weekReplyCount) {
		this.weekReplyCount = weekReplyCount;
	}

	/**
	 * Gets the day visit count.
	 *
	 * @return the day visit count
	 */
	public Integer getDayVisitCount() {
		return dayVisitCount;
	}

	/**
	 * Sets the day visit count.
	 *
	 * @param dayVisitCount the new day visit count
	 */
	public void setDayVisitCount(Integer dayVisitCount) {
		this.dayVisitCount = dayVisitCount;
	}

	/**
	 * Gets the day reply count.
	 *
	 * @return the day reply count
	 */
	public Integer getDayReplyCount() {
		return dayReplyCount;
	}

	/**
	 * Sets the day reply count.
	 *
	 * @param dayReplyCount the new day reply count
	 */
	public void setDayReplyCount(Integer dayReplyCount) {
		this.dayReplyCount = dayReplyCount;
	}

	/**
	 * Gets the total topic count.
	 *
	 * @return the total topic count
	 */
	public Integer getTotalTopicCount() {
		return totalTopicCount;
	}

	/**
	 * Sets the total topic count.
	 *
	 * @param totalTopicCount the new total topic count
	 */
	public void setTotalTopicCount(Integer totalTopicCount) {
		this.totalTopicCount = totalTopicCount;
	}

	/**
	 * Gets the week topic count.
	 *
	 * @return the week topic count
	 */
	public Integer getWeekTopicCount() {
		return weekTopicCount;
	}

	/**
	 * Sets the week topic count.
	 *
	 * @param weekTopicCount the new week topic count
	 */
	public void setWeekTopicCount(Integer weekTopicCount) {
		this.weekTopicCount = weekTopicCount;
	}

	/**
	 * Gets the day topic count.
	 *
	 * @return the day topic count
	 */
	public Integer getDayTopicCount() {
		return dayTopicCount;
	}

	/**
	 * Sets the day topic count.
	 *
	 * @param dayTopicCount the new day topic count
	 */
	public void setDayTopicCount(Integer dayTopicCount) {
		this.dayTopicCount = dayTopicCount;
	}
}
