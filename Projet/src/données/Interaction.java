package données;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="interaction")
public class Interaction  implements Serializable  {
	
	@Id
	@Column(name="id_ind")
	private Integer id_ind ;
	
	@Id
	@Column(name="second_ind")
	private Integer second_ind ;
	
	@Column(name="valeur")
	private Float valeur ;

	public Integer getId_ind() {
		return id_ind;
	}

	public void setId_ind(Integer id_ind) {
		this.id_ind = id_ind;
	}

	public Integer getSecond_ind() {
		return second_ind;
	}

	public void setSecond_ind(Integer second_ind) {
		this.second_ind = second_ind;
	}

	public Float getValeur() {
		return valeur;
	}

	public void setValeur(Float valeur) {
		this.valeur = valeur;
	}
	
	
	

}
