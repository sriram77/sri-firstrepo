package org.sriram.rest.messenger.service;

import java.util.ArrayList;
import java.util.Map;

import org.sriram.rest.messenger.database.DatabaseClass;
import org.sriram.rest.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("sriram", new Profile(1L, "sriram", "sriram", "prem"));
		profiles.put("gopi", new Profile(2L, "gopi", "gopi", "bala"));
	}

	public ArrayList<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(),profile);
		return profile;
		
	}
	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;

	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);

	}

	
}
