package simpleuse.functionaldemo;

public class PeopleClient {

	public static void main(String[] args) {
		int aa = 100;
		
		//Lambda ʵ�� �ӿ�
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
		
		//ͨ��::�ؼ����� ���ù��캯��  ���Զ�ƥ���ʺϵĹ��캯��
		PeopleService peopleService2 = People::new;
		People people2 = peopleService2.getPeople(323);
		System.out.println(people2.getId());
		peopleService2.defaultMethod1();
		peopleService2.defaultMethod2();
		
		System.out.println("=======================");
		//:: ����  ����
		People pt = new People();
		PeopleService peopleService3 = pt::returnPeople;
		
		People people3 = peopleService3.getPeople(4345);
		System.out.println(people3.getId());
		System.out.println(people3.getAge());
		peopleService3.defaultMethod1();
		peopleService3.defaultMethod2();
	}
	
}
