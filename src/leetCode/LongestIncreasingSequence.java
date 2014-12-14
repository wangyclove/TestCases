package leetCode;

public class LongestIncreasingSequence {
	public static void main(String[] args) {
		int[] sample = {1,2,3,4,5,7,5,5,4,6,7};
		LongestIncreasingSequence x = new LongestIncreasingSequence();
		
		System.out.println("The longest sequence length is "+x.getLongestSeq(sample));
	}
	
	public int getLongestSeq(int[] sample) {
		if(sample == null || sample.length == 0) {
			return 0;
		}
		int max = 1;
		int currentLength = 1;
		for(int i = 1; i<sample.length; i++) {
			
			if(sample[i] > sample[i-1]) {
				currentLength++;
			}else {
				max = Math.max(max, currentLength);
				currentLength = 1;
				//i--;
			}
			
		}
		return max;
	}
}
