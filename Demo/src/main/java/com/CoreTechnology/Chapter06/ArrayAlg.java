package com.CoreTechnology.Chapter06;

/**
 * @ClassName ArrayAlg
 * @Auther trappedBeast
 * @Date 2018/11/29 17:03
 * @Version 1.0
 * @Description TODO
 **/
public class ArrayAlg {
     public static class Pari {
        private double max;
        private double min;

        public Pari(double min,double max) {
            this.max = max;
            this.min = min;
        }

        public double getMax() {
            return max;
        }

        public void setMax(double max) {
            this.max = max;
        }

        public double getMin() {
            return min;
        }

        public void setMin(double min) {
            this.min = min;
        }
    }

    public static Pari minMax(double[] args) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double arg : args) {
            if (min > arg) min = arg;
            if (max < arg) max = arg;

        }
        return new Pari(min,max);
    }
}
    