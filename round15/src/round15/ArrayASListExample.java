package round15;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayASListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.<String>asList("ȫ�浿", "�ſ��","���ڹ�");	//��ü�� �����ϴ��� or �迭�ּҸ� �ִ���	�׸��� ����Ʈ ��ü�� ��ȯ�Ѵ�. 
		for(String name : list) {	//Ȯ�� for������ �ڿ� �迭�ּҵ� ����Ʈ �ּҰ� �����µ� ���� �ε�����ҵ��� ù��° �� ����. 
			System.out.println(name);
		}
		List<String> list2 = new Vector<String>();
		Set<String> set ;
		Iterator<String> iterator = set.iterator();
		iterator.next();
	}

}
