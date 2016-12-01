//add element to an array using recursion
public class AddElementWithRecursion {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5};
		int itemToAdd = 6;

		int[] newArray = addItFunc(test, itemToAdd);
		for(int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}

	public static int[] addItFunc(int[] existing, int newItem) {
		if(existing.length == 0) {
			int[] newAr = {newItem};
			return newAr;
		}
		else {
			int[] newerAr = new int[existing.length + 1];
			return addItFunc(existing, newItem, newerAr, 0);
		}
	}

	public static int[] addItFunc(int[] existing, int newItem, int[] newerAr, int pos) {
		if(pos < existing.length) {
			newerAr[pos] = existing[pos];
			return addItFunc(existing, newItem, newerAr, pos+1);
		}
		else {
			newerAr[pos] = newItem;
			return newerAr;
		}
	}
}