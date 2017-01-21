package ru.job4j;

class ClipArray {

	public String[] clip(String[] arrayIn) {

		int arrayOutLength = 0;
		boolean flag = true;

		//sort out the array
		for(int i = 0; i < arrayIn.length - 1; i++) {

			for(int j = i + 1; j < arrayIn.length; j++) {

				if(arrayIn[i] == arrayIn[j]) {

					for(int k = j; k < arrayIn.length - 1; k++) {
						arrayIn[k] = arrayIn[k + 1];
					}
				}
			}
		}

		//clip the array
		for(int i = 0; i < arrayIn.length - 1; i++) {

			for(int j = i + 1; j < arrayIn.length; j++) {

				if(arrayIn[i] == arrayIn[j] && flag == true) {
					arrayOutLength = j;
					flag = false;
				}
			}
		}
		return arrayOut;
	}
}