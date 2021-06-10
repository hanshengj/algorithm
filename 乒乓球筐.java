
nowcoder有两盒（A、B）乒乓球，有红双喜的、有亚力亚的……现在他需要判别A盒
是否包含了B盒中所有的种类，并且每种球的数量不少于B盒中的数量，该怎么办呢？


// write your code here
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			boolean contain = true;
			StringBuffer input = new StringBuffer(in.next());
			char[] find = in.next().toCharArray();
			for (char c : find)
			{
				int index = input.indexOf(String.valueOf(c));
				if (index != -1)
					input.deleteCharAt(index);
				else
				{
					System.out.println("No");
					contain = false;
					break;
				}
			}
			if (contain)
				System.out.println("Yes");
		}
	}
}