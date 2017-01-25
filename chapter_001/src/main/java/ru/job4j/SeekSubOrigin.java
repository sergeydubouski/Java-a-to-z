package ru.job4j;

/**
 * SeekSubOrigin class.
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 24.01.2017.
*/
class SeekSubOrigin {

	/**
	 * the method seeks for subline in an origin line.
	 * @param origin - origin line.
	 * @param sub - subline.
	 * @return - returns true if there is a subline in a given origin line, otherwise false.
	*/
	public boolean contains(String origin, String sub) {

		char[] line = origin.toCharArray();
		char[] fragment = sub.toCharArray();

		boolean isMatch = false;

		for (int i = 0; i <= line.length - fragment.length; i++) {

			for (int j = 0; j < fragment.length; j++) {
				if (line[i + j] != fragment[j]) {
					break;
				}
				if (j == fragment.length - 1) {
					isMatch = true;
				}
			}

			if (isMatch) {
				break;
			}
		}
		return isMatch;
	}
}