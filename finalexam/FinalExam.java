/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author fordj
 */
public class FinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> myQueue = new Queue<String>();
       myQueue.add("Mango");
myQueue.add("Cherry");
myQueue.add("Raspberry");
myQueue.add("Lemon");
        try {
            System.out.println("removed: " + myQueue.remove());
        }
        catch (EmptyQueue e) {
            System.out.println("Can't remove from Queue -empty");}
    }
    
}
