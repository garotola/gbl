package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		String path = System.getenv("PATH");
		for(String s : path.split(";")) {
			System.out.println(s);
		}
	}
}
