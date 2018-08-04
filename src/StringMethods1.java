//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		char blah = 'v';
		// 1. Create a String variable and initialize it to whatever you want
		String E = "Many of the goods and services we depend on daily are now supplied by intelligent, automated machines rather than human beings. Robots build cars and other goods on assembly lines, where once there were human workers. Many of our phone conversations are now conducted not with people but with sophisticated technologies. We can now buy goods at a variety of stores without the help of a human cashier. Automation is generally seen as a sign of progress, but what is lost when we replace humans with machines? Given the accelerating variety and prevalence of intelligent machines, it is worth examining the implications and meaning of their presence in our lives.\n" + 
				"\n" + 
				"";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(E.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length
System.out.println(E.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
for(int i= 0;i<E.length();i++) {
		System.out.println(E.charAt(i));
		if(E.charAt(i) == blah) {
			
			System.out.println("v is at index "+ i);
			
		}
		}
		
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


