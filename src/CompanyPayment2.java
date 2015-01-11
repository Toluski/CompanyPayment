
public class CompanyPayment2 {

	public static void main(String[] args)
	{
	
		int i,j;
		int[] fixedAmount = {200, 300, 400, 350, 500, 700, 150, 900, 800, 500};
		int[] salesArray = {2000, 1500, 2000, 3500, 2500, 6500, 5000, 2900, 1800, 3500};
		int[] finalSalary = new int[fixedAmount.length]; 
		int[] salaryRange = {200, 299, 300, 399, 400, 499, 500, 599, 600, 699,700, 799, 800, 899, 900, 999, 1000, 10000};
		int[] employees = new int[salaryRange.length];
		
		for(i = 0; i < fixedAmount.length; i++)
		{
			finalSalary[i] = fixedAmount[i] + salesArray[i]*(5/100);
		}
		
		for(i = 0; i < salaryRange.length-1; i++)
		{
			for(j = 0; j < fixedAmount.length; j++)
			{
				 if(finalSalary[j] >= salaryRange[i] && finalSalary[j] < salaryRange[i+1])
				{
					employees[i]++;
				}
				
			}
			i++;
			
		}
		
		for(i = 0; i < salaryRange.length-1; i++)
		{
			
				System.out.println("$" + salaryRange[i] + "-" + salaryRange[i+1] + "--->>>" + employees[i]);
			
				i++;
			
		}
	}

}
