class Solution {

    public String solution(String number, int k) {

        StringBuilder a = new StringBuilder(number);

        int idx;
 
        int l;
 
        for (int i = 0; i < k; i++) {

            l=a.length();

            idx = l - 1;

            for (int j = 0; j < l - 1; j++) {

                if (a.charAt(j) < a.charAt(j + 1)) {

                    idx = j;

                    break;

                }

            }

            a.deleteCharAt(idx);

        }

        return a.toString();

    }

}


