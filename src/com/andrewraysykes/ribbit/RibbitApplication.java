package com.andrewraysykes.ribbit;

import android.app.Application;

import com.andrewraysykes.ribbit.ui.MainActivity;
import com.andrewraysykes.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "Tv8bIwqegGXuOQfMSWdO5BRK1R6bjGXN6E5mDzFh", "mqt60ZnWQeK9jILYcnwaJTP8yGinPJQvh0wGGxzA");
		
		//PushService.setDefaultPushCallback(this, MainActivity.class);
		PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
		ParseInstallation.getCurrentInstallation().saveInBackground();
		}
	
	public static void updateParseInstallation(ParseUser user) {
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}

}
