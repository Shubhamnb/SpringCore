package com.bridge.prime;

public class PrimeAnagram {
	//Method to find prime anagram
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}else {
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			
			for (int i = 0, j = (c2.length - 1); i < c2.length; i++, j--) {
				if(c1[i] != c2[j])
					return false;
			}
		}
		return true;
	}
	
	public static void isAnagrame(int[] cn) {
		//System.out.println(isAnagram("13", "32"));
		for (int i = 0; i < (cn.length - 1); i++) {
			for (int j = i+1; j < cn.length; j++) {
			
				
					String str1 = Integer.toString(cn[i]);
					String str2 = Integer.toString(cn[j]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
					if(isAnagram(str1, str2)) {
						if(cn[i] == 0) {
							
						}else {
							System.out.print(" "+cn[i]);
							
						}
					}
			}
		}                                                                                                                                                                                             
	}

}
