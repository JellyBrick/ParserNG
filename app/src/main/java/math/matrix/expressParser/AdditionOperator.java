/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package math.matrix.expressParser;

import expressParser.*;
import java.util.ArrayList;

/**
 *
 * @author GBEMIRO
 */
public final class AdditionOperator extends BinaryOperator{

//Č

/**
 * Creates an object of class
 * AdditionOperator
 *
 * @param index the index of this object in its
 * parent Function object's scanner.
 * @param function the Function object in which this
 * AdditionOperator exists.
 *
 */
    public AdditionOperator( int index,ArrayList<String>scan){
        super("+", index, scan);
    }//end constructor


   

}//end class AdditionOperator
