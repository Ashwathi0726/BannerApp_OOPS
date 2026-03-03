/* public class OOPSBannerApp{
public static void main (String [] args){
System.out.println("OOPS");
}
} 
public class OOPSBannerApp {
    public static void main(String[] args) {
        System.out.println("    ***    " + " " + "    ***    " + " " + "******   " + " " + "   ***** ");
        System.out.println(" **     ** " + " " + " **     ** " + " " + "**    ** " + " " + " **      ");
        System.out.println("**       **" + " " + "**       **" + " " + "**     **" + " " + "**       ");
        System.out.println("**       **" + " " + "**       **" + " " + "**    ** " + " " + " **      ");
        System.out.println("**       **" + " " + "**       **" + " " + "******   " + " " + "   ***   ");
        System.out.println("**       **" + " " + "**       **" + " " + "**       " + " " + "      ** ");
        System.out.println("**       **" + " " + "**       **" + " " + "**       " + " " + "       **");
        System.out.println(" **    **  " + " " + " **     ** " + " " + "**       " + " " + "      ** "); 
        System.out.println("    ***    " + " " + "    ***    " + " " + "**       " + " " + " *****   ");
    }
} 


public class OOPSBannerApp {
    public static void main(String[] args) {
        System.out.println(String.join(" ", "    ***    ", "    ***    ", "******   ", "   ***** "));
        System.out.println(String.join(" ", " **     ** ", " **     ** ", "**    ** ", " **      "));
        System.out.println(String.join(" ", "**       **", "**       **", "**     **", "**       "));
        System.out.println(String.join(" ", "**       **", "**       **", "**    ** ", " **      "));
        System.out.println(String.join(" ", "**       **", "**       **", "******   ", "   ***   "));
        System.out.println(String.join(" ", "**       **", "**       **", "**       ", "      ** "));
        System.out.println(String.join(" ", "**       **", "**       **", "**       ", "       **"));
        System.out.println(String.join(" ", " **    **  ", " **     ** ", "**       ", "      ** ")); 
        System.out.println(String.join(" ", "    ***    ", "    ***    ", "**       ", " *****   "));
    }
}


public class OOPSBannerApp {
    public static void main(String[] args) {
        String[]lines = new String[9];
        lines[0] = String.join(" ", "    ***    ", "    ***    ", "******   ", "   ***** ");
        lines[1] = String.join(" ", " **     ** ", " **     ** ", "**    ** ", " **      ");
        lines[2] = String.join(" ", "**       **", "**       **", "**     **", "**       ");
        lines[3] = String.join(" ", "**       **", "**       **", "**    ** ", " **      ");
        lines[4] = String.join(" ", "**       **", "**       **", "******   ", "   ***   ");
        lines[5] = String.join(" ", "**       **", "**       **", "**       ", "      ** ");
        lines[6] = String.join(" ", "**       **", "**       **", "**       ", "       **");
        lines[7] = String.join(" ", " **    **  ", " **     ** ", "**       ", "      ** "); 
        lines[8] = String.join(" ", "    ***    ", "    ***    ", "**       ", " *****   ");
    
        for(String line : lines) {
            System.out.println(line);

       
    }
    }
}


public class OOPSBannerApp {
    public static void main(String[] args) {
        String[]lines = {
         String.join(" ", "    ***    ", "    ***    ", "******   ", "   ***** "),
         String.join(" ", " **     ** ", " **     ** ", "**    ** ", " **      "),
         String.join(" ", "**       **", "**       **", "**     **", "**       "),
         String.join(" ", "**       **", "**       **", "**    ** ", " **      "),
         String.join(" ", "**       **", "**       **", "******   ", "   ***   "),
         String.join(" ", "**       **", "**       **", "**       ", "      ** "),
         String.join(" ", "**       **", "**       **", "**       ", "       **"),
         String.join(" ", " **    **  ", " **     ** ", "**       ", "      ** "), 
         String.join(" ", "    ***    ", "    ***    ", "**       ", " *****   "),
    
        };
        for (String line : lines) {
          System.out.println(line);
        }
    }
}

public class OOPSBannerApp{

 public static String[] getOPattern(){
	 return new String[] {
		 "    ***    ",
         " **     ** ", 
         "**       **", 
         "**       **", 
         "**       **", 
         " **     ** ", 
	     "    ***    " };
 }
 public static String[] getPPattern() {
	 return new String[] {
		 " ****** " ,
         " **   **" , 
         " **   **" ,
         " *****  " , 
         " **     " , 
	     " **     " , 
		 " **     "};
 }
 public static String[] getSPattern() {
	 return new String[] {
		  "   ***** " , 
          "  **     " ,
          "  **     " ,
          "   ****  " ,
          "       **" ,
          "       **" ,
          "   ***** " ,
            };
 }
 public static void main(String[] args) {
	 String[] oPattern = getOPattern();
	 String[] pPattern = getPPattern();
     String[] SPattern = getSPattern(); 
	 
 for (int i = 0; i < oPattern.length; i++) {
	 System.out.println (oPattern[i] + " " +oPattern[i]+" "+pPattern[i]+" "+SPattern[i]);
        }
     }
}

public class OOPSBannerApp{
 static class CharacterPatternMap {
	 private Character character;
	 private String[] pattern;
	 
	 public CharacterPatternMap( Character character , String[] pattern ) {
		 this.character = character;
		 this.pattern = pattern;
	 }
	 public Character getCharacter() {
		 return character;
	 }
	 public String[] getPattern() {
		 return pattern;
	 }
 }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
		CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
		charMaps[0] = new CharacterPatternMap('O',new String[] {"    ***   " ,"  *     * " ,"  *     * " ,"  *     * " ,"  *     * " ,"  *     * " ,"    ***   " });
		charMaps[1] = new CharacterPatternMap('P',new String[] {"  ****** " ,"  *    * " ,"  *    * " ,"  ****** " ,"  *      " ,"  *      " ,"  *      " });
		charMaps[2] = new CharacterPatternMap('S',new String[] {"  ***** " ,"  *     " ,"  *     " ,"  ***** " ,"      * " ,"      * " ,"  ***** " });
		charMaps[3] = new CharacterPatternMap(' ',new String[] { " " , " " , " " , " " , " " , " " , " "});
		return charMaps;
	}
	public static String[] getCharacterPattern(char ch,CharacterPatternMap[] charMaps) {
		for (CharacterPatternMap map : charMaps) {
			if (Character.toUpperCase(ch) == map.getCharacter()) {
				return  map.getPattern();
			}
		}return charMaps[3].getPattern();
	}
	public static void printMessage(String message,CharacterPatternMap[] charMaps) {
		for (int i = 0;i < 7;i++) {
			for (char ch : message.toCharArray()) {
				String[] pattern = getCharacterPattern(ch,charMaps);
				System.out.print(pattern[i] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		String message = "OOPS";
		printMessage(message,charMaps);
	}
}*/


import java.util.HashMap;
public class OOPSBannerApp {
public static HashMap<Character,String[]>createCharacterMap() {
HashMap<Character,String[]>charMap = new HashMap<>();
charMap.put('O',new String[] {"    ***   " ,"  *     * " ,"  *     * " ,"  *     * " ,"  *     * " ,"  *     * " ,"    ***   " });
charMap.put('P',new String[] {"  ****** " ,"  *    * " ,"  *    * " ,"  ****** " ,"  *      " ,"  *      " ,"  *      " });
charMap.put('S',new String[] {"  ***** " ,"  *     " ,"  *     " ,"  ***** " ,"      * " ,"      * " ,"  ***** " });
return charMap;
}
public static void displayBanner(String message,HashMap<Character,String[]>charMap) {
if (message == null || message.isEmpty()) return;
int patternHeight = charMap.get('O').length;
for(int line = 0; line < patternHeight;line++) {
StringBuilder sb = new StringBuilder();
for (char ch : message.toUpperCase().toCharArray()) {
if (charMap.containsKey(ch)) {
String[] pattern = charMap.get(ch);
sb.append(pattern[line]).append(" ");
}
}
System.out.println(sb.toString());
}
}
public static void main (String[] args) {
HashMap<Character,String[]>charMap=createCharacterMap();
String message = "OOPS";
displayBanner(message,charMap);
}
}

