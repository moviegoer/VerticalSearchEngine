package com.moviegoer.parser.movie.price;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.moviegoer.util.BasicConfiguration;

public class Configuration extends BasicConfiguration {
	public Properties getConfig() {
		if (this.config == null) {
			try {
				InputStream in = null;

				in = new FileInputStream("parameters.properties");
				if (in != null) {
					this.config = new Properties();
					try {
						this.config.load(in);
					} catch (IOException ex) {
						Logger.getLogger(Configuration.class.getName()).log(
								Level.SEVERE, null, ex);
					}
				}
			} catch (FileNotFoundException ex) {
				Logger.getLogger(Configuration.class.getName()).log(
						Level.SEVERE, null, ex);
			}
		}
		return this.config;
	}

}
