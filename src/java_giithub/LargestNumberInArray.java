package java_giithub;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				int numbers []= {5,12,3,9,40,10};
				int  max =numbers[0]; // assume number=5 is maximum
				
				for(int i=1; i< numbers.length; i++) {
					if(numbers[i]> max) {
						max= numbers[i];
					}
					
				}
				System.out.println("Largest Number In Array is " +max);
				
			}

	}


