package hw2;

public class UseString {

	public static void main(String[] args) {
		
		String hw = "This is our homework assignment";
		String hw2  = "This is example 2";
		String hw3 = "";
		String hw4 = "More examples!!!";
		
		System.out.println(hw.toUpperCase());
		System.out.println(hw.toLowerCase());
		System.out.println(hw.charAt(3));
		System.out.println(hw.compareTo(hw2));
		System.out.println(hw.equals(hw));
		System.out.println(hw.length());
		System.out.println(hw.hashCode());
		System.out.println(hw.getBytes());
		System.out.println(hw2.startsWith("T"));
		System.out.println(hw.indexOf("t"));
		System.out.println(hw.intern());
		System.out.println(hw.lastIndexOf("a"));
		System.out.println(hw.endsWith("v"));
		System.out.println(hw3.isEmpty());
		System.out.println(hw.replace("a","b"));
		System.out.println(hw.split("A"));
		System.out.println(hw2.subSequence(2, 8));
		System.out.println(hw.toString());
		System.out.println(hw2.valueOf(2));
		System.out.println(hw2.substring(3, 9));
		System.out.println(hw + " " + hw2);
		System.out.println(hw2.substring(3, 9));
		System.out.println(hw.equalsIgnoreCase(hw2));
		System.out.println(hw.replaceAll("o", "a"));
		System.out.println(hw.replaceFirst("T", "b"));
		System.out.println(hw2.concat(" " +hw));
		System.out.println(hw2.contentEquals("hello"));
		System.out.println(hw4.indexOf("t"));
		System.out.println(hw4.startsWith("M"));
		System.out.println(hw2.concat(" " +hw4));
		System.out.println(hw4.replaceFirst("M", "C"));
	}

}