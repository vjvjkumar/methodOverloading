package Pack1;

public class VarArgExample {
	
public static void main(String[] args)
	{
	sum();					// sum 0
	sum(10);				// sum 10
	sum(10, 20);			// sum 30
	sum(10, 20, 30);		// sum 60
	sum(10, 20, 30, 40);	// sum 100
	}

	public static void sum(int... x) // here "x" is one-dimensional array, in which int-values are there.
	{
	int total = 0; //declare int variable - "total"
	
	for (int x1 : x) // for each int value variable-x1 in x (present in x[] array)
					//(internally var-arg parameters"(int... x)" will be converted into one dimensional array (ie., int[] array)
	{
		total = total + x1;
	}
	System.out.println("The sum is : "+total);
	}
}
