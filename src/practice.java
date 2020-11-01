
public class practice {

	public static int secondLargest(int[] input)
	{
		int largest=0;
		int second=0;
		for(int i = 0 ; i <input.length;i++)
		{
			if(input[i]>largest)
			{
				//replace
				second=largest;
				largest=input[i];
			}
		}
		return second;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,4,89,90};
		System.out.println("Second largest : " +secondLargest(input));
		
	}

}
