package données;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="optimisation")
public class Optimisation {

	@Id
	@GeneratedValue
	@Column(name="ID_OPT")
	private int idOpt;
	
	@Column(name="COUT_OPTIMUM")
	private Float coutOptimum;
	
	@Column(name="PERF_FINALE_AGR")
	private Float perfFinaleAgr;
	
	@OneToOne
    @PrimaryKeyJoinColumn
    private Project projetdb;

	public int getIdOpt() {
		return idOpt;
	}

	public void setIdOpt(int idOpt) {
		this.idOpt = idOpt;
	}

	public Float getCoutOptimum() {
		return coutOptimum;
	}

	public void setCoutOptimum(Float coutOptimum) {
		this.coutOptimum = coutOptimum;
	}

	public Float getPerfFinaleAgr() {
		return perfFinaleAgr;
	}

	public void setPerfFinaleAgr(Float perfFinaleAgr) {
		this.perfFinaleAgr = perfFinaleAgr;
	}

	public Project getProjetdb() {
		return projetdb;
	}

	public void setProjetdb(Project projetdb) {
		this.projetdb = projetdb;
	}
	
	
	
	
}