package sortNameAndAge;

import java.util.Comparator;

public class sortName implements Comparator<Details>{

	public int compare(Details obj1, Details obj2) {
		// TODO Auto-generated method stub
		String name1 = obj1.name;
		String name2 = obj2.name;
		return (name1.compareTo(name2));
	}

}
