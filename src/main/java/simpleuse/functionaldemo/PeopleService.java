package simpleuse.functionaldemo;

/**
 * �������ú�����̵Ľӿ�  ����ӿ�����ĳ��󷽷�ֻ����һ�� Ĭ�Ϸ��������ж��
 * @author GeL
 *
 */
@FunctionalInterface
public interface PeopleService {
	People getPeople(int id);

	default void defaultMethod1(){
		System.out.println("����Ĭ�Ϸ���1");
	}
	
	default void defaultMethod2(){
		System.out.println("����Ĭ�Ϸ���2");
	}
}
