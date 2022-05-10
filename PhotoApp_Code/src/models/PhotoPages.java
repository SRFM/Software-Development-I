package models;

import poiExtractor.IPageExtractorToPoi;
import poiExtractor.PicturePageExtractor;

import java.util.ArrayList;
import java.util.Date;

public class PhotoPages extends Pages{

	private String photoPath;
	private ArrayList<String> keywords;
	
	public PhotoPages(int pageNum, String photoPath, String key_words) {
		super(pageNum);
		this.photoPath = photoPath;
		String[] words = key_words.split(",");
		keywords = new ArrayList<String>();
		for(int i = 0; i < words.length; i++)
			keywords.add(words[i]);
	}

	public ArrayList<String> getKeywords() {
		return keywords;
	}

	@Override
	public PicturePageExtractor extractToPptx() {
		return new PicturePageExtractor("malakia2",photoPath);
	}

	public void setKeywords(ArrayList<String> keywords) {
		this.keywords = keywords;
	}
}

