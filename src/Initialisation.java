import java.awt.List;
import java.util.Vector;

public class Initialisation {
	public Initialisation()
	{super();}
	public Population initialiser(Requestmultiple req)
	{Population p=new Population(6);
	Vector v=new Vector();
	 v=req.getMult();
	
	 
	 for(int i=0;i<6;i++)
		 
	 {   Gene []propmax=new Gene[3];
		 Gene []propmin=new Gene[3];
		 
		 propmax[0]=new Gene("p1",( (int[]) (v.get(0) ) )[ (int)Math.random()*  ((int[])v.get(0)).length ]  );
		 propmax[1]=new Gene("p2",( (int[]) (v.get(1) ) )[ (int)Math.random()*  ((int[])v.get(1)).length ]  );
		 propmax[2]=new Gene("p3",( (int[]) (v.get(2) ) )[ (int)Math.random()*  ((int[])v.get(2)).length ]  );
		 propmin[0]=new Gene("p4",( (int[]) (v.get(3) ) )[ (int)Math.random()*  ((int[])v.get(3)).length ]  );
		 propmin[1]=new Gene("p5",( (int[]) (v.get(4) ) )[ (int)Math.random()*  ((int[])v.get(4)).length ]  );
		 propmin[2]=new Gene("p6",( (int[]) (v.get(5) ) )[ (int)Math.random()*  ((int[])v.get(5)).length ]  );
		 
		 p.getPop()[i]=new Individu(propmax,propmin);
		 
		 
		 
		
	 
	
	 }
	
	return p;
	}
	

}
