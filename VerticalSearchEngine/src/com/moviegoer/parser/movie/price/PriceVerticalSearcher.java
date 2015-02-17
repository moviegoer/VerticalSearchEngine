package com.moviegoer.parser.movie.price;

import com.moviegoer.util.BasicConfiguration;
import com.moviegoer.util.GlobalParameters;
import com.moviegoer.util.ParameterUtilities;

public class PriceVerticalSearcher{

	public void SearchAndStoreMoviePrice() throws Exception{
		//configuration
		BasicConfiguration config = new Configuration();
		GlobalParameters.PriceXmlFilesDir = ParameterUtilities.readProperty(Constants.PriceXmlFilesDir, config.getConfig()); 
		//init scrapper
		PriceScrapper scrapper;
		if(ParameterUtilities.readProperty(Constants.UseMaoYanScrapper, config.getConfig()).equalsIgnoreCase("yes")){
			scrapper = new MaoYanScrapper();
			scrapper.setEntryURL(ParameterUtilities.readProperty(Constants.MaoYanEntryURL, config.getConfig()));
			scrapper.setOutputDir(GlobalParameters.PriceXmlFilesDir);
			scrapper.setOutputFile("MaoYan.xml");
			scrapper.Scrap();
			scrapper.growIndex();
		}
		
	}

	
}