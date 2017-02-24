import java.util.Vector;
/* classe qui permet la calcule de score d'un individu donné qui est pour le moment une requéte 
 * de recherche utilisateur avec ses poids sur les attributs*/
public class FonctionObjectif  {
	
	
	public FonctionObjectif()
	{super();}
	
	
	
	public double score(Individu a,int []poidspos,int []poidsneg)
	{ int s=0;
	  for (int i=0;i<poidspos.length;i++)
	  {s=s+poidspos[i];}
	  for (int i=0;i<poidsneg.length;i++)
	  {s=s+poidsneg[i];}
	  
		Gene[] v1=a.getPropmax();
		Gene[]v2=a.getPropmin();
		int s1=0;
		int s2=0;
		for(int i=0;i<v1.length;i++)
		{
			s1=s1+(v1[i].getValue()) * poidspos[i]/s;
		}
		for(int i=0;i<a.getPropmin().length;i++)
		{
			s2=s2+(v2[i].getValue()) * poidsneg[i]/s;
		}
		return (s1-s2);
	}
}


