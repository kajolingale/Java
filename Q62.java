package a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q62 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("/D/abcd.txt"));
        int ch;
        char charToSearch='a';
        int counter=0;
        while((ch=reader.read()) != -1) {
            if(charToSearch == (char)ch) {
                counter++;
            }
        };
        reader.close();

        System.out.println("a occurs " + counter+ " times");
	}

}
