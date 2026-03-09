package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiFunction {

	public static void main(String[] args) {
	
		List<Integer> nums = Arrays.asList(1,2,3,8,4,5,10);
		List<String> names = Arrays.asList("rushi","suraj","rutik","adarsh");
		
		// count
		Long countNumbers = nums.stream().count();
		Long countNames = names.stream().count();
		System.out.println(countNumbers);
		System.out.println(countNames);
		
		// distinct to get unique elements
		List<Integer> duplicates = Arrays.asList(1,2,2,3,8,4,4,5,10);
		List<Integer> distinctElements = duplicates.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);
		
		// for each
		nums.stream().forEach((num) -> System.out.print(num+" "));
		System.out.println();
		
		//sort to sort the data
		List<Integer> sortedByComparable =  nums.stream().sorted().collect(Collectors.toList());
		List<Integer> sortedByComparator = nums.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> sortedByComparatorReverse = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedByComparable);
		System.out.println(sortedByComparator);
		System.out.println(sortedByComparatorReverse);
		List<Integer> sortedByComparatorLambada = nums.stream().sorted((o1,o2) -> o1-o2).collect(Collectors.toList());
		List<String> sortedByComparatorLambda = names.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedByComparatorLambada);
		System.out.println(sortedByComparatorLambda);
		// if object is there need to implement comparable/comparactor in class or while passing into the the function need to specify
		// on what basis we are sorting as id,name,sallary,departemt,skill etc
		
		// filter
		List<Integer> numsGreaterThanTwo =  nums.stream().filter((num) -> num>2).collect(Collectors.toList());
		List<Integer> evenNumbers =  nums.stream().filter((num) -> num%2 == 0).collect(Collectors.toList());
		List<Integer> oddNumbers =  nums.stream().filter((num) -> num%2 != 0).collect(Collectors.toList());
		List<String> filteredName = names.stream().filter((name) -> name.startsWith("r")).collect(Collectors.toList());
		System.out.println(numsGreaterThanTwo);
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(filteredName);
		
		// map transformation of each element
		List<String> intToString =  nums.stream().map((num) -> String.valueOf(num)).collect(Collectors.toList());
		List<String> toUpperCase = names.stream().map((name) -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(intToString);
		System.out.println(toUpperCase);
		
		// anyMatch out collection of data any one should match perticular condition
		boolean anyMatch = nums.stream().anyMatch((num) -> num == 2);
		System.out.println(anyMatch);
		boolean anyMatch1 = nums.stream().anyMatch((num) -> num == 100);
		System.out.println(anyMatch1);
		
		// allMatch out collection of data all should match perticular condition
		boolean allMatch = nums.stream().allMatch((num) -> num>0);
		System.out.println(allMatch);
		boolean allMatch1 = nums.stream().allMatch((num) -> num>5);
		System.out.println(allMatch1);
		
		// mapToInt to find sum,avg
		double average = nums.stream().mapToInt((num) -> num).average().getAsDouble();
		int sum = nums.stream().mapToInt((num) -> num).sum();
		System.out.println(average);
		System.out.println(sum);
		
		// group the elements by grouping by
		Map<Object, List<String>> groupByLength = names.stream().collect(Collectors.groupingBy((name) -> name.length()));
		System.out.println(groupByLength);
		
		// group the element and also count
		Map<Object, Long> groupByLengthAndCount = names.stream().collect(Collectors.groupingBy((name) -> name.length(),Collectors.counting()));
		System.out.println(groupByLengthAndCount);
		
		// count the frequency
		String str = "rushikesh";
		Map<Character, Long>  frequency = str.chars().mapToObj((ch) -> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(frequency);
		
		int arr[] = {1,2,1,1,2,3,4,5};
		Map<Integer, Long> res = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(res);
		
		// max and min
		int max = nums.stream().max((o1,o2) -> o1-o2).get();
		String max1 = names.stream().max((o1,o2) -> o1.compareTo(o2)).get();
		System.out.println(max);
		System.out.println(max1);
		int min = nums.stream().min((o1,o2) -> o1-o2).get();
		String min1 = names.stream().min((o1,o2) -> o1.compareTo(o2)).get();
		System.out.println(min);
		System.out.println(min1);
		
		//skip and limit 
		// skip the first element and return the only 4 elements
		List<Integer> skipAndLimit = nums.stream().skip(1).limit(4).collect(Collectors.toList());
		System.out.println(skipAndLimit);
		
		//flatmap
		List<List<String>> collectionOfNames = Arrays.asList(Arrays.asList("rushi"),Arrays.asList("rutik"),Arrays.asList("SURAJ"));
		List<String> flatteredList =  collectionOfNames.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flatteredList);
		
		//seperate even and odds
				Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.partitioningBy((num) -> num%2 == 0));
				List<Integer> even = map.get(true);
				List<Integer> odd = map.get(false);
				System.out.println(even);
				System.out.println(odd);
				
	    // join list of string with prefix,suffix,deliminator
		String result = names.stream().collect(Collectors.joining("/","[","}"));
		System.out.println(result);
		
		// merge two unsorted array into single sorted array
		int arr1[] = {2,5,3,4};
		int arr2[] = {1,8,9,7,6};
		int sortedArray[] = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
		List<Integer> list = Arrays.stream(sortedArray).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		// three max or min
		List<Integer> max3 = nums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(max3);
		
		//second largest
		Integer secondLargest = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargest);
		
		// list of string in increasing order of length
		List<Integer> sortedLength = names.stream().map((name) -> name.length()).sorted().collect(Collectors.toList());
		System.out.println(sortedLength);
	
		// sum and average of an array
		Arrays.stream(arr1).sum();
		Arrays.stream(arr1).average().getAsDouble();
		int last = Arrays.stream(arr1).skip(arr1.length-1).findFirst().getAsInt();
		System.out.println(last);
		

	}

}
