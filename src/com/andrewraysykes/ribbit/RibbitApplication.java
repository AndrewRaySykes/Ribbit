package com.andrewraysykes.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "Tv8bIwqegGXuOQfMSWdO5BRK1R6bjGXN6E5mDzFh", "mqt60ZnWQeK9jILYcnwaJTP8yGinPJQvh0wGGxzA");
		
		}
	

}
