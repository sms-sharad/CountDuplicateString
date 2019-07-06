import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

public class DuplicateCount {

	
	public static void main(String[] args) {
		String name="one two three two one two three four  two five four six seven ";
		
	    try {
			if(name!=null){
				HashMap<String,Integer> map=new HashMap<String,Integer>();
				
				Integer count=0;
				String[] tokens=name.split(" ");
				int size=tokens.length;
				for(int i=0;i<size;i++){
					count=0;
					for(int j=i;j<size;j++){
						if(tokens[i].equals(tokens[j])){
						  count++;
						}
					}
					if(count>1 && map.containsKey(tokens[i])==false)
						map.put(tokens[i],Integer.parseInt(count.toString()));
						
		            System.out.println(count );		
				}
			
				System.out.print("Map---------\n");
				for(Map.Entry<String,Integer> m:map.entrySet()){
					System.out.print(m.getKey());
					System.out.println(" -"+m.getValue());
				}
			}
			else
				System.out.println("Name is null");
			
		} catch (Exception e) {
		   System.out.println("Error" +e.getMessage());
		   e.printStackTrace();
		}
	}
}
