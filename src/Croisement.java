import java.util.Vector;

public class Croisement {
	public Croisement()
	{
		
	}
	
	public Individu croise1(Individu pere,Individu mere)
	{
		Gene[] propmax=new Gene[pere.getPropmax().length];
		Gene[]propmin=new Gene[pere.getPropmin().length];
		
		int i=0;
		
		
		while(i<pere.getPropmax().length)
		{
			
			propmax[i]=  (pere.getPropmax())[i];
			propmax[i+1]=  (mere.getPropmax())[i+1];
			
			propmin[i]=  (pere.getPropmin())[i];
			propmin[i+1]=  (mere.getPropmin())[i+1];
			
			
		   
		    i=i+2;
		}
		
		Individu enfant=new Individu(propmax,propmin);
		return enfant;
	}
	
	
		
	
		
		
		public Individu croise2(Individu pere,Individu mere)
		{
			Gene[] propmax=new Gene[pere.getPropmax().length];
			Gene[]propmin=new Gene[pere.getPropmin().length];
			
			int i=0;
			
			
			while(i< pere.getPropmax().length)
			{
				
				propmax[i]=  (mere.getPropmax())[i];
				propmax[i+1]=  (pere.getPropmax())[i+1];
				
				propmin[i]=  (mere.getPropmin())[i];
				propmin[i+1]=  (pere.getPropmin())[i+1];
				
				
			   
			    i=i+2;
			}
			Individu enfant=new Individu(propmax,propmin);
			return enfant;
		}
		
		
		
	
		
		
	}


