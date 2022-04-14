public class FindNextPermutationLexi {

    public static void main(String[] a)
    {
        int[] ar={0,1,2,5,3,3,0};

        findNextPermu(ar);
    }

    private static void findNextPermu(int[] ar) {
        int i=0;
        int j=ar.length-1;
        while(i<ar.length-1 && ar[i] < ar[i+1])
        {

            i++;
        }
        i--;

        while(j>i)
        {
            if(ar[j]> ar[i]) {
                break;
            }
            j--;
        }
        swap(i,j, ar);
        System.out.println(ar);

        reverse(ar, i+1, ar.length-1);

    }

    private static void reverse(int[] ar, int i, int i1) {

        while(i<=i1)
        {
            swap(i, i1, ar );
            i++;
            i1--;
        }
        System.out.println(ar);
    }

    private static void swap(int i, int j, int[] ar) {
        int temp= ar[i];
        ar[i]= ar[j];
        ar[j]= temp;

    }
}
