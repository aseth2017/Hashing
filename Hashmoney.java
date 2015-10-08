public class Hashmoney extends Hasher
{
	public int hash(Object obj)
	{
		int x = 0;
		for(int i = 0; i < obj.toString().length(); i++)
		{
			x += obj.toString().charAt(i);
		}
		return x;
	}
	public String getCoderName()
	{
		return "Anish Seth";
	}
	public static void main(String[] args)
	{
		Hashmoney hashing = new Hashmoney();
		String str = "Bilbo Baggins";
		System.out.println(hashing.hash(str) + "\nMade by: " + hashing.getCoderName());
	}
}