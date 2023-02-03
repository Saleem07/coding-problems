import java.util.Scanner;

// Angry Professor
// Discrete Mathematics professor has a class of n students.

// Frustrated with their lack of discipline, the professor decides to cancel class if fewer than k students are present when class starts. Arrival times go from on time (arrivalTime =<0) to arrived late (arrivalTime>0).

// Given the arrival time of each student and a threshold number of attendees (k), determine if the class is canceled or not.

// Input Format
// The first line has two space-separated integers, n and k, the number of students (size of array a), and the cancellation threshold.

// The second line contains n space-separated integers a[i] that describe the arrival times for each student.

// Output Format
// Print YES if the class is canceled and NO if the class is not canceled

// Example 1
// Input

// 4 3
// -1 -3 4 2
// Output

// YES
// Explanation

// k=3. The professor wants at least 3 students in attendance, but only 2 have arrived on time ( -3 and -1) so the class is cancelled.

// Example 2
// Input

// 5 3
// 0 0 0 0 -1
// Output

// NO
// Explanation

// All the students arrived on time, so the class is not cancelled.

public class Professor {

    public static void AngryProfessor(int[] arr, int n, int k) {
     
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] <= 0){
                count++;
            }
        }
        if(count >= k){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;

        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        AngryProfessor(arr, n, k);
    }
}
