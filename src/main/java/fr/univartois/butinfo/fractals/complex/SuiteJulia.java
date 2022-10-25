/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.util.function.BinaryOperator;

/**
 * Le type SuiteJulia
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class SuiteJulia implements ISuitesComplexesRecurrentes {

    /**
     * L'attribut c...
     */
    private IComplex c;

    /**
     * L'attribut j0...
     */
    private IComplex j0;

    /**
     * Crée une nouvelle instance de SuiteJulia.
     * 
     * @param j0
     * @param nbReel
     * @param nbImag
     */
    public SuiteJulia(IComplex j0, double nbReel, double nbImag) {
        this.j0 = j0;
        this.c = new Complex(nbReel, nbImag);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#
     * valeurProchainTerme(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex z) {
        return (z.multiply(z)).add(c);
    }

}
