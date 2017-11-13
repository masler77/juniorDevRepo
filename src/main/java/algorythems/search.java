package algorythems;

public class search {

	public static int linearSearch(int[] dataset, int target){
		//gå ignom dataset
		for(int i = 0; i < dataset.length; i++){
			if(dataset[i] == target){
				return i;
			}

		}
		return -1;
	}
	public static int binarySearch(int[] dataset, int target, int start, int end){
		int middle = Math.floorDiv(start, end);
		int value = dataset[middle];
		
		if(value > target){
			
		}else if (value < target){
			
		}
			return middle;	
	}
	
		
		
}
