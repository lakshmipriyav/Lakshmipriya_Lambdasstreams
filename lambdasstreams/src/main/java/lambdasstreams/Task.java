package lambdasstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
	
	
		public static double avg(List<Integer> list) 
	    { 
			
	      return(list.stream()
	        .mapToInt(i->i)
	        .average()
	        .orElse(0.0));
	    
	    }
		public static List<String> StringList(List<String> list1)
		{
			return list1.stream()
					  .filter(i -> ((i.charAt(0)=='a') &&(i.length()==3)))
					  .collect(Collectors.toList());
		}
		
		public List<String> Palindrome(List <String> list2)
		{
		  return list2.stream()
		    .filter(i -> check(i))  
		    .collect(Collectors.toList());
		}

		private static boolean  check(String i) {
			int f=0;
			for(int j=0;j<i.length()/2;j++)
			{
				if(i.charAt(j)!=i.charAt(i.length()-j-1))
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		 
		}

}
