package pack3;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithPredefinedDataUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		ts.add("hello");
		ts.add("barath");
		ts.add("hari");
		ts.add("akhilesh");
		ts.add("surya");
		
		System.out.println(ts);

	}

}
//op => [surya, hello, hari, barath, akhilesh]
