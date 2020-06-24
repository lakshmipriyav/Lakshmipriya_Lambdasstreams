package lambdasstreams;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TaskTest {

	Task t= new Task();
	List<String> input=Arrays.asList("abc","ant","abhfhsf","axe","jkhh","pig");
	List<String> output=Arrays.asList("abc","ant","axe");
	List<String> pinput=Arrays.asList("noon","boon","bob","assddda");
	List<String> poutput=Arrays.asList("noon","bob");
	List<Integer> list= Arrays.asList(1,2,3,4,5);

	@Test
	  public void testAverage() {
	    assertEquals(3.0,t.avg(list),0);
	      }
	@Test
	 public void ListCheck() {
	    assertEquals(output,t.StringList(input));
	}
	@Test
	public  void palindromeCheck() {
	    assertEquals(poutput,t.Palindrome(pinput));
		//System.out.println(t.Palindrome(pinput));
	}
}
