package com.cg.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mobject = new HashMap();
		mobject.put("ram","SoftwareEngineer");
		mobject.put("shayam", "Architect");
		mobject.put(45, "Sahara");
		mobject.put("aditya","SoftwareEngineer");
	//	mobject.put("ram", "hello");
		System.out.println(mobject);
		mobject.put("ram", "hello");// you put the same key they update the value
		System.out.println(mobject);
		System.out.println(mobject.putIfAbsent("ram", "Abhinav"));
		System.out.println(mobject);
        System.out.println(mobject.putIfAbsent("Adarsh", "CollegeStudent"));
        System.out.println(mobject);
        System.out.println(mobject.entrySet());
       // mobject.put("ram", "hello");
        System.out.println(mobject.get("ram"));
        System.out.println(mobject.getOrDefault(45,"City" ));
        System.out.println(mobject.keySet());
        System.out.println(mobject.values());
        System.out.println(mobject.replace(45, 34));
        System.out.println(mobject);
        System.out.println(mobject.replace("ram", "hello", "ChillNow"));
        System.out.println(mobject);
        System.out.println(mobject.containsKey(45));
        System.out.println(mobject.containsValue(34));
        Map s= new HashMap();
        s.putAll(mobject);
        System.out.println(s);
        System.out.println(s.remove(34));
        System.out.println(s);
        System.out.println(s.remove(45));
        System.out.println(s);
        s.remove(s.remove("Adarsh","CollegeStudent"));
        System.out.println(s);
        System.out.println(mobject.isEmpty());
        System.out.println(mobject.size());
        
        mobject.clear();
        System.out.println(mobject);

	}

}
