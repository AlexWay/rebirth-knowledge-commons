/**
 * Copyright (c) 2005-2012-9-25 www.china-cti.com
 * Id: CircleEntity.java,16:12:31
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.entity.circle;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import cn.com.rebirth.knowledge.commons.dhtmlx.entity.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CircleEntity.
 *  圈子实体
 * @author wuwei
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "CIRCLE")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CircleEntity extends AbstractDhtmlxBaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 222566075167051326L;

	/**
	 * The Enum CircleStatu.
	 *
	 * @author wuwei
	 */
	public static enum CircleStatu {

		/** 未审核. */
		UNCHECKED,

		/** 正常状态. */
		NORMAL,

		/** 删除. */
		DELETE;
	}

	/**
	 * The Enum CircleType.
	 *
	 * @author wuwei
	 */
	public static enum CircleType {

		/** 所有人都可以浏览圈子内容并发帖. */
		PUBLIC,

		/** 所有人都可以浏览圈子内容，但只有加入圈子的会员可以发帖. */
		PROTECT,

		/** 只有加入圈子的会员，可以浏览圈子内容并发帖. */
		PRIVATE;
	}

	/** The circle name. */
	private String circleName;

	/** The create date. */
	private Date createDate;

	/** The circle type. 圈子的三种开放类型*/
	private CircleType circleType;

	/** The statu.  圈子的状态*/
	private CircleStatu statu = CircleStatu.UNCHECKED;

	/** The category .  圈子一级类别*/
	private CircleCategoryEntity category;

	/** The sec category . 圈子二级类别*/
	private CircleCategoryEntity secCategory;

	/** The master message.  圈主寄语*/
	private String masterMessage;

	/** The statistical entity. */
	private CircleStatisticalEntity statisticalEntity;

	/** The image url. */
	private String imageUrl;

	/** The should appr. 加入圈子是否需审核*/
	private boolean shouldAppr = false;

	/** The have libiary. */
	private boolean haveLibiary = false;

	/* (non-Javadoc)
	 * @see cn.com.rebirth.knowledge.commons.entity.AbstractBaseEntity#isChildTrem()
	 */
	@Override
	@Transient
	public boolean isChildTrem() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Gets the circle name.
	 *
	 * @return the circle name
	 */
	public String getCircleName() {
		return circleName;
	}

	/**
	 * Sets the circle name.
	 *
	 * @param circleName the new circle name
	 */
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	/**
	 * Gets the creates the date.
	 *
	 * @return the creates the date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the creates the date.
	 *
	 * @param createDate the new creates the date
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Gets the circle type.
	 *
	 * @return the circle type
	 */
	@Enumerated(EnumType.ORDINAL)
	public CircleType getCircleType() {
		return circleType;
	}

	/**
	 * Sets the circle type.
	 *
	 * @param circleType the new circle type
	 */
	public void setCircleType(CircleType circleType) {
		this.circleType = circleType;
	}

	/**
	 * Gets the category entities.
	 *
	 * @return the category entities
	 */
	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	@Where(clause = "CATEGORY_TYPE=0")
	public CircleCategoryEntity getCategory() {
		return category;
	}

	/**
	 * Sets the category entities.
	 *
	 * @param category the new category 
	 */
	public void setCategory(CircleCategoryEntity category) {
		this.category = category;
	}

	/**
	 * Gets the statu.
	 *
	 * @return the statu
	 */
	@Enumerated(EnumType.ORDINAL)
	public CircleStatu getStatu() {
		return statu;
	}

	/**
	 * Sets the statu.
	 *
	 * @param statu the new statu
	 */
	public void setStatu(CircleStatu statu) {
		this.statu = statu;
	}

	/**
	 * Gets the sec category entities.
	 *
	 * @return the sec category entities
	 */
	@ManyToOne
	@JoinColumn(name = "SEC_CATEGORY_ID")
	@Where(clause = "CATEGORY_TYPE=1")
	public CircleCategoryEntity getSecCategory() {
		return secCategory;
	}

	/**
	 * Sets the sec category entities.
	 *
	 * @param secCategory the new sec category 
	 */
	public void setSecCategory(CircleCategoryEntity secCategory) {
		this.secCategory = secCategory;
	}

	/**
	 * Gets the master message.
	 *
	 * @return the master message
	 */
	public String getMasterMessage() {
		return masterMessage;
	}

	/**
	 * Sets the master message.
	 *
	 * @param masterMessage the new master message
	 */
	public void setMasterMessage(String masterMessage) {
		this.masterMessage = masterMessage;
	}

	/**
	 * Gets the statistical entity.
	 *
	 * @return the statistical entity
	 */
	@OneToOne(mappedBy = "circleEntity")
	public CircleStatisticalEntity getStatisticalEntity() {
		return statisticalEntity;
	}

	/**
	 * Sets the statistical entity.
	 *
	 * @param statisticalEntity the new statistical entity
	 */
	public void setStatisticalEntity(CircleStatisticalEntity statisticalEntity) {
		this.statisticalEntity = statisticalEntity;
	}

	/**
	 * Gets the image url.
	 *
	 * @return the image url
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * Sets the image url.
	 *
	 * @param imageUrl the new image url
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Checks if is should appr.
	 *
	 * @return true, if is should appr
	 */
	@Column(name = "SHOULD_APPR")
	public boolean isShouldAppr() {
		return shouldAppr;
	}

	/**
	 * Sets the should appr.
	 *
	 * @param shouldAppr the new should appr
	 */
	public void setShouldAppr(boolean shouldAppr) {
		this.shouldAppr = shouldAppr;
	}

	/**
	 * Checks if is have libiary.
	 *
	 * @return true, if is have libiary
	 */
	@Column(name = "HAVE_LIBIARY")
	public boolean isHaveLibiary() {
		return haveLibiary;
	}

	/**
	 * Sets the have libiary.
	 *
	 * @param haveLibiary the new have libiary
	 */
	public void setHaveLibiary(boolean haveLibiary) {
		this.haveLibiary = haveLibiary;
	}

}
