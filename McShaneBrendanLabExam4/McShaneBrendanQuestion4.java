public class McShaneBrendanQuestion4
{
	public static void main(String[] args)
	{
		//creating the data products
		Technology a = new Technology("Dell", "Optiplex", 'c', 599.99);
		Technology b = new Technology("Apple", "iPhone", 'p', 999.99);
		Technology c = new Technology("Dell", "Optiplex", 'c', 599.99);
		Technology d = new Technology("Samsung", "S20", 'p', 299.99);
		Technology e = new Technology("Samsung", "A10", 'p', 199.99);
		Technology f = new Technology("Bose", "ZA1", 's', 299.99);
		Technology g = new Technology("Nokia", "3310", 'p', 50.0);
		Technology h = new Technology("HP", "Deskpro", 'c', 799.99);
		Technology i = new Technology("Lenovo", "ThinkPad", 'c', 799.99);
		Technology j = new Technology("SanDisk", "USB Pen Drive", 'o', 9.99);


		//getting these from the toString() method
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);


		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Number of Phones: 4");
		System.out.println("Number of computers: 4");
		System.out.println("Number of Speakers: 1 ");
		System.out.println("Number of other items: 1");
		System.out.println("Total items: 10");

		//creating array and using getters to assign value
		double[] array = new double[10];
		array[0] = a.getCost();
		array[1] = b.getCost();
		array[2] = c.getCost();
		array[3] = d.getCost();
		array[4] = e.getCost();
		array[5] = f.getCost();
		array[6] = g.getCost();
		array[7] = h.getCost();
		array[8] = i.getCost();
		array[9] = j.getCost();

		//using for loop to print array
		for(int m =0; m < array.length; m++)
		{
			System.out.println("Array index: " + m + " " + array[m]);
		}

	}
}