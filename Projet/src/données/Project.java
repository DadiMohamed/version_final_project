// default package
// Generated 1 juil. 2015 14:32:56 by Hibernate Tools 3.4.0.CR1
package données;
import java.util.Date;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 
 @Entity
@Table(name="PROJECT")
public class Project implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name="ID_PROJET")
	private int idProjet;
	
    @OneToOne(mappedBy="projetdb", cascade=CascadeType.ALL)
	private Optimisation optimisation;
	
	 @Column(name="DATE_DEBUT")
	private Date dateDebut;
	
	 @Column(name="DATE_FIN")
	private Date dateFin;
	
	 @Column(name="OBJECTIF_GLOBAL")
	private String objectifGlobal;
	
	 @Column(name="VALEURE")
	private Float valeure;
	
	 @Column(name="UNITE")
	private String unite;
	
	@Column(name="NBR_INDICATEUR")
	private Integer nbrIndicateur;
	
	 @Column(name="BUDJET")
	private Float budjet;
	
	 @Column(name="NOM")
	private String nom;
	
	@OneToMany(mappedBy="projetDb", cascade=CascadeType.ALL)
    private Set< Indicateur> indicateurs;
	
	
	

	public Project() {
	}

	public Project(int idProjet) {
		this.idProjet = idProjet;
	}

	public Project(int idProjet, Optimisation optimisation, Date dateDebut,
			Date dateFin, String objectifGlobal, Float valeure, String unite,
			Integer nbrIndicateur, Float budjet, String nom, Set<Indicateur> indicateurs) {
		this.idProjet = idProjet;
		this.optimisation = optimisation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.objectifGlobal = objectifGlobal;
		this.valeure = valeure;
		this.unite = unite;
		this.nbrIndicateur = nbrIndicateur;
		this.budjet = budjet;
		this.nom = nom;
		this.indicateurs = indicateurs;
	}

	public int getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}

	public Optimisation getOptimisation() {
		return this.optimisation;
	}

	public void setOptimisation(Optimisation optimisation) {
		this.optimisation = optimisation;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getObjectifGlobal() {
		return this.objectifGlobal;
	}

	public void setObjectifGlobal(String objectifGlobal) {
		this.objectifGlobal = objectifGlobal;
	}

	public Float getValeure() {
		return this.valeure;
	}

	public void setValeure(Float valeure) {
		this.valeure = valeure;
	}

	public String getUnite() {
		return this.unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public Integer getNbrIndicateur() {
		return this.nbrIndicateur;
	}

	public void setNbrIndicateur(Integer nbrIndicateur) {
		this.nbrIndicateur = nbrIndicateur;
	}

	public Float getBudjet() {
		return this.budjet;
	}

	public void setBudjet(Float budjet) {
		this.budjet = budjet;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Indicateur> getIndicateurs() {
		return indicateurs;
	}

	public void setIndicateurs(Set<Indicateur> indicateurs) {
		this.indicateurs = indicateurs;
	}

	
}