

import edu.duke.*;
// * @author (Diana C. Colunga) 
 //* @version (2018)
public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }
    public int getNumPoints(Shape s){
        // The variable sum is used to count to be the amount of total points
        int sum = 0;
        // For each to check every point in the File and add+1 to sum
        for (Point numberOfPoints : s.getPoints()){
            sum ++;
        }
    return sum;
    
    }
    public double getAverageLength(Shape s){
        double totalPerim = 0;
        Point prevPt = s.getLastPoint();
        int sum = 0;
        for (Point numberOfPoints : s.getPoints()){
            sum ++;
        }
        for(Point number : s.getPoints()){
            double dist = prevPt.distance(number);
            totalPerim = totalPerim + dist;
            prevPt = number;
        }
        return totalPerim/sum;
    }
    public double getLargestSide(Shape s){
        double largestSide = 0.0;
        Point prevPt = s.getLastPoint();

        for (Point currPt : s.getPoints()) {
         
            double largSide = prevPt.distance(currPt);
            if(largSide > largestSide)
            {
                largestSide = largSide;
            }
        }
        return largestSide;
    }
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int size = getNumPoints(s);
        double average = getAverageLength(s);
        double largestSide = getLargestSide(s);
        System.out.println("perimeter = " + length);
        System.out.println("size = " + size);
        System.out.println("avegare of the lengths = " + average);
        System.out.println("the largest side = " + largestSide);
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
        
    }
}
