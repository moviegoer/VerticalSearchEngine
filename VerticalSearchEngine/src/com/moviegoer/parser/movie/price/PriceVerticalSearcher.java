package com.moviegoer.parser.movie.price;

public class PriceVerticalSearcher{

	public void SearchAndStoreMoviePrice(){
		
		PriceScrapper scrapper;
		
		scrapper = new MaoYanScrapper();
		scrapper.Scrap();
		scrapper.growIndex();
		
		
	}

	
}