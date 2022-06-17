package LanguageBasic;

public class ProgramAcceptStringAsCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	    2.  Write a Program to accept a String as a Command line argument and the program should print a Welcome message.
        Example:
        C:\> java Sample John
        O/P Expected: Welcome John	 
		 */
		System.out.print("Welcome " + args[0] );
	}

}
