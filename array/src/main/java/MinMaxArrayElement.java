public class MinMaxArrayElement {

    public static void main(String[] a)
    {
        int[] ar= new int[]{1,2,3,4,5,6,7,8};
        minMaxArray(ar);
    }

    private static void minMaxArray(int[] ar) {
        int min=ar[0];
        int max=ar[0];
        for (int i=0;i<ar.length;i++) {
            if(ar[i] > max)
            {
                max= ar[i];
            }
            if(ar[i]< min){
                min = ar[i];
            }
        }
        System.out.println("min ele[]"+min);
        System.out.println("max ele[]"+max);
    }
}
