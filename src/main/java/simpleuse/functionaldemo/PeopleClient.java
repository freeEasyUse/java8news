package simpleuse.functionaldemo;

public class PeopleClient {

	public static void main(String[] args) {
		int aa = 100;
		
		//Lambda 实现 接口
		PeopleService peopleService = (a)->{
			People p = new People();
			p.setId(a+aa);
			return p;
		};
		
		People people = peopleService.getPeople(12);
		
		System.out.println(people.getId());
		peopleService.defaultMethod1();
		peopleService.defaultMethod2();
		
		System.out.println("=======================");
		
		//通过::关键字来 引用构造函数  会自动匹配适合的构造函数
		PeopleService peopleService2 = People::new;
		People people2 = peopleService2.getPeople(323);
		System.out.println(people2.getId());
		peopleService2.defaultMethod1();
		peopleService2.defaultMethod2();
		
		System.out.println("=======================");
		//:: 引用  函数
		People pt = new People();
		PeopleService peopleService3 = pt::returnPeople;
		
		People people3 = peopleService3.getPeople(4345);
		System.out.println(people3.getId());
		System.out.println(people3.getAge());
		peopleService3.defaultMethod1();
		peopleService3.defaultMethod2();
	}
	
}
