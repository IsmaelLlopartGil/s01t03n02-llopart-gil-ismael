package edu.n2.exercise_2;

import edu.n2.exercise_1.Restaurant;
import java.util.*;


public class App {

	public static void main(String[] args) {
		
		Set<Restaurant> restaurantSetByName=new TreeSet<Restaurant>(new RestaurantByNameComparator());		
		fillSet(restaurantSetByName);
		
		System.out.println("Els mateixos criteris de duplicats que l'exercici anterior, ordenats per nom:");
		
		for (Restaurant restaurant : restaurantSetByName) {
			System.out.println(restaurant.toString());
		}
		
		System.out.println();

		Set<Restaurant> restaurantSetByScore=new TreeSet<Restaurant>(new RestaurantByScoreComparator());		
		fillSet(restaurantSetByScore);
		
		System.out.println("Els mateixos criteris de duplicats que l'exercici anterior, ordenats per puntuació:");
		
		for (Restaurant restaurant : restaurantSetByScore) {
			System.out.println(restaurant.toString());
		}
				
	}
	
	private static void fillSet(Set<Restaurant> set) {
		
		set.add(new Restaurant("Etxebarri", 10));
		set.add(new Restaurant("Etxebarri", 9));
		set.add(new Restaurant("Disfutar", 10));
		set.add(new Restaurant("Disfutar", 10));
		set.add(new Restaurant("Etxebarri", 9));
		set.add(new Restaurant("Elkano", 10));
		set.add(new Restaurant("La Extrema", 0));
		set.add(new Restaurant("Aduana Vieja", 2));
		set.add(new Restaurant("Casinet", 8));
		set.add(new Restaurant("Shun Feng", 8));
		set.add(new Restaurant("Shun Feng", 7));

	}
}
