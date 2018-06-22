package sortNameAndAge;

import java.util.Comparator;

public class sortAge implements Comparator<Details>{

	public int compare(Details obj1, Details obj2) {
		// TODO Auto-generated method stub
		if(obj1.age > obj2.age) {
			return 1;
		} else if(obj1.age < obj2.age) {
			return -1;
		}
		return 0;
	}


}
