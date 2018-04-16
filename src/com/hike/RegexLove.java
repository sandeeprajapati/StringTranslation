package com.hike;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLove {

    Pattern pattern = Pattern.compile(":love:");
	
    BufferedReader br=null;
    
    public void fileValidationforGroup1(String fileName) throws Exception {
        System.out.println("File Name :"+fileName);
        br = new BufferedReader(new FileReader(PathConstants.projectFolderPath + fileName));
        boolean flag = false;
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                flag = true;
                System.out.println(fileName + " " + matcher.group(0));
                count++;
            }
        }
        System.out.println("String found in " + fileName + " : " + count);
        if (!flag) {
            System.out.println("String not Found in: " + fileName);
            throw new Exception(fileName + " : String Not Found Exception");
        }
    }

    public void fileValidationforGroup2(String fileName) throws Exception {
        System.out.println("File Name :"+fileName);
        br = new BufferedReader(new FileReader(PathConstants.projectFolderPath + fileName));
        String line;
        boolean flag = false;
        int count = 0;
        while ((line = br.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                flag = true;
                System.out.println(fileName + " " + matcher.group(0));
                count++;
            }
        }

        System.out.println("String found in " + fileName + " : " + count);
        if (!flag) {
            System.out.println("String not Found in: " + fileName);
            throw new Exception(fileName + " : String Not Found Exception");
        }
        try {
            if (count < 2) {
                throw new Exception(fileName + " : String Not Found Exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
