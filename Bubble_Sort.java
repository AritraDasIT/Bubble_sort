class x extends Thread
{
    public void run ()
    {
        int arr1[]={87,90,500,40};
        int n = arr1.length;

        int i=0;
        int temp=0;

        for(i=0; i<n;i++)
        {
            for (int j=1 ; j<n-1;j++)
            {
                if(arr1[j-1]>arr1 [j])
                {
                    temp= arr1[j-1];
                    arr1[j-1]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }

        System.out.println("bubble sort");
        for( i=0; i<n;i++)
        {
            System.out.println(arr1[i]);
        }


    }
}

class Y extends Thread
{
    public void runable()
    {
        int arr2[]={9,3,4,1};
        int n = arr2.length;

        for(int j = 1 ; j<n;j++)
        {
            int key = arr2[j];
            int i = j-1;

            while((i>-1) && (arr2[i])>key)
            {
                arr2[i+1]=arr2[i];
                i--;
            }
            arr2[i+1]=key;
        }

        for(int i =0 ; i<n ; i++)
        {
            System.out.println(arr2[i]);
        }

    }

}


public class Main {

    public static void main(String args[])
    {
        x obj = new x();
        Y obj1 = new Y();

        obj.run();
        obj1.runable();
    }
}
