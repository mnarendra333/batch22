package pack1;

import java.util.ArrayList;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		for(int i=10;i<=100;i=i+10)
		{
			al.add(i);
		}
		System.out.println(al);
		al.add(110);
		System.out.println(al);

	}

}
