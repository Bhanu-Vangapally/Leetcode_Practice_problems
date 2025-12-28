// Last updated: 12/28/2025, 4:52:35 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Step 1: Count student preferences (0 for circular, 1 for square)
        int[] counts = new int[2];
        for (int student : students) {
            counts[student]++;
        }

        // Step 2: Iterate through sandwiches in the stack order
        for (int sandwich : sandwiches) {
            // If no student left wants this sandwich type, 
            // the process stops because this sandwich blocks the rest.
            if (counts[sandwich] == 0) {
                // The remaining students who didn't eat is the sum of counts
                return counts[0] + counts[1];
            }
            // A student takes the sandwich and leaves
            counts[sandwich]--;
        }

        return 0; // All students were fed
    }
}
