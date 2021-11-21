public class LongestCommonSubseq {

    public static void main(String[] a)
    {

        String str1= "Interview";
        String str2= "view";
        int maxcommon=3;
        String longestCommon=  longesetCommon(str1, str2, maxcommon);
    }

    private static String longesetCommon(String str1, String str2, int maxcommon) {
        int max=0;
        String longesstCommonString = null;
        for(int i=0; i< str1.length(); i++)
        {
            for(int k=maxcommon; k<str2.length(); k++) {
                if (k <= str1.length()) {
                    String commonString = str1.substring(i, k);
                    int x = 0;
                    if (str2.contains(commonString)) {
                        x = commonString.length();
                    } else {
                        break;
                    }
                    if (x > max) {
                        max = x;
                        longesstCommonString = commonString;

                    }
                }
            }

        }
        return longesstCommonString;
    }
}
