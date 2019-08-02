package EmployeManagement;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * purpose:fetch employee detail.
 * it fetch employee name that match with user given userid.
 */

public class fetch {

	public fetch(Map<Integer, Employe> m) {
		Scanner sc=new Scanner(System.in);
		Set<java.util.Map.Entry<Integer,Employe>> data=m.entrySet();
		Iterator itr=data.iterator();
		int Empid=sc.nextInt();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Employe> mr=(Entry<Integer, Employe>) itr;
			if(mr.getKey().equals(Empid))
			{
				Method[] emp=(mr.getValue()).getClass().getMethods();
				int i=0;
				for(Method f: emp)
				{
					System.out.println(f.getName());
					i++;
				}
			}
		}
		
	}
	

}
