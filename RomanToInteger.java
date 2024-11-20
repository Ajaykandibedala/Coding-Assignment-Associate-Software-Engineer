import java.util.HashMap;
public class RomanToInteger {

public static void main(String[] args) {
String romanNumeral = "VI";
int result = romanToInt(romanNumeral);
System.out.println("Integer representation of " + romanNumeral + " is: " + result);
}
public static int romanToInt(String a) {
HashMap<Character, Integer> romanMap = new HashMap<>();
romanMap.put('I', 1);
romanMap.put('V', 5);
romanMap.put('X', 10);
romanMap.put('L', 50);
romanMap.put('C', 100);
romanMap.put('D', 500);
romanMap.put('M', 1000);
int total = 0;
for (int i = 0; i < a.length(); i++) {
if (i > 0 && romanMap.get(a.charAt(i)) > romanMap.get(a.charAt(i - 1))) {
total += romanMap.get(a.charAt(i)) - 2 * romanMap.get(a.charAt(i - 1));
} else {
total += romanMap.get(a.charAt(i));
}
}
return total;
}
}

// Output:-Integer representation of VI is : 6