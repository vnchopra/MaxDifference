import java.util.Arrays;
import java.util.Collections;

public class MaxDifference 
{
	
	private int getMaxDifference(int[] array)
	{
		int maxValue = this.findMaxValue(array);
		System.out.println("maxValue: " + maxValue);
		int minValue = this.findMinValue(array);
		System.out.println("minValue: " + minValue);
		
		int maxDifference = maxValue - minValue;
		
		return maxDifference;
	}
	
	
	private int findMaxValue(int[] array)
	{
		int maxValue = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > maxValue)
			{
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	private int findMinValue(int[] array)
	{
		int minValue = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < minValue)
			{
				minValue = array[i];
			}
		}
		
		return minValue;
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] numbersArray = new int[] {3, 2, 2, 2, 100};
		
		MaxDifference md = new MaxDifference();
		int theValue = md.getMaxDifference(numbersArray);
		System.out.println(theValue);
		
	}

}
