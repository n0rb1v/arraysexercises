package standarddev;

public class Deviation {

    public double standardDeviation(double[] input){
        double n= input.length;
        double sum=0;
        double mean;
        for(int i=0;i<n;i++) {
            sum+=input[i];

        }
        mean=sum/n;
        sum=0;
        for(int i=0;i<n;i++) {
            sum+=Math.pow((input[i]-mean),2);

        }
        mean=sum/(n-1);
        double deviation=Math.sqrt(mean);
       return deviation;

    }
}
