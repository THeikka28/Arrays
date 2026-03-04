public class Arrays {
//    make 3 methods

//1. a method called averageNum that averages all the numers in the array and souts the result

//2. a method called maxNum that prints the largest number in the array

//3. a method called minNum that prints the smallest number in the array
    public int [] nums;

    public static void main(String[] args) {
        System.out.println("welcome to awesome arrays!");
        new Arrays();

    }



    public Arrays()
    {
        nums = new int[10];
        nums[9] = 719;
        nums[1] = 12;
        nums[2] = 47;
        nums[3] = 48903;
        nums[4] = 3278;
        nums[5] = 236579829;
        nums[7] = 67;
        nums[8] = 99;
        arrayfill();
        System.out.println(nums[1]);
        displayarray();
        sumarray();
        averageNum();
        maxnum();
        minnum();

    }
    public void arrayfill()
    {
        for (int x =0; x<nums.length;x++)
        {
            nums[x] = (int)(Math.random()*100)+1;
        }
    }
    public void displayarray()
    {
        for(int x = 0; x < nums.length; x++)
        {
            int y;
            y=x+1;
            System.out.println("Array value number " + y + " is " + nums[x]);
        }
    }
    public void sumarray()
    { int j;
        j=0;
        for(int k=0; k<nums.length; k++)
        {
            j = j+nums[k];
        }
        System.out.println("The total is " + j );
    }
    public void averageNum()
    { int total;
        double ave;
        total=0;
        for(int k=0; k<nums.length; k++)
        {
            total = total+nums[k];
        }
        ave = total/nums.length;
        System.out.println("The average is " + ave);
    }
    public void maxnum()
    {
        int biggest;
        biggest = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]>biggest)
            {
                biggest = nums[i];
            }
        }
        System.out.println("The largest value is " + biggest);
    }

    public void minnum()
    {
        int smallest;
        smallest = 101;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]< smallest)
            {
                smallest = nums[i];
            }
        }
        System.out.println("The smallest value is " + smallest);
    }


    }

