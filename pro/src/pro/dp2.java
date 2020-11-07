class Solution {
    int solution(int[][] land) {
        int answer = 0;

        for(int i=1; i<land.length; i++){
            land[i][0] = Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]))+land[i][0];
            land[i][1] = Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]))+land[i][1];
            land[i][2] = Math.max(land[i-1][1], Math.max(land[i-1][0], land[i-1][3]))+land[i][2];
            land[i][3] = Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][0]))+land[i][3];
        }
        for(int i=0; i<land[0].length; i++){
            answer = Math.max(land[land.length-1][i], answer);
        }
        return answer;
    }
}