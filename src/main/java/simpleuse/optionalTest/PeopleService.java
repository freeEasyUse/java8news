package simpleuse.optionalTest;

import java.util.Optional;

import simpleuse.functionaldemo.People;

public class PeopleService {

	Optional<People> getPeople(boolean flag){
		People p = null;
		if(flag){
			p = new People(12);
		}
		return Optional.ofNullable(p);
	}
	
	
}
