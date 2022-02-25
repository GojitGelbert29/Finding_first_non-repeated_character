package FindNonRepeatedChar;
public class NonRepeatedCharacter {
		    
	public static void main(String[] args) {
		
        //create a input string
		String input = "ABCDZDCBA";
        
        	System.out.println("This is the first non-repeated Characters in a given string:");
        	
        	for (int i = 0; i< input.length(); i++) {
        		boolean unique = true;
           	
        		for (int l = i + 1; l<input.length(); l++) {
            
        			if (i!= l && input.charAt(i) == input.charAt(l)){
                    unique = false;
                    break;
                }
            }     
            
            if(unique){
            	System.out.println(input.charAt(i));
                break;
            }    
        }
	}
}	