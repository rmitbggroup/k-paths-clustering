package au.edu.rmit.trajectory.clustering.kpaths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/*
 * read the parameters from file
 */
class LoadProperties{
	static String load(String p){
		Properties prop = new Properties();
		try {
			InputStream is = new LoadProperties().getClass().getResourceAsStream("conf.properties");
			prop.load(new BufferedReader(new InputStreamReader(is)));
			is.close();
			return prop.getProperty(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}