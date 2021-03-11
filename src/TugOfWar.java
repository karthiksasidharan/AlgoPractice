import java.util.Arrays;
import java.util.Comparator;


public class TugOfWar {

	public static void main(String[] args) {
		
		
		//Assuming n to be even
		//Logic sort in descending order
		//Take elements as pairs
		//Add the largest element to the array with the smallest sum and smallest element to array with larger sum
		
		
		Integer [] mainArray = {3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
		
		Integer [] subArrayOne = new Integer[5];
		Integer [] subArrayTwo = new Integer[5];
		
		Arrays.sort(mainArray, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg1-arg0;
			}
		});
		
		
		
		int arrayOneSum=0;
		int arrayTwoSum=0;
		int j=0;
		subArrayOne[j]=mainArray[0];
		subArrayTwo[j]=mainArray[1];
		arrayOneSum=mainArray[0];
		arrayTwoSum=mainArray[1];
				
		for(int i=2;i<mainArray.length-1;i=i+2){
			j++;
			
			
			if(arrayOneSum>arrayTwoSum){
				subArrayTwo[j]=mainArray[i];
				subArrayOne[j]=mainArray[i+1];
				
				arrayOneSum+=mainArray[i+1];
				arrayTwoSum+=mainArray[i];
				
			}else{
				subArrayOne[j]=mainArray[i];
				subArrayTwo[j]=mainArray[i+1];
				
				arrayOneSum+=mainArray[i];
				arrayTwoSum+=mainArray[i+1];
			}
		}
		
		System.out.println("Sub Array 1");
		for(int i=0;i<subArrayOne.length;i++){
			System.out.print(subArrayOne[i]+", ");
		}
		System.out.println();
		System.out.println("Sub Array 2");
		for(int i=0;i<subArrayOne.length;i++){
			System.out.print(subArrayTwo[i]+", ");
		}
	}

}
