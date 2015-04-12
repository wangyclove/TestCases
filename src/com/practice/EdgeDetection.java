package com.practice;

public class EdgeDetection {
	public static void main(String[] args) {
		doTests();
	}
	
	public static int[] processEdges(int image[], int width, int threshold) {
		if(image == null || image.length == 0) {
			return null;
		}
		int numRows = image.length / width;
		int xMin, xMax, yMin, yMax, index, value;
		for (int row = 0; row < numRows; row++) {
			int rowCount = row * width;
			for (int col = 0; col < width; col++) {
				index = rowCount + col;
				value = image[index];
				xMin = (col == 0) ? 0 : col - 1;
				xMax = (col == width - 1) ? col : col + 1;
				yMin = (row == 0) ? 0 : row - 1;
				yMax = (row == numRows - 1) ? row : row + 1;
				if (!exceed(image, width, xMin, xMax, yMin, yMax, threshold, value)) {
					image[index] = 0;
					
				}
			}
		}
		return image;
	}
	
	public static boolean exceed(int[] image, int width, 
								 int xMin, int xMax, int yMin, int yMax, 
								 int threshold, int value) {
		int diff = 0;
		for (int row = yMin; row <= yMax; row++) {
			for (int col = xMin; col <= xMax; col++) {
				int index = row * width + col;
				diff = Math.abs(value - image[index]);
				if (diff >= threshold) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void doTests() {
		int[] img = {
			0, 1, 2, 0,
			1, 1, 5, 1,
			0, 0, 0, 0,
			0, 2, 0, 0
		};
		int width = 4;
		int threshold = 3;
		int count = 0;
		for (int a : processEdges(img, width, threshold)) {
			System.out.print(a + " ");
			if (++count % width == 0) {
				System.out.println();
			}
		}
		findEdge(img, width, threshold);
	}
	
	
	public static void findEdge(int[] input, int width, int threshold) {
		int row = input.length / width;
		int col = width;
		//scan the whole image
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int curIndex = i * width + j;
				//find all neighbors of imagePixel[i][j];
				int iMin = (i == 0) ? 0 : i -1;
				int iMax = (i == row - 1) ? row - 1 : i + 1;
				int jMin = (j == 0) ? 0 : j - 1;
				int jMax = (j == col - 1) ? col - 1 : j + 1;
				for (int a = iMin; a <= iMax; a++) {
					for (int b = jMin; b <= jMax; b++) {
						int tempIndex = a * width + b;
						if (Math.abs(input[curIndex] - input[tempIndex]) >= threshold) {
							System.out.println("EdgePoint : " + i + " " + j);
							a = iMax + 1;
							break;
						}
					}
				}
			}
		}
	}
}




























