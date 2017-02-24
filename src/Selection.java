import java.util.Vector;

public class Selection {
	
 public Selection()
 {
	 super();
 }
 
 public Individu[] selectionner(Population p,int[]poidspos,int[]poidsneg)
 {   FonctionObjectif f=new FonctionObjectif();
     
	 for(int i=0;i<p.getPop().length-1;i++)
		 
	 {   int min=i;
		 for(int j=i+1;j<p.getPop().length;j++)
	 
	      {if(   (f.score  ( p.getPop()[j],poidspos,poidsneg) )  <   (f.score (  p.getPop()[min],poidspos,poidsneg) ) ) 
	    	  
	        { min=j;}
	      }
		 if (min !=i)
	        {
		      Individu ind=new Individu();
		      ind=p.getPop()[min];
		      p.getPop()[min]=p.getPop()[i];
		      p.getPop()[i]=ind;
	       }
		 
		 
	 }
	 Individu[]tab=new Individu[(p.getPop().length)/2];
	 
	 for(int i=0;i<tab.length;i++)
	 {
		 tab[i]=(p.getPop()[i]);
	 }
	 
	 return tab;
	 
 }

}
