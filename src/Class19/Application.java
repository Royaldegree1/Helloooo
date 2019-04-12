package Class19;

public class Application {

	public static void main(String[] args) {

		Animal anim = new Animal();

		System.out.println("This is anim ");

		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);

		Animal anim2 = new Animal();

		System.out.println("This is anim2 ");

		System.out.println(anim2.age);
		System.out.println(anim2.weight);
		System.out.println(anim2.breed);
		System.out.println(anim2.name);
		
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Printing the minimum value");
		
		System.out.println(Minimum.MIN_VALUE(my_array));

	}

}
