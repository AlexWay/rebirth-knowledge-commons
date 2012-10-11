/**
 * Copyright (c) 2005-2012-10-9 www.china-cti.com
 * Id: CreateCircle.java,14:32:45
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.pojo.circle;

import cn.com.rebirth.knowledge.commons.entity.circle.*;

// TODO: Auto-generated Javadoc
/**
 * The Class CreateCircle.
 * 创建圈子的简单类，包含了圈子不具有的几个属性
 * @author wuwei
 */
public class CreateCircle {

	/** The circle entity. */
	private CircleEntity circleEntity;

	/** The regist master. */
	private boolean registMaster;

	/** The regist master reason. */
	private String registMasterReason;

	/**
	 * Gets the circle entity.
	 *
	 * @return the circle entity
	 */
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
	 * Checks if is regist master.
	 *
	 * @return true, if is regist master
	 */
	public boolean isRegistMaster() {
		return registMaster;
	}

	/**
	 * Sets the regist master.
	 *
	 * @param registMaster the new regist master
	 */
	public void setRegistMaster(boolean registMaster) {
		this.registMaster = registMaster;
	}

	/**
	 * Gets the regist master reason.
	 *
	 * @return the regist master reason
	 */
	public String getRegistMasterReason() {
		return registMasterReason;
	}

	/**
	 * Sets the regist master reason.
	 *
	 * @param registMasterReason the new regist master reason
	 */
	public void setRegistMasterReason(String registMasterReason) {
		this.registMasterReason = registMasterReason;
	}
}
