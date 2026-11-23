package stats;

public class Stats {

	private int[] numbers;
	private int count;

	public Stats(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be greater than 0");
		}
		this.numbers = new int[capacity];
		this.count = 0;
	}

	public void addValue(int value) {
		if (count >= numbers.length) {
			throw new IllegalStateException("Stats is full: cannot add more values");
		}
		numbers[count] = value;
		count++;
	}

	public int getMax() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}
		int max = numbers[0];
		for (int i = 1; i < count; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	public int getMin() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}
		int min = numbers[0];
		for (int i = 1; i < count; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	public double getAverage() {
		if (count == 0) {
			return 0.0;
		}
		return (double) getTotal() / count;
	}

	public int getTotal() {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}
		return total;
	}

	public int getCount() {
		return this.count;
	}
}