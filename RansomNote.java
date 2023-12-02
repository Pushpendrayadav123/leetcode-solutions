package Easy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
		
		int l1 = ransomNote.length();
		
		int l2 = magazine.length();
		
		if (l1 > l2)
			
			return false;
		
		char[] ransomNoteChars = ransomNote.toCharArray();
		for (char charOfransomNote : ransomNoteChars) {
			
			if (magazine.contains(Character.toString(charOfransomNote)))
				
				magazine = magazine.replaceFirst(Character.toString(charOfransomNote), "");
			else
				
				return false;
		}
		
		return true;

	}

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aab"));
		System.out.println(canConstruct("aba", "aab"));
		System.out.println(canConstruct("abc", "ab"));
		System.out.println(canConstruct("b", "a"));
		System.out.println(canConstruct("amod maha", "mdoamaa h"));

	}

}
