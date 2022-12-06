import java.util.*;
import java.util.stream.Collectors;


public class count 
{
	public static void main(String[] args) 
    {
		ArrayList<Integer>list=new ArrayList<>();
		Random num = new Random();
		for(int i=0;i<100;i++)
		list.add(num.nextInt(10));
		
        Map<Object, Integer> counts = list.parallelStream().
	    collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));		
		System.out.println(counts);

	}
}