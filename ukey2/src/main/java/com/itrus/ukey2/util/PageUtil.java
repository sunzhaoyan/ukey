package com.itrus.ukey2.util;

/**
 * 分页工具类
 * @author szy
 * @date 2016年8月9日 下午3:36:47
 *
 */
public class PageUtil {
	private int currentPage;
	private int pageSize;
	private int totalPage;
	private int totalSize;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	
	
}
