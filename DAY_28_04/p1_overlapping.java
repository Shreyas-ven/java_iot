public class p1_overlapping{
    public static void main(String []args){
        int [][] intervals={{1,3},{2,5}};

        Check_overlapping(intervals);
    }

    public static boolean Check_overlapping(int [][] intervals){
        for (int i=1 ; i<intervals.length; i++){
            if((intervals[i][0] <= intervals[i-1][1]) && (intervals[i-1][0] <= intervals[i][1])){
                System.out.println("Overlapping  occurs! at \n" +intervals[i-1][0] + " " + intervals [i-1][1] + " " +intervals[i][0] + " " + intervals[i][1]);
                System.out.println("Merged Part : " + intervals[i-1][0] + " "+ intervals[i][1]);
                return true;
            }
        }
        System.out.println("No overlapping");
        return false;
    }
}