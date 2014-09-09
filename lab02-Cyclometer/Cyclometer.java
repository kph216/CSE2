////////////////////////////////////////////////////////////////////
//Kyle Hughes
//9/3/14
//lab02

//define class
public class Cyclometer{
    
        //add main method 
        public static void main(String[] arge) {
            //our input data
            int secsTrip1=480; // number of seconds for trip 1
            int secsTrip2=3220; //number of seconds for trip 2
            int countsTrip1=1561; //number of counts for trip 1
            int countsTrip2=9037; //number of counts for trip 2
            //our immediate variables and output data
            double wheelDiameter=27.0, //
            PI=3.14159, // value of pie
            feetPerMile=5280, // conversion for feet per mile
            inchesPerFoot=12, //conversion for inches per foot
            secondsPerMinute=60; //conversion for seconds per minute
            double distanceTrip1, distanceTrip2,totalDistance; //total distance of trip 1 and 2
            //print out variables
            System.out.println("Trip 1 took " +(secsTrip1/secondsPerMinute)+ "minutes and had "+countsTrip1+" counts.");
            System.out.println("Trip 2 took " +(secsTrip2/secondsPerMinute)+ "minutes and had "+countsTrip2+" counts.");
            // compute the values for the distances
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            //Above gives distance in inches
            //(for each count, a rotation of the wheel travels the diameter in inchies times PI)
            distanceTrip1=inchesPerFoot*feetPerMile; //gives distance in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2;
            //print out the output data.
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("the totalDistance was "+totalDistance+" miles");
        } //end of main method
} //end of class