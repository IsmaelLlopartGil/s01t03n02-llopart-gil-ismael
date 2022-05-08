package edu.n2.exercise_1;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		
		Set<Restaurant> restaurantSet=new HashSet<Restaurant>();
		restaurantSet.add(new Restaurant("Etxebarri ", 10));
		restaurantSet.add(new Restaurant("Etxebarri ", 9));
		restaurantSet.add(new Restaurant("Disfutar", 10));
		restaurantSet.add(new Restaurant("Disfutar", 10));
		restaurantSet.add(new Restaurant("Etxebarri ", 9));
		
		System.out.println("Restaurants acceptats segons el criteri de duplicats:");
		
		for (Restaurant restaurant : restaurantSet) {
			System.out.println(restaurant.toString());
		}
		
	}
}
