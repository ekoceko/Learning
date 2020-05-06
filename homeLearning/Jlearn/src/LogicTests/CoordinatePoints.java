package LogicTests;


public class CoordinatePoints {

    public static class Points{

        private int x ;
        private int y ;

        public Points(int x, int y){
            this.x = x;
            this.y = y;

        }
        public String toString(){

            return "X: "+this.x+", Y: "+this.y;
        }
    }

    public static void main(String[] args) {


        Points[] tuples = new Points[5];
        tuples[0] = new Points(1,0);
        tuples[1] = new Points(2,4);
        tuples[2] = new Points(3,3);
        tuples[3] = new Points(6,2);
        tuples[4] = new Points(5,1);

        Points k = new Points(3,0);
        System.out.println("DISTANCE TO K "+distanceToK(tuples[0],k));

        Points maxPoint = null;
        double maxDistance = 0;
        for (Points point : tuples){
            double dTO = distanceToOrigin(point);
            if (dTO>maxDistance){
                maxDistance = dTO;
                maxPoint = point;
                System.out.println("max point = "+maxPoint+" and max distance = "+maxDistance);
            }
        }


    }
    private static double distanceToOrigin(Points point){
        System.out.println("Calculating distance for "+point.x+" & "+point.y);
        return Math.sqrt(Math.pow(point.x,2)+Math.pow(point.y,2));

    }
    private static double distanceToK(Points point,Points k){
        System.out.println("Calculating distance between "+point.x+" & "+point.y+" AND " +k.x+" & "+k.y);
        return Math.sqrt(Math.pow(k.x-point.x,2)+Math.pow(k.y-point.y,2));

    }

}