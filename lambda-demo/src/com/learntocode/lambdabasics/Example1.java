package com.learntocode.lambdabasics;

/****************************** WITHOUT LAMBDA EXPRESSION ***************************************************/

interface Coach {
	public void getdailyWorkout();
}

class CricketCoach implements Coach {
	@Override
	public void getdailyWorkout() {
		System.out.println("Do Batting practice for 2 hours Without Lambda");
	}
}

public class Example1 {
	public static void main(String[] args) {
		//Without Lambda Expression
		Coach coach = new CricketCoach();
		coach.getdailyWorkout();
	}

}

/****************************** WITH LAMBDA EXPRESSION ***************************************************/

/* interface Coach {
	public void getdailyWorkout();
}

public class Example1 {
	public static void main(String[] args) {
		Coach lambdaCoach = ()->System.out.println("Do Batting practice for 2 hours with lambda");
		lambdaCoach.getdailyWorkout();
	}
}
*/