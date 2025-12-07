package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodDemo {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		System.out.println("--------------add()--------------");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("kiwi");
		fruits.add("pinaple");
		System.out.println("Fruits after add(): "+fruits);
		System.out.println("---------addAll()------------");
		Collection<String> morefruits = new ArrayList<>();
		morefruits.add("mango");
		morefruits.add("grapes");
		morefruits.add("orange");
		morefruits.add("papaya");
		fruits.addAll(morefruits);
		System.out.println("Fruits after addAll(): "+fruits);
		fruits.remove("banana");
		System.out.println("Fruits after remove(banana): "+fruits);
		System.out.println("----------removeAll()-------------");
		Collection<String> removeList = new ArrayList<>();
		removeList.add("mango");
		removeList.add("cherry");
		removeList.add("papaya");
		fruits.removeAll(removeList);
		System.out.println("After removeAll(mango, cherry, papaya)"+fruits);
		System.out.println("------------retainAll()-----------------");
		Collection<String>retainList = new ArrayList<>();
		retainList.add("apple");
		retainList.add("grapes");
		retainList.add("orange");
		fruits.retainAll(retainList);
		System.out.println("------------containsAll()-----------------");
		System.out.println("fruits after retainAll(apple, grapes, orange)"+fruits);
		System.out.println("contains apple: "+fruits.contains("apple"));
		System.out.println("contains apple: "+fruits.contains("pineapple"));
		Collection<String>checkList = new ArrayList<>();
		checkList.add("apple");
		checkList.add("grapes");
		System.out.println("Contains all(apple, grapes): "+fruits.containsAll(checkList));
		
		System.out.println("fruits size: "+fruits.size());
		
		System.out.println("is collection empty? : "+fruits.isEmpty());
		
		//toArray converts collection to array
		Object[] fruitArray = fruits.toArray();
		System.out.println("Fruits as array ");
		for(int i=0;i<fruitArray.length; i++) {
			System.out.println(fruitArray[i]+" : ");
		}
		
		System.out.println("-----------iterating using iterator()----------");
		System.out.println("iterator using iterator");
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		fruits.clear();
		System.out.println("fruits after clear(): "+fruits);
		System.out.println("fruits list is empty?: "+fruits.isEmpty());

	}

}
