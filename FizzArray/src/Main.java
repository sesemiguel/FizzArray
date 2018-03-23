public class Main {
	public static void main(String[]args) {
		int[] array = fizzArray(5,10);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static int[] fizzArray(int start, int end) {
		int size = end-start;
		int[] array = new int[size];
		int j=0;
		for(int i = start; i<end; i++) {
			array[j] = i;
			j++;
		}
		return array;
	}
}