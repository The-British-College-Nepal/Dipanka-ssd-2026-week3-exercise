package stats;

/**
 * Calculates statistical metrics from a dynamic collection of integer values.
 *
 * @author Sudan Pudasaini
 */
public class Stats {

	private int[] numbers;
	private int count;

	/**
	 * Creates an empty Stats collection with a fixed maximum size.
	 *
	 * @param capacity the maximum number of integers this collection can hold
	 * @throws IllegalArgumentException if capacity is less than or equal to 0
	 */
	public Stats(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be greater than 0");
		}
		this.numbers = new int[capacity];
		this.count = 0;
	}

	/**
	 * Appends an integer to the collection.
	 *
	 * @param value the integer to be added
	 * @throws IllegalStateException if the collection is already full
	 */
	public void addValue(int value) {
		if (count >= numbers.length) {
			throw new IllegalStateException("Stats is full: cannot add more values");
		}
		numbers[count] = value;
		count++;
	}

	/**
	 * Returns the largest value stored in the collection.
	 *
	 * @return the maximum value added so far
	 * @throws IllegalStateException if no values have been added
	 */
	public int getMax() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added to calculate statistics.");
		}
		int max = numbers[0];
		for (int i = 1; i < count; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	/**
	 * Returns the smallest value stored in the collection.
	 *
	 * @return the minimum value added so far
	 * @throws IllegalStateException if no values have been added
	 */
	public int getMin() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added to calculate statistics.");
		}
		int min = numbers[0];
		for (int i = 1; i < count; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	/**
	 * Returns the arithmetic mean of all stored values.
	 *
	 * @return the average of the values added so far
	 * @throws IllegalStateException if no values have been added
	 */
	public double getAverage() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added to calculate statistics.");
		}
		return (double) getTotal() / count;
	}

	/**
	 * Returns the sum of all stored values.
	 *
	 * @return the total of all values added so far (0 if none have been added)
	 */
	public int getTotal() {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * Returns how many values have been added.
	 *
	 * @return the number of stored values
	 */
	public int getCount() {
		return this.count;
	}
}