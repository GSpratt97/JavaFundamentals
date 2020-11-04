public class Explore {
 
    public static void main(String[] args) {
      String[] friends = {"Ben", "Alena", "Pasan"};
      
      int[][] scoreCards = {
        // Ben's
        {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
        // Alena's
        {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
        // Pasan's
        {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
      };
      
      // for each friend
      for (int i = 0; i < friends.length; i++) {
        // print their name
        System.out.printf("%s %n---------------------------%n",
                          friends[i]);
        // for each hole
        for (int j = 0; j < scoreCards[i].length; j++) {
          // print their score
          System.out.printf("Hole #%d: %d %n",
                            j + 1,
                            scoreCards[i][j]);
        }
      }
    }
    
  }