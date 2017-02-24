
/*classe Géne presente*/
public class Gene {
private String nom;/*nom de la propriéte*/
private int value;/*valeur de type double qui va remplacer la valeur initiale quelque soit son type*/
 public Gene()
 { 
	 super();
	 
 }
 public Gene(String nom,int value)
 {
	 this.nom=nom;
    
    this.value=value;
  }
 
 public String getNom()
 {
	 return nom;
 }
 
 public void setNom(String nom)
 {
	 this.nom=nom;
 }

 public int getValue()
 {
	 return value;
 }
 
 public void setValue(int value)
 {
	 this.value=value;
 }
}
