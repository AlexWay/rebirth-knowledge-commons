/**
 * Copyright (c) 2005-2012-9-27 www.china-cti.com
 * Id: PageTag.java,17:42:02
 * @author wuwei
 */
package cn.com.rebirth.knowledge.commons.pageTag;

import cn.com.rebirth.commons.*;

// TODO: Auto-generated Javadoc
/**
 * The Class PageTag.
 * 获得分页标签
 * @author wuwei
 */
public class PageTag {

	/** The show page. */
	private static int showPage = 10;

	/**
	 * Before tag.
	 *
	 * @param isFirstPage the is first page
	 * @param currentPage the current page
	 * @param totalPage the total page
	 * @return the string
	 */
	private static String beforeTag(boolean isFirstPage, int currentPage, int pageSize, int totalPage, String actionUrl) {
		StringBuffer tag = new StringBuffer("<form id=\"pageForm\" action=\"" + actionUrl
				+ "\" method=\"\"><input id=\"pageNo\" type=\"hidden\" name=\"pageNo\" value=\"" + currentPage
				+ "\" />" + "<input id=\"pageSize\" type=\"hidden\" name=\"pageSize\" value=\"" + pageSize
				+ "\" /><input type=\"hidden\" name=\"totalPage\" id=\"totalPage\" value=\"" + totalPage + "\"/>");
		if (isFirstPage) {
			tag.append("<div class=\"manu\"><a href=\"#\" onclick=\"go2Page('first');return false;\">首页</a><span class=\"disabled\">&lt;  前一页</span>");
		} else {
			tag.append("<div class=\"manu\"><a href=\"#\" onclick=\"go2Page('first');return false;\">首页</a><a href=\"#\" onclick=\"go2Page('prev');return false;\">&lt;  前一页</a>");
		}
		return tag.toString();
	}

	/**
	 * After tag.
	 *
	 * @param isEndPage the is end page
	 * @return the string
	 */
	private static String afterTag(boolean isEndPage) {
		String tag;
		if (isEndPage) {
			tag = "<span class=\"disabled\">后一页 &gt;</span><a href=\"#\" onclick=\"go2Page('end');return false;\">末页</a></form>";
		} else {
			tag = "<a href=\"#\" onclick=\"go2Page('next');return false;\">后一页 &gt;</a><a href=\"#\" onclick=\"go2Page('end');return false;\">末页</a></form>";
		}
		return tag;
	}

	/**
	 * Gets the tag.
	 *
	 * @param <T> the generic type
	 * @param page the page
	 * @return the tag
	 */
	public static <T> String getTagHtml(Page<T> page, String actionUrl) {
		if (page.getTotalItems() < 0) {
			return null;
		}
		StringBuffer tag = new StringBuffer(beforeTag(page.getOffset() == 0, page.getPageNo(), page.getPageSize(),
				page.getTotalPages(), actionUrl));
		if (page.getTotalPages() <= showPage) {
			for (int i = 1; i < page.getTotalPages() + 1; i++) {
				if (i == page.getPageNo()) {
					tag.append("<span class=\"current\">");
					tag.append(i);
					tag.append("</span>");
				} else {
					tag.append("<a href=\"#\" onclick=\"go2Page('" + i + "');return false;\">" + i + "</a>");
				}
			}
		} else {
			int start = 1;
			int end = 10;
			if (page.getPageNo() > 5) {
				start = page.getPageNo() - 4;
				end = page.getPageNo() + 5;
			}
			if (page.getPageNo() + 5 > page.getTotalPages()) {
				end = page.getTotalPages();
				start = page.getPageNo() - 4 - (5 - (page.getTotalPages() - page.getPageNo()));
			}
			for (int i = start; i <= end; i++) {
				if (i == page.getPageNo()) {
					tag.append("<span class=\"current\">");
					tag.append(i);
					tag.append("</span>");
				} else {
					tag.append("<a href=\"#\" onclick=\"go2Page('" + i + "');return false;\">" + i + "</a>");
				}
			}
		}
		tag.append(afterTag(page.getPageNo() == page.getTotalPages()));
		return tag.toString();
	}
}
