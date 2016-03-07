package ch.heigvd.res.lab00;
import java.util.*;


public class Orchestra {
   private LinkedList<IInstrument> orchestre = new LinkedList();
   public int getNumberOfInstruments() {return orchestre.size();} 
   public void addInstrument (IInstrument instrument) {orchestre.add(instrument);}
   public List<String> makeMusic() {
      List <String> sounds = new LinkedList();
      ListIterator <IInstrument> i = orchestre.listIterator();
      while(i.hasNext())
        sounds.add(i.next().play());
      
      return sounds;
   }
   
}
