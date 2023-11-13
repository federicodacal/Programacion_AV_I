
public class ArrayUtils {
	
	public static <T> int indexOf(T[] array, T target) {	
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	public static<T> T[] revers(T[] array) {
		T[] reversed = (T[]) new Object[array.length];
		for(int i=0; i<array.length; i++) {
			reversed[i] = array[array.length-i-1]; 
		}
		return reversed;
	}

}
