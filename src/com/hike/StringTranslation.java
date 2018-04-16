package com.hike;

//package com.hike.love;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class StringTranslation {

	public static void main(String[] args) {

		// input1 has only "made with :love: in India"
		String[] input1 = { "values-de/strings.xml", "values-es/strings.xml", "values-gu/strings.xml" };
		// input2 have both "made with :love: in India" and Like
		String[] input2 = { "values/strings.xml", "values-bn/strings.xml", "values-fr/strings.xml",
				"values-hi/strings.xml", "values-kn/strings.xml", "values-ml/strings.xml", "values-mr/strings.xml",
				"values-pt/strings.xml", "values-ru/strings.xml", "values-ta/strings.xml", "values-te/strings.xml" };

		String[] input3 = { "values/strings.xml", "values-bn/strings.xml", "values-de/strings.xml",
				"values-es/strings.xml", "values-fr/strings.xml", "values-gu/strings.xml", "values-hi/strings.xml",
				"values-kn/strings.xml", "values-ml/strings.xml", "values-mr/strings.xml", "values-pt/strings.xml",
				"values-ru/strings.xml", "values-ta/strings.xml", "values-te/strings.xml" };

		RegexLove love = new RegexLove();
		for (String str3 : input3) {
			try {
				for (String str1 : input1) {
					if (str3.equals(str1)) {
						System.out.println("=====================================");
						love.fileValidationforGroup1(str1);
					}
				}
				for (String str2 : input2) {
					if (str3.equals(str2)) {
						System.out.println("=====================================");
						love.fileValidationforGroup2(str2);
					}
				}
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}

	}

}
