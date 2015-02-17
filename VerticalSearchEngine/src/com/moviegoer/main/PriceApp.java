package com.moviegoer.main;

import com.moviegoer.parser.movie.price.PriceVerticalSearcher;

public class PriceApp{
	
	public static void main(String[] args){
		try{
			PriceVerticalSearcher searcher = new PriceVerticalSearcher();
			searcher.SearchAndStoreMoviePrice();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}