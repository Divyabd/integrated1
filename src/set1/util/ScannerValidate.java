package set1.util;

import java.util.Scanner;

public class ScannerValidate {
	public static Scanner scanner = new Scanner(System.in);
	// private static Object String;

	public static int getValidInt() {
		int number;
		while (true) {
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				if (number >= 0)
					break;
				else {
					System.out.println("please enter positive number");
				}

			} else {
				System.out.println("please enternumber");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static int getValidIntOne() {
		int number;
		while (true) {
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				if (number > 0)
					break;
				else {
					System.out.println("please enter positive number");
				}

			} else {
				System.out.println("please enternumber");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static int getInt() {
		int number;
		while (true) {
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				break;
			} else {
				System.out.println("please enter number");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static long getLong() {
		long number;
		while (true) {
			if (scanner.hasNextLong()) {
				number = scanner.nextLong();
				break;
			} else {
				System.out.println("please enter number");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static long getValiedLong() {
		long number;
		while (true) {
			if (scanner.hasNextLong()) {
				number = scanner.nextLong();
				if (number > 0)
					break;
				else {
					System.out.println("please enter number");
				}
			} else {
				System.out.println("please enter number");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static double getDouble() {
		double number;
		while (true) {
			if (scanner.hasNextDouble()) {
				number = scanner.nextDouble();
				break;
			} else {
				System.out.println("please enter number");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static float getFloat() {
		float number;
		while (true) {
			if (scanner.hasNextFloat()) {
				number = scanner.nextFloat();
				break;
			} else {
				System.out.println("please enter number");
				scanner.nextLine();
			}
		}
		return number;
	}

	public static String getString() {
		String string;
		while (true) {
			if (scanner.hasNextLine()) {
				string = scanner.nextLine();
				if (string != null)
					break;
			} else {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			}
		}
		return string;
	}

	public static char getChar() {
		char string;
		while (true) {
			if (scanner.hasNextLine()) {
				string = scanner.next().charAt(0);
				if (string != '\0')
					break;
			} else {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			}
		}
		return string;
	}

	public static String getStringLower() {
		String string;
		String m = "";
		while (true) {
			if (scanner.hasNextLine()) {
				string = scanner.nextLine();
				if (string != null)

					for (int i = 0; i < string.length(); i++) {
						if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
							m += (char) (string.charAt(i) + 32);
						} else
							m += string.charAt(i);
					}
				break;
			} else {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			}
		}
		return m;
	}

	public static char getCharLower(char c) {
		if (c >= 'A' && c <= 'Z') {
			c = (char) (c + 32);
			return c;
		} else
			return c;

	}

	public static char getCharUpper(char c) {
		if (c >= 'A' && c <= 'Z') {
			return c;
		} else {
			c = (char) (c - 32);
			return c;
		}

	}

	public static String getStringValied() {
		String string;
		while (true) {
			string = scanner.next();
			if (string == null) {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			} else if (string.matches("([a-zA-Z][a-zA-Z\\s]+)")) {

				break;
			} else
				System.out.println("name not valied");
			scanner.nextLine();

		}
		return string;
	}

	public static String getAccType() {
		String string;
		while (true) {
			if (scanner.hasNextLine()) {
				string = scanner.nextLine();
				if (string != null)
					if (string.compareTo("saving") == 0) {
						break;
					} else {
						System.out.println("this type of account not exit in our bank account");
					}
			} else {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			}
		}
		return string;
	}

	public static String getDate() {
		String string;
		while (true) {
			if (scanner.hasNextLine()) {
				string = scanner.nextLine();
				if (string != null)
					if (string.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {

						break;
					} else
						System.out.println("invalied date");

			} else {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			}
		}
		return string;
	}

	public static String getValidDate() {
		int number;
		int month;
		int date;
		while (true) {
			System.out.println("enter Born year  ( formate:yyyy)  ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				System.out.println("enter Born month  ( formate:mm)  ");
				month = scanner.nextInt();
				System.out.println("enter Born date  ( formate:dd)  ");
				date = scanner.nextInt();
				if (number >= 1935 && number <= 2019 && month >= 01 && month <= 12 && date >= 1 && date <= 31) {
					break;

				} else
					System.out.println("Date not valied");

			} else {
				System.out.println("please enter ");
				scanner.nextLine();
			}
		}
		return date + "/" + month + "/" + number;
	}

	public static String getValidDateTrip() {
		int number;
		int month;
		int date;
		while (true) {
			System.out.println("enter the trip year you want ( formate:yyyy)  ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				System.out.println("enter the trip  month  ( formate:mm)  ");
				month = scanner.nextInt();
				System.out.println("enter the trip date  ( formate:dd)  ");
				date = scanner.nextInt();
				break;
			} else {
				System.out.println("please enter ");
				scanner.nextLine();
			}
		}
		return date + "/" + month + "/" + number;
	}

	public static int getTime() {
		int h;
		int m;
		while (true) {
			System.out.println("enter hour ");
			if (scanner.hasNextInt()) {
				h = scanner.nextInt();

				if (h >= 0 && h <= 24) {
					break;

				} else
					System.out.println("time not valied enter in 24 hours formate");

			} else {
				System.out.println("please enter ");
				scanner.nextLine();
			}
		}
		return h;
	}

	public static int getMinute() {
		
		int m;
		while (true) {
			System.out.println("enter minute");
			if (scanner.hasNextInt()) {
				m = scanner.nextInt();

				if (m >= 0 && m <= 60) {
					break;

				} else
					System.out.println("time not valied enter in 24 hours formate");

			} else {
				System.out.println("please enter ");
				scanner.nextLine();
			}
		}
		return m;
	}
	public static String getPhone() {
		String string;
		while (true) {
			if (scanner.hasNextLine()) {
				string = scanner.nextLine();
				if (string != null)
					if (string.matches("((9)?[0-9]{10})")) {
						break;
					} else
						System.out.println("invalied  number");

			} else {
				System.out.println("Null pointer exception");
				scanner.nextLine();
			}
		}
		return string;
	}

	public static int getValidRating() {
		int number;
		while (true) {
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				if (number >= 0 && number <= 5)

					break;
				else {
					System.out.println("not valied");
				}

			} else {
				System.out.println("not valied");
				scanner.nextLine();
			}
		}
		return number;
	}
}
