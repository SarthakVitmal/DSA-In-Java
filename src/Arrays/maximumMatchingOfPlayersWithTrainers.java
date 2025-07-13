package Arrays;

import java.util.Arrays;

public class maximumMatchingOfPlayersWithTrainers {
    public static void main(String[] args) {
        int[] players = {1,2,3,4,5};
        int[] trainers = {2,3,4,5,1};
        int ans = matchPlayersAndTrainers(players,trainers);
        System.out.println(ans);
    }

    private static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        //Brute Force
        // boolean[] isTrainerVacant = new boolean[trainers.length];
        // Arrays.fill(isTrainerVacant,false);
        // int count = 0;
        // for (int i = 0; i < players.length; i++) {
        //     int minValue = Integer.MAX_VALUE;
        //     int minIdx = -1;
        //     for (int j = 0; j < trainers.length; j++) {
        //         if(players[i] <= trainers[j]) {
        //             if (!isTrainerVacant[j]) {
        //                 if(minValue > trainers[j]){
        //                     minValue = trainers[j];
        //                     minIdx = j;
        //                 }
        //             }
        //         }
        //     }
        //     if(minIdx != -1){
        //         count++;
        //         isTrainerVacant[minIdx] = true;
        //     }
        // }
        // return count;

        //Optimized Code
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0, count = 0;
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
