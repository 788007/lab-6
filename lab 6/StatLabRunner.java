
/**
 * @Laurel Woods
 * @ lab 5 9/9/16
 */
public class StatLabRunner
{
    public static void main(String[] args){
        int n = 40;
        StatLab loop = new StatLab(n);
        loop.loadRandom();
		System.out.println(loop.printArray());
        loop.sortArray();
        System.out.println("\n" + loop.printArray());
        System.out.println("\n" + "The mean is " + loop.findAverage());
        System.out.println("\n" + "The median is " + loop.getMedian());
        System.out.println("\n" + "The mode is " + loop.getMode());
    }
}
