package week1.day2;

public class Car {
	
		public int getRegNumber() {
			int regNumber=6784;
			return regNumber;
			}
		private String getCarOwnerName() {
			return "Chitra";
			}
		void printCarModel() {
			System.out.println("SWIFT");
			}
		public boolean isCarPunctured() {
			return true;
		}
		public int subtractTwoNumbers(int n1,int n2) {
			return(n1-n2);
		}
		public int multiplyThreeNumbers(int n1,int n2,int n3) {
			return(n1*n2*n3);
		}
		public int divideTwoNumbers(int n1,int n2) {
			return(n1/n2);
		}
		public static void main(String[] args) {
			
			Car c = new Car();
			int regNumber = c.getRegNumber();
			System.out.println("car registration number: "+regNumber);
			String carOwnerName = c.getCarOwnerName();
			System.out.println("Car owner's name: "+carOwnerName);
			c.printCarModel();
			boolean isCarPunctured = c.isCarPunctured();
			System.out.println("Is punctured :"+isCarPunctured);
			int subtractTwoNumbers = c.subtractTwoNumbers(20, 10);
			System.out.println("Substraction :"+subtractTwoNumbers);
			int multiplyThreeNumbers = c.multiplyThreeNumbers(5,5,5);
			System.out.println("Multiplication :"+multiplyThreeNumbers);
			int divideTwoNumbers = c.divideTwoNumbers(10,5);
			System.out.println("Division :"+divideTwoNumbers);
		}

	}
}
