package models;

import poiExtractor.BlankPageExtractor;

public class EmptyPages extends Pages{

	public EmptyPages(int pageNumber) {
		super(pageNumber);
	}

	public BlankPageExtractor extractToPptx() {
		return new BlankPageExtractor();
	}
}
