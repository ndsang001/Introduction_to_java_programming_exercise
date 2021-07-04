import java.util.Scanner;
public class Exercise_08_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] points = getPoint(input);
        print(points);
        findTheNearestPoints(points);
        input.close();
    }

    //obtain points from user
    public static double[][] getPoint(Scanner input){
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for(int i = 0; i < numberOfPoints; ++i){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        return points;
    }

    //print the points list
    public static void print(double[][] points){
        System.out.println("There are " + points.length + " points: ");
        for(int i = 0; i < points.length; ++i){
            System.out.printf("(%.1f,%.1f)\t", points[i][0], points[i][1]);
        }
        System.out.println();
    }

    //find the distance
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
    }
    
    //find the nearest points
    public static void findTheNearestPoints(double[][] points){
        //initialize p1 and p2 are the indices in the points's array
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], 
            points[p2][0], points[p2][1]);
        
        // compute distance for every two points
        for(int i = 0; i < points.length; ++i){
            for(int j = i + 1; j < points.length; ++j){
                double gap = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(shortestDistance > gap){
                    shortestDistance = gap;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        // display results 
        for(int i = 0; i < points.length; ++i){
            for(int j = i + 1; j < points.length; ++j){
                double gap = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(shortestDistance == gap){
                    System.out.println("The closest two points are " + 
                    "(" + points[i][0] + ", " + points[i][1] + ") and (" +
                    points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }

        //display result
        
        System.out.println("Their distance is " + shortestDistance);
    }
}


