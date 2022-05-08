package edu.n2.exercise_2;

import java.util.Comparator;

import edu.n2.exercise_1.Restaurant;

public class RestaurantByScoreComparator implements Comparator<Restaurant> {

	@Override
	public int compare(Restaurant restaurant1, Restaurant restaurant2) {
		int result=1;
		
		if (restaurant1.equals(restaurant2)) {
			result=0;
		} else if (restaurant1.getScore() == restaurant2.getScore()) {
			result=restaurant1.getName().compareTo(restaurant2.getName());
		} else {
			result= restaurant1.getScore() - restaurant2.getScore();
		}
		
		return result;
	}

}
