package pack7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MoviesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step-1
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sapuser\\Desktop\\movData.txt"));
			String movieData = null;
			
			List<Movie> movieList = new ArrayList<Movie>();
			while ((movieData = br.readLine())!=null) {
				String[] split = movieData.split("-");
				String heroName = split[0].trim();
				String movieName = split[1].trim();
				
				int year = Integer.parseInt(split[2].trim());
				Movie movie = new Movie(heroName,movieName,year);
				movieList.add(movie);
			}
			/*
			 * System.out.println(movieList); for (Movie movie : movieList) {
			 * System.out.println(movie); }
			 */
			
			
			Map<String,List<Movie>> actorMovies = convertListIntoMap(movieList);
		
			Scanner sc = new Scanner(System.in);
			System.out.println("===Enter HeroName to get his movies===");
			String heroName = sc.next();
			
			List<Movie> list = actorMovies.get(heroName);
			System.out.println(heroName+" acted movies are :::::");
			for (Movie movie : list) {
				System.out.println(movie);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static Map<String, List<Movie>> convertListIntoMap(List<Movie> movieList) {
		// TODO Auto-generated method stub
		Map<String, List<Movie>> finalMap = new HashMap<String, List<Movie>>();
		
		
		for (Movie movie : movieList) {
			
				if(finalMap.get(movie.getHeroName()) == null) {
					List<Movie> movList = new ArrayList<Movie>();
					movList.add(movie);
					finalMap.put(movie.getHeroName(), movList);
				}else {
					List<Movie> exsMov = finalMap.get(movie.getHeroName());
					exsMov.add(movie);
					finalMap.put(movie.getHeroName(), exsMov);
				}
				
			
			
			
		}
		
		return finalMap;
	}

}
