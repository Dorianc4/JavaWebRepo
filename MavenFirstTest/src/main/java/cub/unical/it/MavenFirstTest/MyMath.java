package cub.unical.it.MavenFirstTest;

public class MyMath {
	int fibonacci(int position) {
		if(position < 0)
			throw new IllegalArgumentException("The position must be greater than 0");
		else if(position == 0)
			return 1;
		else if(position == 1) {
			return 1;
		}
		else
			return fibonacci(position - 1) + fibonacci(position - 2);
	}
}
