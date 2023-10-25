package demo;

public class Demotwo {
	//Find missing number between 1 to 100
	//input array of numbers
	//n * (n+1)/2
	public static void main(String args[]){
	int[] numbers = {1,2,3,5};
//	for(int i=0; i<98; i++){
//		numbers[i] = i;
//	}
	int temp = 0;
	for(int j=0; j<numbers.length; j++){
		System.out.println(numbers[j]+ " : "+numbers[j] * (numbers[j] + 1) /2);
		temp += numbers[j] * (numbers[j] + 1) /2;
	}
	System.out.println("temp: "+temp);
	//System.out.println(temp+ " : "+temp * (temp + 1) /2);
	}
}
