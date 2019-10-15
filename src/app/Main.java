package app;
import java.util.Scanner;

public class Main {
//test comment
  public static void main(String[] args)
  {
    Lexicon lex = new Lexicon();

    String newWord = lex.translate("food");
    System.out.println(newWord);
    
    
    
    
      


  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word) 
  {
	char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
	String output = "";
	
	if(word.endsWith("ingy"))
	{
		 boolean consonant = true;
	        for (char v : vowels) 
	        {
	            if (word.charAt(word.length() - 5) == v)
	            {
	                consonant = false;
	            }
	            
	        }
	        if (consonant && word.charAt(word.length() - 5) != 's') 
            {
                output = word.substring(word.length() - 5 , word.length());
            }
            
	}
	if(word.contains("ent"))
	{
		for (int i = 0; i < word.length(); i++) 
        {
            output += word.substring(i, i + 1);
            for (char v : vowels) 
            {
                if (v == word.charAt(i) && word.contains("ent")) 
                {
                    output = word.substring(i++, i+=3);
                }
            }
        }
	}
    return output;
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message) 
  {
    return "";
  }

  /**
   * This method uses the decode(String) and a Scanner to decode a word specified
   * by the user.
   */
  public static String decodeInput()
  {
	String emessage; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an encoded message"); 
	emessage = sc.nextLine();
	
	
	char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
	String output = "";
	
	if(emessage.endsWith("ingy"))
	{
		 boolean consonant = true;
	        for (char v : vowels) 
	        {
	            if (emessage.charAt(emessage.length() - 5) == v)
	            {
	                consonant = false;
	            }
	            
	        }
	        if (consonant && emessage.charAt(emessage.length() - 5) != 's') 
            {
                output = emessage.substring(emessage.length() - 5 , emessage.length());
            }
            
	}
	if(emessage.contains("ent"))
	{
		for (int i = 0; i < emessage.length(); i++) 
        {
            output += emessage.substring(i, i + 1);
            for (char v : vowels) 
            {
                if (v == emessage.charAt(i) && emessage.contains("ent")) 
                {
                    output = emessage.substring(i++, i+=3);
                }
            }
        }
	}
    return output;
  }
  
  /**
   * This method uses the Lexicon translate(String) and a Scanner to encode a word specified
   * by the user.
   */
  public static String encodeInput() 
  {
	 String dmessage; 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a message to encode"); 
	 dmessage = sc.nextLine();
	 
	 char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

     String output = "";
     for (int i = 0; i < dmessage.length(); i++) 
     {
         output += dmessage.substring(i, i + 1);
         for (char v : vowels) 
         {
             if (v == dmessage.charAt(i) && output.indexOf("ent") == -1 && dmessage.indexOf("ent") == -1) 
             {
                 output += "ent";
             }
         }
     }
     boolean consonant = true;
     for (char v : vowels) 
     {
         if (dmessage.charAt(dmessage.length() - 1) == v)
         {
             consonant = false;
         }
     }
     if (consonant && dmessage.charAt(dmessage.length() - 1) != 's') 
     {
         output += "ingy";
     }
     return output;
  }
}