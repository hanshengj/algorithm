喝饮料

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }

    public static int count(int n) {
        int sum = 0;//喝的饮料数量
        while (n > 2) {
            sum += n / 3;//每次的饮料数
            n = n / 3 + n % 3;//剩余的空瓶子数
        }
        if (n == 2) {//两个瓶子时，还能接的喝一瓶
            sum++;
        }
        return sum;
    }
}
