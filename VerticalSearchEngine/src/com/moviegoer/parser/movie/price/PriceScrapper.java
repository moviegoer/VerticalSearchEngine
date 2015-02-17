package com.moviegoer.parser.movie.price;

public abstract class PriceScrapper{
	
	//class member
	protected String entryURL;
	protected String outputDir;
	protected String outputFile;
	protected String indexDir;
	
	//functions
	/**
	 * scrap websites and save as xml files
	 */
	public abstract void Scrap();

	/**
	 * build a new lucene index to store movie price info
	 */
	public void buildIndex(){
		
	}
	
	/**
	 * add new documents to an existing index
	 */
	public void growIndex(){
		
	}
	
	public String getEntryURL() {
		return entryURL;
	}

	public void setEntryURL(String entryURL) {
		this.entryURL = entryURL;
	}

	public String getOutputDir() {
		return outputDir;
	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public String getIndexDir() {
		return indexDir;
	}

	public void setIndexDir(String indexDir) {
		this.indexDir = indexDir;
	}
	
	
}