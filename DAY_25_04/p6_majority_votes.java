import java.util.*;

public class p6_majority_votes {
    public static void main(String[] args) {

        String[] area1 = {"B","C","B","B","B"};
        String[] area2 = {"B","J","C","C","B"};
        String[] area3 = {"C","B","B","B"};

        List<String> totalArea = new ArrayList<>();

        Collections.addAll(totalArea, area1);
        Collections.addAll(totalArea, area2);
        Collections.addAll(totalArea, area3);

        int bjp_count = 0, jds_count = 0, congress_count = 0;

        for (int i = 0; i < totalArea.size(); i++) {
            if (totalArea.get(i).equals("B")) {
                bjp_count++;
            } 
            else if (totalArea.get(i).equals("C")) {
                congress_count++;
            } 
            else if (totalArea.get(i).equals("J")) {
                jds_count++;
            } 
            else {
                System.out.println("Invalid Votes");
            }
        }

        
        System.out.println("BJP Votes: " + bjp_count);
        System.out.println("Congress Votes: " + congress_count);
        System.out.println("JDS Votes: " + jds_count);

        if (bjp_count>congress_count){
            System.out.println("Winner Party : BJP" );
        }
        else if (bjp_count<congress_count){
            System.out.println("Winner Party : Congress");
        }
        else{
            System.out.println("JDS is winner");
        }
        
    }
}