/**
 * Copyright (c) 2005-2012-9-21 www.china-cti.com
 * Id: CircleTopicStatisticalEntity.java,11:16:21
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.entity.circle;

import java.util.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import cn.com.rebirth.commons.entity.*;
import cn.com.rebirth.knowledge.commons.entity.system.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CircleStatisticalInfoEntity.
 * 话题统计信息
 * @author wuwei
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "CIRCLE_TOPIC_STATC_INFO")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CircleTopicStatisticalEntity extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4901495917790091286L;

	/** The topic entity. */
	private CircleTopicEntity topicEntity;

	/** The total visit count. */
	private Integer totalVisitCount = 0;

	/** The total reply count. */
	private Integer totalReplyCount = 0;

	/** The week visit count. */
	private Integer weekVisitCount = 0;

	/** The week reply count. */
	private Integer weekReplyCount = 0;

	/** The day visit count. */
	private Integer dayVisitCount = 0;

	/** The day reply count. */
	private Integer dayReplyCount = 0;

	/** The last reply date. */
	private Date lastReplyDate;

	/** The last reply user. */
	private SysUserEntity lastReplyUser;

	/**
	 * Gets the topic entity.
	 *
	 * @return the topic entity
	 */
	@OneToOne(cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "CIRCLE_TOPIC_ID")
	public CircleTopicEntity getTopicEntity() {
		return topicEntity;
	}

	/**
	 * Sets the topic entity.
	 *
	 * @param topicEntity the new topic entity
	 */
	public void setTopicEntity(CircleTopicEntity topicEntity) {
		this.topicEntity = topicEntity;
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
	 * Gets the last reply date.
	 *
	 * @return the last reply date
	 */
	public Date getLastReplyDate() {
		return lastReplyDate;
	}

	/**
	 * Sets the last reply date.
	 *
	 * @param lastReplyDate the new last reply date
	 */
	public void setLastReplyDate(Date lastReplyDate) {
		this.lastReplyDate = lastReplyDate;
	}

	/**
	 * Gets the last reply user.
	 *
	 * @return the last reply user
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LAST_REPLY_USER_ID")
	public SysUserEntity getLastReplyUser() {
		return lastReplyUser;
	}

	/**
	 * Sets the last reply user.
	 *
	 * @param lastReplyUser the new last reply user
	 */
	public void setLastReplyUser(SysUserEntity lastReplyUser) {
		this.lastReplyUser = lastReplyUser;
	}
}
