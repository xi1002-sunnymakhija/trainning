public class UnionAndIntersectionOfTwoArray {

    public static void main(String[] a) {
        int[] ar1 = new int[]{1, 2, 3, 4};
        int[] ar2 = new int[]{2, 3};
        unionArray(ar1, ar2);
        intersectionArray(ar1, ar2);
    }

    private static void intersectionArray(int[] ar1, int[] ar2) {
        int flength = ar1.length;
        int slength = ar2.length;
        int i = 0, k = 0;
        System.out.println("Intersection of two element is :");
        while (i < flength && k < slength) {
            if (ar1[i] > ar2[k]) {
                k++;
            } else if (ar1[i] < ar2[k]) {
                i++;
            } else {
                System.out.println(ar2[k++]);
                i++;

            }
        }
    }

    private static void unionArray(int[] ar1, int[] ar2) {
        int flength = ar1.length;
        int slength = ar2.length;
        int i = 0, k = 0;
        while (i < flength && k < slength) {
            if (ar1[i] > ar2[k]) {
                System.out.println(ar2[k]);
                k++;
            } else if (ar1[i] < ar2[k]) {
                System.out.println(ar1[i]);
                i++;
            } else {
                System.out.println(ar2[k++]);
                i++;

            }
        }
        while (i < flength)
            System.out.print(ar1[i++] + " ");
        while (k < slength)
            System.out.print(ar2[k++] + " ");
    }

}
