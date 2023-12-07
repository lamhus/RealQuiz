public class Main2{
    public static void main(String args[])
    {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        
        Addition2 add=(int x,int y)->
        {
            int sum=0;
            for(int i=x;i<=y;i++)
            {
                sum+=i;
            }
            return sum;
        };

        int result = add.addNum(start, end);
        System.out.println("Sum of numbers from "+start+" to "+end+": " + result);

    }
}