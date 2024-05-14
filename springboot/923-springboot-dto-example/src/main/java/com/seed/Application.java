package com.seed;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.seed", "com.pkg1"})
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		String str ="a b c a a def ghhi jkjk a aa b c";
//		String[] words = str.split(" ");
//		Map<String, Integer>  map = new HashMap<String, Integer>();
//		for(String word:words) {
//			if(map.containsKey(word)) {
//				map.put(word, map.get(word)+1);
//			}else {
//				map.put(word, 1);
//			}
//		}
//		
//		System.out.println(map);
		
		int [] arr = {1,2,1,2,3,1,2,3,1,2,4,2,2,3,4,5,5,6,6,7,8,9,0,0,1};
		
		int[] ans = new int[10];
		
		for(int i:arr) {
			ans[i]++;
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(i+" = "+ans[i]);
		}
		
		
	}

}
