package patterns.structural_patterns.dao;

public interface Calculation {

    double i = 5; // final
    double  add(double x, double y);
    double  sum(double x, double y);

    static double mul(double x, double y){
        return x * y;
    };
    default double div(double x, double y){
        return (y!=0) ? x/y : 0;
    };

}
