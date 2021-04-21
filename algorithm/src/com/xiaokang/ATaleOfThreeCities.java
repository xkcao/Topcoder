package com.xiaokang;

public class ATaleOfThreeCities {
    /*
0)
{0,0,0}
{0,1,2}
{2,3}
{1,1}
{1,5}
{3,28}
Returns: 3.414213562373095
The tunnel connecting the subway station in city A at (0,2) with the subway station in city C at (1,3) has a length of about 1.41 and the tunnel connecting the subway station in city A at (0,1) with the subway station in city B at (2,1) has a length of 2.
1)
{-2,-1,0,1,2}
{0,0,0,0,0}
{-2,-1,0,1,2}
{1,1,1,1,1}
{-2,-1,0,1,2}
{2,2,2,2,2}
Returns: 2.0
2)
{4,5,11,21,8,10,3,9,5,6}
{12,8,9,12,2,3,5,7,10,13}
{34,35,36,41,32,39,41,37,39,50}
{51,33,41,45,48,22,33,51,41,40}
{86,75,78,81,89,77,83,88,99,77}
{10,20,30,40,50,60,70,80,90,100}
Returns: 50.323397776611024
     */
    public  double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy){
        double minimumDistance = Double.MAX_VALUE;

        for(int i1=0;i1<ax.length;i1++){
            for(int j=0;j<bx.length;j++){
                int point1_x = ax[i1];
                int point1_y = ay[i1];
                int point2_x = bx[j];
                int point2_y = by[j];

                double distance1 = distanceBetween2Points(point1_x,point1_y,point2_x,point2_y);

                for(int i2=0;i2<ax.length;i2++){
                    for(int k=0;k< cx.length;k++){
                        int point3_x = ax[i2];
                        int point3_y = ay[i2];
                        int point4_x = cx[k];
                        int point4_y = cy[k];

                        double distance2 = distanceBetween2Points(point3_x,point3_y,point4_x,point4_y);

                        if(distance1 + distance2 < minimumDistance) minimumDistance = distance1 + distance2;
                    }
                }
            }
        }

        for(int i1=0;i1<bx.length;i1++){
            for(int j=0;j<ax.length;j++){
                int point1_x = bx[i1];
                int point1_y = by[i1];
                int point2_x = ax[j];
                int point2_y = ay[j];

                double distance1 = distanceBetween2Points(point1_x,point1_y,point2_x,point2_y);

                for(int i2=0;i2<bx.length;i2++){
                    for(int k=0;k< cx.length;k++){
                        int point3_x = bx[i2];
                        int point3_y = by[i2];
                        int point4_x = cx[k];
                        int point4_y = cy[k];

                        double distance2 = distanceBetween2Points(point3_x,point3_y,point4_x,point4_y);

                        if(distance1 + distance2 < minimumDistance) minimumDistance = distance1 + distance2;
                    }
                }
            }
        }

        for(int i1=0;i1<cx.length;i1++){
            for(int j=0;j<ax.length;j++){
                int point1_x = cx[i1];
                int point1_y = cy[i1];
                int point2_x = ax[j];
                int point2_y = ay[j];

                double distance1 = distanceBetween2Points(point1_x,point1_y,point2_x,point2_y);

                for(int i2=0;i2<cx.length;i2++){
                    for(int k=0;k< bx.length;k++){
                        int point3_x = cx[i2];
                        int point3_y = cy[i2];
                        int point4_x = bx[k];
                        int point4_y = by[k];

                        double distance2 = distanceBetween2Points(point3_x,point3_y,point4_x,point4_y);

                        if(distance1 + distance2 < minimumDistance) minimumDistance = distance1 + distance2;
                    }
                }
            }
        }

        return minimumDistance;
    }

    double distanceBetween2Points(int ax, int ay, int bx, int by){
        return Math.sqrt(Math.pow(ax-bx,2)+Math.pow(ay-by,2));
    }
}
