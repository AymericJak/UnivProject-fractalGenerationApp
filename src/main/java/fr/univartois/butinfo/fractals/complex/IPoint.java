package fr.univartois.butinfo.fractals.complex;


public interface IPoint {
    /**
     * @return
     */
    double DistanceEntre2Points();
    
    /**
     * @return
     */
    Complex PointEnComplex();
    
    /**
     * @return
     */
    double getX();
    
    /**
     * @return
     */
    double getY();
}