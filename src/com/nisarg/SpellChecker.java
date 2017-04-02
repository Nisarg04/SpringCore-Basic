package com.nisarg;

public class SpellChecker {

	
	private String str1;
	
	
	
	
//	public String getStr1() {
//		return str1;
//	}

	public SpellChecker(String str1) {
		super();
		this.str1 = str1;
	}

//	public void setStr1(String str1) {
//		this.str1 = str1;
//	}

	public String mySpellCheck()
	{
		return "From Spell Check Class" + str1;
	}
}
