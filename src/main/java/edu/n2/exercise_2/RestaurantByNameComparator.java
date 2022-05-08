package edu.n2.exercise_2;

import java.util.Comparator;
import edu.n2.exercise_1.Restaurant;

public class RestaurantByNameComparator implements Comparator<Restaurant>{

	@Override
	public int compare(Restaurant restaurant1, Restaurant restaurant2) {
		int result=1;
		
		if (restaurant1.equals(restaurant2)) {
			result=0;
		} else if (restaurant1.getName().equals(restaurant2.getName())) {
			result=restaurant1.getScore() - restaurant2.getScore();
		} else {
			result=restaurant1.getName().compareTo(restaurant2.getName());
		}
		
		return result;
	}

}
