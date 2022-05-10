package models;

import poiExtractor.IPageExtractorToPoi;
import poiExtractor.TitlePageExtractor;

public class TitlePages extends Pages{

	private String pageTitle;
	private int pageNum;

	public TitlePages(String pageTitle, int pageNum) {
		super(pageNum);
		this.pageTitle = pageTitle;
	}


	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	@Override
	public TitlePageExtractor extractToPptx() {
		return new TitlePageExtractor(pageTitle);
	}
}

