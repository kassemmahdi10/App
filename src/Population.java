import java.util.Vector;

public class Population {
   private int taille;
   private Individu[]pop;
   
   public Population()
   {
	   super();
   }
   public Population(int taille)
   {
	  
	   this.pop=new Individu[taille];
   }
   public Individu[] getPop()
   {return pop;}
   public void setPop(Individu[] pop)
   {this.pop=pop;}
   public int getTaille()
   {return taille;
   }
   public void setPop(int taille)
   {this.taille=taille;}
}
