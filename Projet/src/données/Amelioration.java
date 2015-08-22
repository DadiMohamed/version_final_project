package données;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="AMELIORATION")
public class Amelioration {

	@Id
    @GeneratedValue
    @Column(name="ID_AMEL")
	private int idAmel;
	 
     @Column(name="COUT_AMELIORATION")
	private Float coutAmelioration;
	
     @OneToOne
     @JoinColumn(name="indicateur")
     private Indicateur indicateur;

	public int getIdAmel() {
		return idAmel;
	}

	public void setIdAmel(int idAmel) {
		this.idAmel = idAmel;
	}

	public Float getCoutAmelioration() {
		return coutAmelioration;
	}

	public void setCoutAmelioration(Float coutAmelioration) {
		this.coutAmelioration = coutAmelioration;
	}

	public Indicateur getIndicateur() {
		return indicateur;
	}

	public void setIndicateur(Indicateur indicateur) {
		this.indicateur = indicateur;
	}
	
	
	
	
	
}