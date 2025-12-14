// Last updated: 12/14/2025, 11:52:47 PM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        // Step 1: Count student preferences (0 for circular, 1 for square)
4        int[] counts = new int[2];
5        for (int student : students) {
6            counts[student]++;
7        }
8
9        // Step 2: Iterate through sandwiches in the stack order
10        for (int sandwich : sandwiches) {
11            // If no student left wants this sandwich type, 
12            // the process stops because this sandwich blocks the rest.
13            if (counts[sandwich] == 0) {
14                // The remaining students who didn't eat is the sum of counts
15                return counts[0] + counts[1];
16            }
17            // A student takes the sandwich and leaves
18            counts[sandwich]--;
19        }
20
21        return 0; // All students were fed
22    }
23}
24