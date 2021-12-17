package genericboxdemov2;

/**
 * Exception to be raised if Pair is full
 * @author Stephen T. Brower
 */
public class PairFullException extends Exception {
    /**
    *  No-arg constructor
    */
   public PairFullException()
   {
      super("Error: Pair is full...cannot add an item.");
   }
    
}
