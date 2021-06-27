package round15;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayASListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.<String>asList("홍길동", "신용권","김자바");	//객체를 나열하던지 or 배열주소를 주던지	그리고 리스트 객체를 반환한다. 
		for(String name : list) {	//확장 for문에선 뒤에 배열주소든 리스트 주소가 나오는데 여기 인덱스요소들이 첫번째 에 들어간다. 
			System.out.println(name);
		}
		List<String> list2 = new Vector<String>();
		Set<String> set ;
		Iterator<String> iterator = set.iterator();
		iterator.next();
	}

}
