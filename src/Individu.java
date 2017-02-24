
import java.util.Vector;
/*cette classe presente la requéte de recherche qui donne l'utilisateur qui est caracterisé par des 
 * propriétés positifs et negatifs*/
public class Individu {
	private Gene []propmax;/*le properietes positifs*/
	private Gene []propmin;/*le properietes negatifs*/
	
	public Individu()
	{}
	
	public Individu(Gene []propmax,Gene []propmin)
	{
		this.propmax=propmax;
	    this.propmin=propmin;
	}
	public Gene [] getPropmax()
	{
		return propmax;
	}
	public Gene[] getPropmin()
	{
		return propmin;
	}
	public void   setPropmax(Gene[] propmax)
	{
		this.propmax= propmax;
	}
	public void   setPropmin(Gene[] propmin)
	{
		this.propmin= propmin;
	}
	

}
