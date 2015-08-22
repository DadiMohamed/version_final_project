package données;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="performance_globale")
public class PerformanceGlobale {
	
	@Id
    @GeneratedValue
    @Column(name="id_perf")
	public Integer idPerf;
	
	@Column(name="PERF_ELEM")
	private Float perfElem;
	
	@Column(name="PERF_AGR")
	private Float perfAgr;
	
	@Column(name="PERF_GLOBAL")
	private Float perfGlobal;
	
	
	@OneToMany(mappedBy = "performanceGlobale", cascade=CascadeType.ALL)
    private Set<Indicateur> indicateurs;

	
	public Integer getIdPerf() {
		return idPerf;
	}


	public void setIdPerf(Integer idPerf) {
		this.idPerf = idPerf;
	}


	public Float getPerfElem() {
		return perfElem;
	}


	public void setPerfElem(Float perfElem) {
		this.perfElem = perfElem;
	}


	public Float getPerfAgr() {
		return perfAgr;
	}


	public void setPerfAgr(Float perfAgr) {
		this.perfAgr = perfAgr;
	}


	public Float getPerfGlobal() {
		return perfGlobal;
	}


	public void setPerfGlobal(Float perfGlobal) {
		this.perfGlobal = perfGlobal;
	}


	public Set<Indicateur> getIndicateurs() {
		return indicateurs;
	}


	public void setIndicateurs(Set<Indicateur> indicateurs) {
		this.indicateurs = indicateurs;
	}
	

}