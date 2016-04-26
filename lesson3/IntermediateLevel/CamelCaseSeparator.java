package IntermediateLevel;
import java.util.ArrayList;
import com.sun.xml.internal.ws.util.StringUtils;
public class CamelCaseSeparator {
	
	public static void main (String args[]) {
        String initialString = "thisIsTheTestSentence";
        // This is the list which will help us to store different parts of initial string and       
       // doesn't depend on the final size of the string
        ArrayList<String> storage = new ArrayList<String>();
        // Convert initial string to char array for better checking camel case       
       char[] ch = initialString.toCharArray();
        // Convert the first symbol to uppercase       
      storage.add(String.valueOf(Character.toUpperCase(ch[0])));
        // Since the 2nd symbol check every letter whether it's uppercase or not,       
        // add space and convert it to lowercase (if yes).       
        // In any case the final result is added to the final list (storage)       
        for (int i = 1; i < ch.length; i++) {           
        if (Character.isUpperCase(ch[i])) {               
        storage.add(String.valueOf(" " + Character.toLowerCase(ch[i])));           
        } else {
       storage.add(String.valueOf(ch[i]));           
        }
        }
        // Convertation to printable format (one string)       
       //System.out.println(StringUtils.join(storage,""));   
       }

}
