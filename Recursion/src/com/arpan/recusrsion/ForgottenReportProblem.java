package com.arpan.recusrsion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ForgottenReportProblem {
	
	
	public static Map<Integer,Integer> lastVisitedNode=new HashMap<>();
	
	public static void main(String[] args) {
		int[][] citiesPath = { { 0, 1, 15, 6 }, { 2, 0, 7, 3 }, { 9, 6, 0, 12 }, { 10, 4, 8, 0 } };
		int k = 2;
		int cities = citiesPath.length;
		int findMinPath=findMinPath(k,cities,citiesPath);
		System.out.println(findMinPath);
	}
	

	private static int findMinPath(int k, int cities, int[][] citiesPath) {
		List<Integer> visited = new ArrayList<>();
		List<Integer> remainingCities = new ArrayList<Integer>();
		for (int i = 1; i < cities; i++) {
			remainingCities.add(i);
		}
		visited.add(0);
		int pathCost = findMinPath(cities, citiesPath, remainingCities, 0, visited);
		pathCost = citiesPath[lastVisitedNode.get(pathCost)][k - 1] + citiesPath[k - 1][0] + pathCost;
		return pathCost;
	}

	private static int findMinPath(int totalCities, int[][] citiesPath, List<Integer> remainingCities, int weight,
			List<Integer> visited) {

		if (visited.size() == totalCities) {
			lastVisitedNode.put(weight, visited.get(visited.size() - 1));
			return weight;
		}

		int minCost = Integer.MAX_VALUE;
		List<Integer> remainingCitiesNew = new ArrayList(remainingCities);
		for (Integer cities : remainingCitiesNew) {
			int index = visited.get(visited.size() - 1);
			visited.add(cities);
			remainingCities.remove(cities);
			int include = findMinPath(totalCities, citiesPath, remainingCities, weight + citiesPath[index][cities],
					visited);
			visited.remove(cities);
			remainingCities.add(cities);
			minCost = Math.min(minCost, include);
		}
		return minCost;
	}
}
