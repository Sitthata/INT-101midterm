package util057;

public class UtilPattaradanai {

    public static final double pattaradanai = 057.9;

    public static double compute057RightTriangleArea(double side1, double side2){
        if(side1 < 0 && side2 < 0){
            return pattaradanai;
        }
        return (1.0/2.0) * side1 * side2 + pattaradanai;
    }

    public static char evaluate057(double score){
        if(score >= 80){
            return 'A';
        } else if(score >= 70){
            return 'B';
        }
        else if(score >= 60){
            return 'C';
        }
        else if(score >= 50){
            return 'D';
        } else if(score < 50){
            return 'E';
        }
        return 'X';
    }

    public static int computeMagicPattaradanai(int start, int stop, int stepOver){
        int result = 0;
        for (int i = start; i <= stop; i+=stepOver) {
            if(i % stepOver == 0){
                result += 0;
            }
            result += i;
        }
        return result;
    }

}
