// Last updated: 12/28/2025, 4:51:28 PM
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int position=0;
        for(String h:commands){
            switch (h) {
                case "UP":
                    position -= n;
                    break;
                case "DOWN":
                    position += n;
                    break;
                case "LEFT":
                    position -= 1;
                    break;
                case "RIGHT":
                    position += 1;
                    break;
            }
        }
        
        // Return the final position
        return position;
    }
}