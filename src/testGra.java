public class testGra {


    public static void main(String[ ] args){


        String[] houses = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};
        int totalTime=0;
        totalTime+=totaltimeforgrabageType(houses,travel,'G');
        System.out.println(totalTime);



    }

    public static int totaltimeforgrabageType(String[] houses,int[] travel ,char type){

        int time=0;
        int lastHouseHasGarbage=0;

        for(int i=0;i<houses.length;i++) {

            String house = houses[i];
            int len = house.length();
            for (int k = 0; k < len; k++) {
                if (house.charAt(k) == type) {
                    time++;
                    lastHouseHasGarbage = i;
                }
            }
        }

            for(int j=0;j<lastHouseHasGarbage;j++) {

                time+=travel[j];
            }



        return time;

    }
}
