package données;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="indicateur")
public class Indicateur {
	
	@Id
    @GeneratedValue
    @Column(name="ID_Ind")
	private Integer idInd;
	
	@ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="id_sousInd")
	private Indicateur sousIndiacteur;
	
	@OneToMany(mappedBy="sousIndiacteur")
    private Set<Indicateur> subordinates1 = new HashSet<Indicateur>();
	
	
	@ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="id_inter")
	private Indicateur interIndiacateur;
	
	@OneToMany(mappedBy="interIndiacateur")
    private Set<Indicateur> subordinates2 = new HashSet<Indicateur>();
	
	

	@ManyToOne
    @JoinColumn(name="projet")
	private Project projetDb;
	
	
	

	@OneToOne(mappedBy="indicateur", cascade=CascadeType.ALL)
    private Amelioration amelioration;
	
	@ManyToOne 
	@JoinColumn(name="performance")
    private PerformanceGlobale performanceGlobale;
	
	
	@Column(name="LABEL")
	private String label;
	
	@Column(name="ABREV_LABEL")
	private String abrevLabel;
	@Column(name="DESC_TEXTUELLE")
	private String descTextuelle;
	
	@Column(name="UNITE_MESURE")
	private String uniteMesure;
	
	@Column(name="ABREV_UNITE")
	private String abrevUnite;
	
	@Column(name="MESURE_ACTUEL")
	private Float mesureActuel;
	@Column(name="PERF_NULLE")
	private Float perfNulle;
	@Column(name="PERF_TOTALE")
	private Float perfTotale;
	
	@Column(name="POIDS")
	private Float poids;
	@Column(name="CONTRIBUTION")
	private Float contribution;
	
	
	public Indicateur(Integer idInd, Indicateur sousIndiacteur,
			Set<Indicateur> subordinates1, Indicateur interIndiacateur,
			Set<Indicateur> subordinates2, Project projetDb,
			PerformanceGlobale performanceGlobale, Amelioration amelioration,
			String label, String abrevLabel, String descTextuelle,
			String uniteMesure, String abrevUnite, Float mesureActuel,
			Float perfNulle, Float perfTotale, Float poids, Float contribution) {
		super();
		this.idInd = idInd;
		this.sousIndiacteur = sousIndiacteur;
		this.subordinates1 = subordinates1;
		this.interIndiacateur = interIndiacateur;
		this.subordinates2 = subordinates2;
		this.projetDb = projetDb;
		this.performanceGlobale = performanceGlobale;
		this.amelioration = amelioration;
		this.label = label;
		this.abrevLabel = abrevLabel;
		this.descTextuelle = descTextuelle;
		this.uniteMesure = uniteMesure;
		this.abrevUnite = abrevUnite;
		this.mesureActuel = mesureActuel;
		this.perfNulle = perfNulle;
		this.perfTotale = perfTotale;
		this.poids = poids;
		this.contribution = contribution;
	}
	
	
	public Indicateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getIdInd() {
		return idInd;
	}
	public void setIdInd(Integer idInd) {
		this.idInd = idInd;
	}
	public Indicateur getSousIndiacteur() {
		return sousIndiacteur;
	}
	public void setSousIndiacteur(Indicateur sousIndiacteur) {
		this.sousIndiacteur = sousIndiacteur;
	}
	public Set<Indicateur> getSubordinates1() {
		return subordinates1;
	}
	public void setSubordinates1(Set<Indicateur> subordinates1) {
		this.subordinates1 = subordinates1;
	}
	public Indicateur getInterIndiacateur() {
		return interIndiacateur;
	}
	public void setInterIndiacateur(Indicateur interIndiacateur) {
		this.interIndiacateur = interIndiacateur;
	}
	public Set<Indicateur> getSubordinates2() {
		return subordinates2;
	}
	public void setSubordinates2(Set<Indicateur> subordinates2) {
		this.subordinates2 = subordinates2;
	}
	public Project getProjetDb() {
		return projetDb;
	}
	public void setProjetDb(Project projetDb) {
		this.projetDb = projetDb;
	}
	public PerformanceGlobale getPerformance() {
		return performanceGlobale;
	}
	public void setPerformance(PerformanceGlobale performanceGlobale) {
		this.performanceGlobale = performanceGlobale;
	}
	public Amelioration getAmelioration() {
		return amelioration;
	}
	public void setAmelioration(Amelioration amelioration) {
		this.amelioration = amelioration;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getAbrevLabel() {
		return abrevLabel;
	}
	public void setAbrevLabel(String abrevLabel) {
		this.abrevLabel = abrevLabel;
	}
	public String getDescTextuelle() {
		return descTextuelle;
	}
	public void setDescTextuelle(String descTextuelle) {
		this.descTextuelle = descTextuelle;
	}
	public String getUniteMesure() {
		return uniteMesure;
	}
	public void setUniteMesure(String uniteMesure) {
		this.uniteMesure = uniteMesure;
	}
	public String getAbrevUnite() {
		return abrevUnite;
	}
	public void setAbrevUnite(String abrevUnite) {
		this.abrevUnite = abrevUnite;
	}
	public Float getMesureActuel() {
		return mesureActuel;
	}
	public void setMesureActuel(Float mesureActuel) {
		this.mesureActuel = mesureActuel;
	}
	public Float getPerfNulle() {
		return perfNulle;
	}
	public void setPerfNulle(Float perfNulle) {
		this.perfNulle = perfNulle;
	}
	public Float getPerfTotale() {
		return perfTotale;
	}
	public void setPerfTotale(Float perfTotale) {
		this.perfTotale = perfTotale;
	}
	public Float getPoids() {
		return poids;
	}
	public void setPoids(Float poids) {
		this.poids = poids;
	}
	public Float getContribution() {
		return contribution;
	}
	public void setContribution(Float contribution) {
		this.contribution = contribution;
	}
}