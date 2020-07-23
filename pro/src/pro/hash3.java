--------------------------해시를 사용한 다른 사람 풀이법---------------------------

import java.util.HashMap;

class Solution {

    public boolean solution(String[] phone_book) {

        boolean answer = true;

        HashMap<String, String> hashMap = new HashMap<String, String>();

        

        for(int i=0; i<phone_book.length; i++){

            hashMap.put(phone_book[i], "prefix");

        }

        for(String phone:phone_book){

            for(int idx=0; idx<phone.length(); idx++){

                if(hashMap.containsKey(phone.substring(0,idx))){

                    answer=false;

                }

            }

        }

        return answer;

    }

}


