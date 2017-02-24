import java.util.Scanner;
import java.util.Vector;

public class AlgorithmGenetic {
	private Population p;
	private Initialisation init;
	private Selection select;
	private Croisement crois;
	private Remplacement remp;
	private FonctionObjectif fitness;
	
	//public AlgorithmGenetic()
	//{
	///	super();
	//}
	public AlgorithmGenetic()
	{      
		  Population p=new Population();
		  Initialisation init=new Initialisation();
		  Selection select=new Selection();
		  Croisement crois=new Croisement();
		  Remplacement remp=new Remplacement();
		  FonctionObjectif fitness=new FonctionObjectif();
		  this.p=p;
	     this.init=init;
	     this.select=select;
	     this.crois=crois;
	     this.remp=remp;
	     this.fitness=fitness;
	}
	 public Population executer(Requestmultiple req,int[]poidspos,int[]poidsneg)
	 
	 {  
		 
		
		 p= init.initialiser(req);
		 Population p2=new Population(p.getTaille());
	    
	     Individu[]tab=new Individu[p.getTaille()];
	     
	    
	    double s1=30;
	    double s2=0;
	  
	    
	    while(s1-s2>0)
	    {
	    	tab=select.selectionner(p,poidspos,poidsneg);
	    	int k=p.getTaille();
	    	
	    	int j=tab.length;
	    	
	    	while(j<p.getTaille())
	    	{   
	    		int x=(int)Math.random()*tab.length;
	    		int y=(int)Math.random()*tab.length;
	    		if(x!=y)
	    		{
	    		tab[j]=crois.croise1(tab[x],tab[y]);
	    		if(j+1!=p.getTaille())
	    		tab[j+1]=crois.croise2(tab[x],tab[y]);
	    		
	    		j=j+2;
	    	     }
	    		
	    		}
	    	
	    	
	    	
	    	p2.setPop(tab);
	    	s1=0;
	    	
	    	for(int l=0;l<p.getTaille();l++)
	    	{
	    		s1=s1+ fitness.score(p.getPop()[l],poidspos,poidsneg);
	    		s2=s2+ fitness.score(p2.getPop()[l],poidspos,poidsneg);
	    	}
	    	remp.remplacer(p, p2);
	    	
	    	
	    }
	    return p;
	 }
	 public static void main(String []args)
	 {   Vector<int[]> re=new Vector();
	 int []poidspos=new int[3];
	 int []poidsneg=new int[3];
	
	 
	 Requestmultiple req=new Requestmultiple();
	
	 
	 Population res=new Population();
		 AlgorithmGenetic e=new AlgorithmGenetic();
		 
		 Scanner clavier = new Scanner(System.in);
		 
		 
		 System.out.println("   Entrer les valeurs des properietes  " );
		 
		 
		 for(int i=0;i<6;i++)
			 
		 {  int []p1=new int[5];
			 for(int j=0;j<5;j++)
			 {System.out.print("  Entrer la valeur numero  "+(j+1)+" de propriéte   "  +i+ " = "   );
		     p1[j]=clavier.nextInt();
			 }
		  re.add(p1);
		 }
		 req.setMult(re);
		 
		 System.out.println("   Entrer les valeurs des poids positifs  " );
		 
		 
		 for(int i=0;i<3;i++)
		 {
			 System.out.print("  Entrer le poids positif de la propriéte numéro  " +(i+1)+ " = "  );
		    poidspos [i]=clavier.nextInt();
		 }
		 
		 
		 System.out.println("   Entrer les valeurs des poids negatif   " );
		 
		 for(int i=0;i<3;i++)
		 {
			 System.out.print("  Entrer le poids negatif de propriete numéro  "  +(i+3)+ " = "   );
		     poidsneg[i]=clavier.nextInt();
		 }
		 
		 
		res=e.executer(req,poidspos,poidsneg);
		
		
		 System.out.println("l'ensemble finale de solution est la suivant ");
		 for(int i=0;i<res.getPop().length;i++)
			 
		 {   System.out.println("  ");
		     System.out.println("  ");
		     System.out.println("  ");
		  
		     System.out.println("  ");
			 System.out.println("  l' individu numero  "+(i+1)+" ayant les properiestes suivantes  ");
			 System.out.println("  ");
			 System.out.println("  ");
			 System.out.println("  ");
		 
			 for(int j=0;j<((res.getPop()[i]).getPropmax()).length;j++)
		 
		      {
				 System.out.print("la valeur de popriéte  numero  " +(j+1) + " = ");
			     System.out.print(res.getPop()[i].getPropmax()[j].getValue());
			     System.out.print("//");
		      }
			 
		      for(int j=0;j<((res.getPop()[i]).getPropmin()).length;j++)
	         {
		    	  System.out.print(" la valeur de propriéte  numero " +(j+3) +" = ");
		          System.out.print(res.getPop()[i].getPropmin()[j].getValue());
		          System.out.print("//");
	         }
		 
	   }
	 

	 }
}
