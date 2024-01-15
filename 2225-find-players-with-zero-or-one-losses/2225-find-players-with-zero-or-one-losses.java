class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
		
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < matches.length; i++) {
			
			if(count.containsKey(matches[i][1])) {
				
				count.put(matches[i][1], count.get(matches[i][1]) + 1);
			}
			else {
				count.put(matches[i][1], 1);
			}
		}
		
		for(int i = 0; i < matches.length; i++) {
			
			count.putIfAbsent(matches[i][0], 0);
		}
		
		List<Integer> zeroLoss = new ArrayList<>();
		List<Integer> oneLoss = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> map1: count.entrySet()) {
			if(map1.getValue() == 0) {
				zeroLoss.add(map1.getKey());
			}
			else if(map1.getValue() == 1) {
				oneLoss.add(map1.getKey());
			}
		}
		
        Collections.sort(zeroLoss);
		Collections.sort(oneLoss);

        List<List<Integer>> result = new ArrayList<>();

		result.add(zeroLoss);
		result.add(oneLoss);
		
		return result;
    }
}