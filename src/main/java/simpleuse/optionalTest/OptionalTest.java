package simpleuse.optionalTest;

import java.util.Optional;

import simpleuse.functionaldemo.People;

public class OptionalTest {
	public static void main(String[] args) {
		PeopleService peopleService = new PeopleService();
		Optional<People> op = peopleService.getPeople(false);
		if(op.isPresent()){
			System.out.println(op.get().getId());
		}
	}
}
