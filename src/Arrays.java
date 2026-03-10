public class Arrays {
    public String name;
    public String lastname;


//    make 3 methods

//1. a method called averageNum that averages all the numers in the array and souts the result

//2. a method called maxNum that prints the largest number in the array

//3. a method called minNum that prints the smallest number in the array
    public int [] nums;
    public Astronaut [] astronauts;

    public static void main(String[] args) {
        System.out.println("welcome to awesome arrays!");
        new Arrays();


    }



    public Arrays()
    {
        nums = new int[10];
        astronauts = new Astronaut[10];
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
        for(int x = 0; x<astronauts.length; x++)
        {
            astronauts[x] = new Astronaut();
        }

        astrofill();
        for(int x = 0; x<astronauts.length; x++)
        {
            astronauts[x].printinfo();
        }

    }

    public void astrofill ()
    {
        for (int x = 0; x<astronauts.length; x++)
        {
            int rand = (int) (Math.random()*2)+1;
            int rand1 = (int) (Math.random()*10)+1;


            astronauts[x].eyes = rand;
            if(rand1 == 1)
            {
                name = "Sharon";
            }
            if(rand1 == 2)
             {
            name = "John";
            }
            if(rand1 == 3)
            {
                name = "Bob";
            }
            if(rand1 == 4)
            {
                name = "Billy";
            }
            if(rand1 == 5)
            {
                name = "Shakira";
            }
            if(rand1 == 6)
            {
                name = "Adelle";
            }
            if(rand1 == 7)
            {
                name = "Billy Bob Joel";
            }
            if(rand1 == 8)
            {
                name = "Kimmy";
            }
            if(rand1 == 9)
            {
                name = "Timothee";
            }
            if(rand1 == 10)
            {
                name = "Michael";
            }


            rand1 = (int) (Math.random()*10)+1;


            astronauts[x].eyes = rand;
            if(rand1 == 1)
            {
                lastname = "Sharon";
            }
            if(rand1 == 2)
            {
                lastname = "John";
            }
            if(rand1 == 3)
            {
                lastname = "Bob";
            }
            if(rand1 == 4)
            {
                lastname = "Billy";
            }
            if(rand1 == 5)
            {
                lastname = "Shakira";
            }
            if(rand1 == 6)
            {
                lastname = "Adelle";
            }
            if(rand1 == 7)
            {
                lastname = "Billy Bob Joel";
            }
            if(rand1 == 8)
            {
                lastname = "Kimmy";
            }
            if(rand1 == 9)
            {
                lastname = "Timothee";
            }
            if(rand1 == 10)
            {
                lastname = "Michael";
            }
            astronauts[x].name = name + " "+  lastname;
        }
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
        biggest = nums[0];
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
        smallest = nums[0];
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

