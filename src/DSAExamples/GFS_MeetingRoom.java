package DSAExamples;
/*

    Non Runnable

    Comparator based code<comparator>

    N meeting in one room

    There is one meeting room in a firm. There are N meeting
    in the form of (start[i], end[i]) where start[i] is the
    start time of meeting i and end[i] is the end time of meeting time
    of i.
    What is the maximum number of meeting that can be accomodated in the meeting room when only one meeting
    can be held in the meeting room at a perticular time?

    Note: Start time of the one chosen meeting cant be equal to
     the end time of the other chosen meeting.

     Input:

     n=6
     Start[] = {1,3,0,5,8,5}
     end[] = {2,4,6,7,9,9}

 */
import java.util.*;
import java.lang.*;


class meetpair{
    int start;
    int end;
    meetpair(int start, int end){
        this.start = start;
        this.end = end;

    }
}
public class GFS_MeetingRoom {

    public static void main(String[] args) {



        class comp implements Comparator<meetpair> {
            public int compare(meetpair o1, meetpair o2) {

                if (o1.end > o2.end)
                    return 1;
                else if (o1.end < o2.end)
                    return -1;
                else if (o1.start == o2.start)
                    return 1;
                return 0;

            }


            public int maxMeetings() {

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int start[] = new int[n];
                for (int i = 0; i < n; i++) {
                    start[i] = sc.nextInt();
                }
                  int end[] = new int[n];
                for (int i = 0; i < n; i++) {
                    end[i] = sc.nextInt();
                }


                ArrayList<meetpair> arr = new ArrayList<>();
                comp c = new comp();
                Collections.sort(arr, c);
                int ans = 1;
                int prev = arr.get(0).end;
                for (int i = 0; i < n; i++) {
                    if (arr.get(i).start > prev) {
                        ans++;
                        prev = arr.get(i).end;
                    }
                }
                return ans;
            }
        }
    }
}