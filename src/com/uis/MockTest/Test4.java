package com.uis.MockTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test4 {
	  public static void main(String[] args) {
	        String path = "/path/to/folder";
	        String search = "search string";
	        int count = 0;
	        File root = new File(path);
	        for (File file : root.listFiles()) {
	            if (file.isDirectory()) {
	                count += searchInFolder(file, search);
	            } else {
	                count += searchInFile(file, search);
	            }
	        }
	        System.out.println("Found " + count + " occurrences of '" + search + "' in " + path);
	    }

	    public static int searchInFolder(File folder, String search) {
	        int count = 0;
	        for (File file : folder.listFiles()) {
	            if (file.isDirectory()) {
	                count += searchInFolder(file, search);
	            } else {
	                count += searchInFile(file, search);
	            }
	        }
	        return count;
	    }

	    public static int searchInFile(File file, String search) {
	        int count = 0;
	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                count += countOccurrences(line, search);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return count;
	    }

	    public static int countOccurrences(String line, String search) {
	        int count = 0;
	        int index = line.indexOf(search);
	        while (index >= 0) {
	            count++;
	            index = line.indexOf(search, index + search.length());
	        }
	        return count;
	    }
}
