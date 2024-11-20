public class garbageCollectionTest {
    public static void main(String[] args) {
        String[] houses = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};

        int totalTime = 0;
        totalTime += calculateTimeforAtype(houses, travel, 'G');
        System.out.println("totaltime " +totalTime);
        totalTime += calculateTimeforAtype(houses, travel, 'M');
        System.out.println(totalTime);
        totalTime += calculateTimeforAtype(houses, travel, 'P');
        System.out.println(totalTime);
        //System.out.println(garbageCollect());
    }

 /*   We assume that the
ith type of garbage last appears in the
jth house, then the driving time required for the
ith truck is travel[0]...to travel[i-1]
            . Note, if j=0
            , no driving time is needed.*/

    public static int calculateTimeforAtype(String[] houses, int[] travel, char garbageType) {
        int time=0;
        int lastHouseHasGarbage=0;


        for(int i =0;i<houses.length;i++){
            String house= houses[i];
            int len= house.length();

            //loop through each garbage in the house
            for(int j=0;j<len;j++){

                //Add collect time and save index of last garbage found house
                if(house.charAt(j)==garbageType){
                    time++;
                    lastHouseHasGarbage=i;
                }

            }
        }
        System.out.println("lastHouseHasGarbage"+lastHouseHasGarbage);

        //adding travel time from the first house to last that have garbage
            for(int k =0;k<lastHouseHasGarbage;k++){
                time+=travel[k];
            }



            return time;
    }

}
