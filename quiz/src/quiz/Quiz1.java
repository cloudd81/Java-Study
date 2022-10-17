package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = 0;
		if(numOfApples%sizeOfBucket==0) {
			numOfBucket = numOfApples / sizeOfBucket; 
		} else {
			numOfBucket = (numOfApples / sizeOfBucket) + 1;
		} // if end
		
		System.out.println(numOfBucket);
	} // main() end

}
