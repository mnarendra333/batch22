package pack9;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectonsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Contact> contactList = new ArrayList<Contact>();
		
		contactList.add(new Contact("naren", 9620949587l));
		contactList.add(new Contact("arun", 9620569587l));
		contactList.add(new Contact("surya", 9620978587l));
		contactList.add(new Contact("barath", 9623249587l));
		
		System.out.println("==========before sorting==============");
		System.out.println(contactList);
		
		List<Contact> list = sortListData(contactList);
		System.out.println("==========after sorting==============");
		System.out.println(list);
		

	}

	private static List<Contact> sortListData(List<Contact> contactList) {
		
		Collections.sort(contactList, new Comparator<Contact>() {

			@Override
			public int compare(Contact o1, Contact o2) {
				// TODO Auto-generated method stub
				String contactName1 = o1.getContactName();
				String contactName2 = o2.getContactName();
				return contactName1.compareTo(contactName2);
			}
		});
		
		
		return contactList;
	}

}
