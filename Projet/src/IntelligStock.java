import java.awt.EventQueue;





















import javax.swing.JFrame;
import javax.swing.JMenuBar;

import java.awt.Label;
import java.awt.Button;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.TextField;

import javax.swing.JTextArea;
import javax.swing.JComboBox;

import metier.Agrégation;
import metier.HibernateUtil;
import metier.Interpolation;
import metier.OptimisationPerFix;
import metier.VerificationDonnees;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;
import com.toedter.calendar.JDateChooser;

import données.Amelioration;
import données.Indicateur;
import données.Interaction;
import données.PerformanceGlobale;
import données.Project;
import données.Project;

import javax.swing.JTabbedPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;





import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.Panel;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class IntelligStock {

	private static JFrame framePricipale;
	private JTextField textField_nom_etude;
	private JTextField textField_objectif_globale;
	private JTextField textField_valeur;
	private JTextField textField_unite;
	private JTextField textField_nbr_indicateur;
	private JTextField textField_label_indica;
	private JTextField textField_abreviation_label_indica;
	private JTextField textField_description_text;
	private JTextField textField_mesure_actuelle;
	private JTextField textField_unite_mesure;
	private JTextField textField_abrevia_unite_mesure;
	private JTextField textField_performance_nulle;
	private JTextField textField_perf_totale;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_interp;
	private JTable table;
	private JTextField textField_42;
	private JTextField textField_43;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntelligStock window = new IntelligStock();
					window.framePricipale.setVisible(true);
					window.framePricipale.setSize(320, 320);
				
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntelligStock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePricipale = new JFrame();
		framePricipale.setTitle("IntelligStock");
		framePricipale.getContentPane().setBackground(Color.CYAN);
		framePricipale.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		final VerificationDonnees verifobj=new VerificationDonnees();
		framePricipale.getContentPane().setLayout(null);
		
		final List<JTextField> fieldParam = new ArrayList<JTextField>() ;
		final List<JTextField> fieldPoid = new ArrayList<JTextField>() ;
		final List<JTextField> fieldind_cout = new ArrayList<JTextField>() ;
		final List<JTextField> field_cout = new ArrayList<JTextField>() ;
		final List<JTextField> field_ind_opt1 = new ArrayList<JTextField>() ;
		final List<JTextField> field_per_opt1 = new ArrayList<JTextField>() ;
		final List<JTextField> field_mp_opt1 = new ArrayList<JTextField>() ;
		final List<JTextField> field_unit_opt1 = new ArrayList<JTextField>() ;
		
		final List<JTextField> field_lignes = new ArrayList<JTextField>() ;
		
		final List<JTextField> fieldsIndica = new ArrayList<JTextField>() ;
		
		final List lInter=new ArrayList() ;
		
		//JToolBar toolBar = new JToolBar();
		//toolBar.setBounds(0, 0, 1061, 33);
		//framePricipale.getContentPane().add(toolBar);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\tab_new_raised.png"));
		//toolBar.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\disc_icon.jpg"));
		//toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\help.png"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1400,665);
		framePricipale.getContentPane().add(tabbedPane);
		
		final JPanel panel = new JPanel();
		tabbedPane.addTab("Information globales du projet", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNomDeLtude = new JLabel("Nom de l'\u00E9tude");
		lblNomDeLtude.setBounds(21, 40, 85, 14);
		panel.add(lblNomDeLtude);
		
		textField_nom_etude = new JTextField();
		textField_nom_etude.setBounds(116, 37, 139, 20);
		panel.add(textField_nom_etude);
		textField_nom_etude.setColumns(10);
		
		final JDateChooser dateChooser_debut_projet = new JDateChooser();
		dateChooser_debut_projet.setBounds(116, 108, 139, 20);
		dateChooser_debut_projet.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(dateChooser_debut_projet);
		
		final JDateChooser dateChooser_fin_projet = new JDateChooser();
		dateChooser_fin_projet.setBounds(342, 108, 139, 20);
		panel.add(dateChooser_fin_projet);
		
		JLabel lblDbut = new JLabel("D\u00E9but Etude");
		lblDbut.setBounds(21, 108, 85, 14);
		panel.add(lblDbut);
		
		JLabel lblFinEtude = new JLabel("Fin Etude");
		lblFinEtude.setBounds(274, 108, 74, 14);
		panel.add(lblFinEtude);
		
		JLabel lblObjectifGloble = new JLabel("Objectif Global");
		lblObjectifGloble.setBounds(21, 168, 97, 14);
		panel.add(lblObjectifGloble);
		
		textField_objectif_globale = new JTextField();
		textField_objectif_globale.setBounds(116, 165, 247, 20);
		panel.add(textField_objectif_globale);
		textField_objectif_globale.setColumns(10);
		
		JLabel lblValeur = new JLabel("Valeur");
		lblValeur.setBounds(43, 225, 46, 14);
		panel.add(lblValeur);
		
		textField_valeur = new JTextField();
		textField_valeur.setBounds(117, 222, 86, 20);
		panel.add(textField_valeur);
		textField_valeur.setColumns(10);
		
		JLabel lblUnit = new JLabel("Unit\u00E9");
		lblUnit.setBounds(262, 228, 46, 14);
		panel.add(lblUnit);
		
		textField_unite = new JTextField();
		textField_unite.setBounds(307, 222, 86, 20);
		panel.add(textField_unite);
		textField_unite.setColumns(10);
		
		JLabel lblNombreDindicateurs = new JLabel("Nombre d'indicateurs");
		lblNombreDindicateurs.setBounds(21, 280, 141, 14);
		panel.add(lblNombreDindicateurs);
		
		textField_nbr_indicateur = new JTextField();
		textField_nbr_indicateur.setBounds(172, 277, 55, 20);
		panel.add(textField_nbr_indicateur);
		textField_nbr_indicateur.setColumns(10);
		
		final VerificationDonnees verif =new VerificationDonnees();
		
		//enregistrer le nouveau projet avec ses indicateurs
		
		JButton btnNewButton_2 = new JButton("Enregistrer");
		btnNewButton_2.addActionListener(new ActionListener() {
		
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {	
				
				
				// verifier les données 
				/*
				VerificationDonnees v=new VerificationDonnees();
				v.acceptChamp(textField_nom_etude.getText());
				v.acceptDate(dateChooser_debut_projet.getDate(), dateChooser_fin_projet.getDate());
				v.acceptChamp(textField_objectif_globale.getText());*/
				
				
				// save project object 
				SessionFactory sef =HibernateUtil.getSessionFactory() ;
				Session session=sef.openSession() ;
				session.beginTransaction() ;
				
				Project p=new Project() ;
				p.setNom(textField_nom_etude.getText()) ;
		        p.setDateDebut(dateChooser_debut_projet.getDate());
		        p.setDateFin(dateChooser_fin_projet.getDate());
		        p.setObjectifGlobal(textField_objectif_globale.getText());
		        p.setValeure(Float.valueOf(textField_valeur.getText() ) );
		        p.setUnite(textField_unite.getText());
		        p.setNbrIndicateur(Integer.parseInt(textField_nbr_indicateur.getText() ) );
		       
				Set<Indicateur>  indicateurs = new HashSet<Indicateur>();
		        for(int i=0 ;i<p.getNbrIndicateur();i++){
		        	
		        	Amelioration a =new Amelioration() ;
		        	Indicateur ind = new Indicateur() ;
		        	ind.setProjetDb(p);
		        	a.setIndicateur(ind) ;
		        	ind.setAmelioration(a);
		        	
		        	ind.setLabel(fieldsIndica.get(i).getText()) ;
		        	indicateurs.add(ind) ;
		        	session.save(ind) ; 	
		        	session.save(a) ;
		        }
		        p.setIndicateurs( indicateurs ) ;
		        session.save(p) ;
		        
		        session.flush();
		        
		        session.getTransaction().commit();
				session.close();
				
				textField_label_indica.setText(fieldsIndica.get(0).getText());
				
				//remplir les champs des indicateurs dans toutes les panels 
				for(int i=0;i<Integer.parseInt( textField_nbr_indicateur.getText() );i++){
				fieldParam.get(i).setText(fieldsIndica.get(0).getText());
				fieldind_cout.get(i).setText(fieldsIndica.get(0).getText());
				
				
				}			
				
			}
		});
		
		btnNewButton_2.setBounds(248, 292, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnE = new JButton("Annuler");
		btnE.setBounds(342, 292, 89, 23);
		panel.add(btnE);
		
		JLabel lblIndicateurs_3 = new JLabel("Indicateurs");
		lblIndicateurs_3.setBounds(564, 62, 74, 14);
		panel.add(lblIndicateurs_3);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Définition des indicateurs", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblCaractristiqueDeLindicateur = new JLabel("Caract\u00E9ristique de l'indicateur");
		lblCaractristiqueDeLindicateur.setBounds(10, 30, 231, 14);
		panel_1.add(lblCaractristiqueDeLindicateur);
		
		JLabel lblLabel = new JLabel("Label");
		lblLabel.setBounds(10, 76, 46, 14);
		panel_1.add(lblLabel);
		
		textField_label_indica = new JTextField();
		textField_label_indica.setBounds(74, 73, 118, 20);
		panel_1.add(textField_label_indica);
		textField_label_indica.setColumns(10);
		
		JLabel lblAbrviation = new JLabel("Abr\u00E9viation");
		lblAbrviation.setBounds(245, 79, 79, 14);
		panel_1.add(lblAbrviation);
		
		textField_abreviation_label_indica = new JTextField();
		textField_abreviation_label_indica.setBounds(334, 73, 86, 20);
		panel_1.add(textField_abreviation_label_indica);
		textField_abreviation_label_indica.setColumns(10);
		
		JLabel lblDescriptionTextuelle = new JLabel("Description Textuelle");
		lblDescriptionTextuelle.setBounds(10, 136, 182, 14);
		panel_1.add(lblDescriptionTextuelle);
		
		textField_description_text = new JTextField();
		textField_description_text.setBounds(10, 161, 182, 33);
		panel_1.add(textField_description_text);
		textField_description_text.setColumns(10);
		
		JLabel lblMesurePhysiqueActuelle = new JLabel("Mesure_ actuelle");
		lblMesurePhysiqueActuelle.setBounds(334, 161, 173, 14);
		panel_1.add(lblMesurePhysiqueActuelle);
		
		textField_mesure_actuelle = new JTextField();
		textField_mesure_actuelle.setBounds(517, 158, 86, 20);
		panel_1.add(textField_mesure_actuelle);
		textField_mesure_actuelle.setColumns(10);
		
		JLabel lblUnitDeMesure = new JLabel("Unit\u00E9 de mesure");
		lblUnitDeMesure.setBounds(10, 273, 109, 14);
		panel_1.add(lblUnitDeMesure);
		
		textField_unite_mesure = new JTextField();
		textField_unite_mesure.setBounds(129, 270, 86, 20);
		panel_1.add(textField_unite_mesure);
		textField_unite_mesure.setColumns(10);
		
		JLabel lblAbrviation_ = new JLabel("Abr\u00E9viation");
		lblAbrviation_.setBounds(278, 273, 69, 14);
		panel_1.add(lblAbrviation_);
		
		textField_abrevia_unite_mesure = new JTextField();
		textField_abrevia_unite_mesure.setBounds(345, 270, 69, 20);
		panel_1.add(textField_abrevia_unite_mesure);
		textField_abrevia_unite_mesure.setColumns(10);
		
		final List<JTextField> field_interp =new ArrayList<JTextField>() ;
		
		JButton btnEnregistrer = new JButton("Interpolation");
		btnEnregistrer.setBounds(184, 301, 145, 23);
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double [] x={ Double.parseDouble( textField_performance_nulle.getText() ),Double.parseDouble(textField_perf_totale.getText()) };
				double [] y ={ 0 ,1 };
				
				Interpolation inter = new Interpolation() ;
			double res=	inter.linearInterpolation( x, y, Double.parseDouble(textField_mesure_actuelle.getText() ),true) ;
				
			textField_interp.setText( String.valueOf( res )) ;		
			
				
				
			}
		});
		panel_1.add(btnEnregistrer);
		
		JLabel lblPerformanceNulle = new JLabel("Performance nulle");
		lblPerformanceNulle.setBounds(334, 200, 173, 14);
		panel_1.add(lblPerformanceNulle);
		
		textField_performance_nulle = new JTextField();
		textField_performance_nulle.setBounds(517, 197, 86, 20);
		panel_1.add(textField_performance_nulle);
		textField_performance_nulle.setColumns(10);
		
		JLabel lblPerformanceTotale = new JLabel("Performance totale");
		lblPerformanceTotale.setBounds(334, 236, 173, 14);
		panel_1.add(lblPerformanceTotale);
		
		textField_perf_totale = new JTextField();
		textField_perf_totale.setBounds(517, 228, 86, 20);
		panel_1.add(textField_perf_totale);
		textField_perf_totale.setColumns(10);
		
		
	
		 
		JButton button_1 = new JButton(">");
		button_1.setBounds(662, 76, 46, 14);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
				SessionFactory sf = HibernateUtil.getSessionFactory();
		        Session session=sf.openSession();
		        session.beginTransaction();
		        
				Query cle=session.createQuery("select max(projetDb) as etranger from Indicateur" );
				List list1=cle.list();
			    
		        
		        Query qupdate=session.createQuery(" update Indicateur set abrevLabel= :abrv ,descTextuelle=:desc,mesureActuel=:ma,perfNulle=:perN,perfTotale=:perft,uniteMesure=:um , abrevUnite =:abre  where label= :name  and projetDb= :pro ");
		        
		        qupdate.setParameter("abrv",textField_abreviation_label_indica.getText());
		        qupdate.setParameter("desc", textField_description_text.getText());
		        qupdate.setParameter("ma", Float.valueOf(  textField_mesure_actuelle.getText() ));
		        qupdate.setParameter("perN",Float.valueOf(  textField_performance_nulle.getText() ));
		        qupdate.setParameter("perft",Float.valueOf( textField_perf_totale.getText() ));
		        
		        qupdate.setParameter("um",textField_unite_mesure.getText());  
		        qupdate.setParameter("abre",textField_abrevia_unite_mesure.getText() ); 
		        qupdate.setParameter("name",textField_label_indica.getText()) ;
		        qupdate.setParameter("pro",list1.get(0));  
		        
		        int result = qupdate.executeUpdate();
		        
		        Query query=session.createQuery(" select label,abrevLabel,perfNulle,perfTotale,mesureActuel"
		        		+ " from Indicateur   where  projetDb= :pro ");
		        query.setParameter("pro", list1.get(0));
		       List reslist=query.list();
		        ArrayList<Object[]> res = new ArrayList<Object[]>(reslist);
		        session.beginTransaction().commit();       
		        session.close();
		        
		        //affichage 
		        
		        DefaultTableModel defaultTbaleModel =new DefaultTableModel() ;
				defaultTbaleModel.addColumn(" indicateur");
				defaultTbaleModel.addColumn(" abrev");
				defaultTbaleModel.addColumn(" Perf=0");
				defaultTbaleModel.addColumn(" Perf=1");
				defaultTbaleModel.addColumn(" MPhysique");
				defaultTbaleModel.addColumn(" Perf_elem");
		
				for (final Object[] r : res) {
	               
	                final Object[] row = r;
	                defaultTbaleModel.addRow(row);

	            }
				table.setModel(defaultTbaleModel);
				
		        //reinitialiser les champs 
				textField_abreviation_label_indica.setText("");
				textField_description_text.setText("");
				textField_mesure_actuelle.setText("");
				textField_performance_nulle.setText("");
				textField_perf_totale.setText("");
				textField_unite_mesure.setText("");
				textField_abrevia_unite_mesure.setText("");
				textField_label_indica.setText("");
		        
		        
			}
		});
		panel_1.add(button_1);
		
		JLabel lblSuivant = new JLabel("Suivant");
		lblSuivant.setBounds(616, 76, 46, 14);
		panel_1.add(lblSuivant);
		
		textField_interp = new JTextField();
		textField_interp.setBounds(334, 298, 86, 20);
		panel_1.add(textField_interp);
		textField_interp.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(436, 301, 89, 23);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//enregistrer la performance elementaire calculé 
				SessionFactory sf = HibernateUtil.getSessionFactory();
			    Session session=sf.openSession();			
			    session.beginTransaction();
			    
			    PerformanceGlobale  per =new PerformanceGlobale () ;
				per.setPerfElem(Float.valueOf( textField_interp.getText() )) ;
				session.save(per) ;
				
				// pour referencer les indicateuurs du dernier projet créé 
			    Query cle=session.createQuery("select max(projetDb) as etranger from Indicateur" );
				List list1=cle.list();
			    
		        
		        Query q=session.createQuery(" update Indicateur set performanceGlobale=:pe  where label= :name  and projetDb= :pro ");
		        q.setParameter("pe",per) ;
			    q.setParameter("name",textField_label_indica.getText()) ;
			    q.setParameter("pro", list1.get(0)) ;
		        q.executeUpdate() ;
			
				session.beginTransaction().commit();
				session.close();
				
                
				
						
			}
		});
		panel_1.add(btnValider);
		
		JButton btnNewButton_3 = new JButton("LineChart");
		btnNewButton_3.setBounds(601, 297, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				XYSeriesCollection dataset = new XYSeriesCollection();
				XYSeries series1 = new XYSeries(textField_label_indica.getText());
				
				series1.add(Double.parseDouble( (  textField_performance_nulle.getText() ) ), 0.0);
			    series1.add( Double.parseDouble( textField_perf_totale.getText() ) , 1.0);
			    series1.add(Double.parseDouble(  textField_mesure_actuelle.getText() ), Double.parseDouble(textField_interp.getText()));
			    
			    dataset.addSeries(series1);
			    
			    boolean autoSort = false;
			    XYSeries series = new XYSeries("Object 1", autoSort);
			    
			    String chartTitle = "Courbes des indicateurs";
			    String xAxisLabel = "Mesure physique";
			    String yAxisLabel = "performance ";
			    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, xAxisLabel, yAxisLabel, dataset);
			    
			    ChartFrame f =new ChartFrame("line chart",chart) ;
			    f.setVisible(true) ;
			    f.setSize(450, 350);	
				
			}
		});
		panel_1.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(662, 136, 244, 58);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		final JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Paramètres d'agrégation", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblPoidsimportanceRlative = new JLabel("Poids ( importance r\u00E9lative ) des indicateurs");
		lblPoidsimportanceRlative.setBounds(23, 27, 312, 14);
		panel_2.add(lblPoidsimportanceRlative);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Poids");
		lblNewLabel_1.setBounds(383, 56, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		
		JLabel lblSomme = new JLabel("Somme");
		lblSomme.setBounds(504, 56, 46, 14);
		panel_2.add(lblSomme);
		
		textField_6 = new JTextField();
		textField_6.setBounds(504, 96, 100, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		final double[][] interac=new double[5][5] ;

	
		JButton btnAg = new JButton("Agr\u00E9gation");
		btnAg.setBounds(504, 186, 144, 23);
		btnAg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							/*integrer la classe agrégation 
				
				1- recuperer les performances élémentaires des indicateurs et les mettre dans un vector v1
				
				2-mettre les poids des indicateurs dans un vector v2 .
				
				3-mettre les interactions entre les indicateurs dans un tableau 
				
				4-appliquer choquet 
				
				5-enregistrer les données dans la bd .
				
				*/
				
				//-1 :recuperer les performances élémentaires des indicateurs et les mettre dans un vector v1
				
				SessionFactory sf=HibernateUtil.getSessionFactory();
				Session session =sf.openSession();
				session.beginTransaction();
				
				String recupererPerf_elem="select p.perf_elem  from Performance_Globale p , Indicateur i  "
						+ " where p.id_Perf=i.performance and  i.projet =( select max(projet) from Indicateur) " ;
						 
				Query q1=session.createSQLQuery(recupererPerf_elem);
				
				List perf_elem =q1.list();	
				session.beginTransaction().commit();
				session.close();
				
		
				Vector perf =new Vector<Double>() ;
				Vector poids=new Vector() ;
				
				for(int i=0;i<perf_elem.size();i++){
					
					perf.addElement( perf_elem.get(i) ) ;
					System.out.println(perf.get(i)) ;
				}
				
				// - 2 :mettre les poids des indicateurs dans un vector v2
				
				for(int i=0;i<Integer.parseInt(textField_nbr_indicateur.getText() );i++){
					
					poids.addElement(  Double.parseDouble( (fieldPoid.get(i).getText() ) )  );
					
					System.out.println(poids.get(i)) ;
					
				}
				
				// - 3 :mettre les interactions entre les indicateurs dans un tableau 
				for(int i=0;i<field_lignes.size();i++){
					
					if( field_lignes.get(i).getText().equals("ind " )==false ){
					
						lInter.add(field_lignes.get(i).getText() ) ;
						
						
					}
					
				}
				//test 
				System.out.println(" size ="+lInter.size());
				for(int p=0 ;p<lInter.size();p++){	
					System.out.println(lInter.get(p));
				}
				
				
				int t=0;
				for(int m=0;m< Integer.parseInt(textField_nbr_indicateur.getText() ) ; m++){
					
					for(int n=0;n<Integer.parseInt(textField_nbr_indicateur.getText() ) ;n++){
						
						interac[n][m] = Double.parseDouble(  ( (String) lInter.get(t) ) );
						t++;
						
					}
					
				}
				
				for(int s=0;s<interac.length ;s++){
					
					for(int g=0;g<interac.length;g++){
						System.out.println(interac[s][g]);
					}
				}
				
				
				//4-appliquer choquet
				
				Agrégation agreg=new Agrégation() ;
				double res=agreg.choquet(perf, poids, interac) ;
				
				String somme= Double.toString(res) ;
				textField_6.setText(somme) ;
				
				System.out.println(res) ;
				
				//5-enregistrer les données dans la bd : boutton valider dans le panel paramètre d'agrégation				
			}
		});
		panel_2.add(btnAg);
		
		JLabel lblIndicateurs_4 = new JLabel("Indicateurs");
		lblIndicateurs_4.setBounds(23, 52, 122, 14);
		panel_2.add(lblIndicateurs_4);
		
		//validatiion des parametre d'agrégation 
		JButton btnValider_1 = new JButton("valider");
		btnValider_1.setBounds(674, 186, 105, 23);
		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SessionFactory sf=HibernateUtil.getSessionFactory();
				Session session=sf.openSession() ;
				session.beginTransaction() ;
				
				Query cle=session.createQuery("select max(projetDb) from Indicateur" );
				List list0=cle.list();
				
				 // enregistrer les poids des indicateurs 
				 	for(int i=0 ; i<Integer.parseInt( textField_nbr_indicateur.getText()) ;i++ ){
				 		
				 Query q=session.createSQLQuery(" update indicateur set poids=:po   where label= :name  and projet= :pro ");
				 	
				 q.setParameter("po", Float.parseFloat( fieldPoid.get(i).getText() )) ;
				 q.setParameter("name", fieldParam.get(i).getText()) ;
				 q.setParameter("pro", list0.get(0)) ;
				 
				 q.executeUpdate() ;
				 	}
				 	
				 	// enregistrer la performance agrégé 
				 	Query q2=session.createSQLQuery(" update indicateur as i , performance_globale as p " 
				 	+ "set p.perf_agr =:pagr "
				 	+" where i.performance=p.id_perf and projet=:pr ") ;
				 	q2.setParameter("pagr", Float.parseFloat( textField_6.getText() ) );
				 	q2.setParameter("pr",list0.get(0)) ;
				 	q2.executeUpdate(); 
				 	
				 
					
				 //enregistrer les interactions 	
					Query select=session.createQuery("select idInd from Indicateur where projetDb =(select max(projetDb) from Indicateur) ") ;
				 	List l=select.list();
					
				 	
				 	for(int i=0 ; i< Integer.parseInt(textField_nbr_indicateur.getText() ) ;i++){
				 		
				 		for(int j=0 ;j<Integer.parseInt(textField_nbr_indicateur.getText() ) ;j++){
				 			
				 			if( i==j){
				 				
				 				Interaction inter =new Interaction() ;
							 	inter.setId_ind( (Integer) l.get(i));
							 	inter.setSecond_ind( (Integer) l.get(i)) ;
							 	inter.setValeur( Float.parseFloat( fieldPoid.get(i).getText() )) ;
							 	
							 	session.save(inter) ;
				 				
				 			}else{
				 				
				 				Interaction inter =new Interaction() ;
							 	inter.setId_ind( (Integer) l.get(i));
							 	inter.setSecond_ind( (Integer) l.get(j)) ;
							 	inter.setValeur( (float) interac[i][j]) ;
							 	
							 	session.save(inter) ;
				 				
				 			}
				 			
				 			
				 		}
				 	}
						
					session.beginTransaction().commit();
					session.close() ;
						
			}
		});
		panel_2.add(btnValider_1);
		
		final Vector performance_elementaire=new Vector<Double>() ;
		final Vector poids =new Vector<Double>() ;
		JButton btnContribution = new JButton("Contribution");
		btnContribution.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// recuperer les perfermances elementaires 
				SessionFactory sf=HibernateUtil.getSessionFactory();
				Session session =sf.openSession();
				session.beginTransaction();
				
				String recupererPerf_elem="select p.perf_elem  from Performance_Globale p , Indicateur i  "
						+ " where p.id_Perf=i.performance and  i.projet =( select max(projet) from Indicateur) " ;
						 
				Query q1=session.createSQLQuery(recupererPerf_elem);
				
				List perf_elem =q1.list();
				
				Query cle=session.createQuery("select max(projetDb)  from Indicateur" );
				List list1=cle.list();
				
                for(int i=0;i<perf_elem.size();i++){
					
                	performance_elementaire.addElement( perf_elem.get(i)  ) ;
                	
					System.out.println(performance_elementaire.get(i)) ;
				}
				
				//recuperer les poids des indicateurs et les mettres dans un vector 
                for(int i=0;i<Integer.parseInt(textField_nbr_indicateur.getText() );i++){
					
					poids.addElement(  Double.parseDouble( (fieldPoid.get(i).getText() ) )  );
					
				}
                
                //recuperer les interactions
                for(int i=0;i<field_lignes.size();i++){
					
					if( field_lignes.get(i).getText().equals("ind " )==false ){
					
						lInter.add(field_lignes.get(i).getText() ) ;
						
						
					}
					
				}
					
				
				int t=0;
				for(int m=0;m< Integer.parseInt(textField_nbr_indicateur.getText() ) ; m++){
					
					for(int n=0;n<Integer.parseInt(textField_nbr_indicateur.getText() ) ;n++){
						
						interac[n][m] = Double.parseDouble(  ( (String) lInter.get(t) ) );
						t++;
						
					}
					
				}
				
				for(int s=0;s<Integer.parseInt(textField_nbr_indicateur.getText() ) ;s++){
					
					for(int g=0;g<Integer.parseInt(textField_nbr_indicateur.getText() );g++){
						System.out.println( "interac["+s +"]" +  "["+g+"]" + interac[s][g]);
					}
				}
				
			
				//calculer la contribution 
				
				OptimisationPerFix op=new OptimisationPerFix() ;
				
				Vector<Double> r =op.preparerCoeff(poids, performance_elementaire, interac);
				for(int i=0;i<r.size();i++){
				     System.out.println( " r[ "+ i + "] = " + r.get(i))  ;
				   }
				
				//
				
				DefaultPieDataset dataset = new DefaultPieDataset( );
				for(int i=0;i<r.size();i++){
					dataset.setValue( fieldParam.get(i).getText() , r.get(i));
					
				}
				JFreeChart chart = ChartFactory.createPieChart(      
				         "Contributions des indicateurs",  // chart title 
				         dataset,        // data    
				         true,           // include legend   
				         true, 
				         false);
				
				ChartFrame f =new ChartFrame("pie chart",chart) ;
			    f.setVisible(true) ;
			    f.setSize(450, 350);
			    
			    // enregistrer les contributions des indicateurs
			    for(int i=0 ; i<Integer.parseInt( textField_nbr_indicateur.getText()) ;i++ ){
			 		
					 Query q=session.createSQLQuery(" update indicateur set contribution=:c   where label= :name  and projet= :pro ");
					 	
					 q.setParameter("c", r.get(i)) ;
					 q.setParameter("name", fieldParam.get(i).getText()) ;
					 q.setParameter("pro", list1.get(0)) ;
					 
					 q.executeUpdate() ;
					 	}
			    session.beginTransaction().commit();
			    session.close();
			}
		});
		btnContribution.setBounds(799, 186, 105, 23);
		panel_2.add(btnContribution);
		
		
		
		
		final JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cout de l'amélioration", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblCoutUnitaireDe = new JLabel("Cout unitaire de l'am\u00E9lioration");
		lblCoutUnitaireDe.setBounds(10, 36, 166, 14);
		panel_3.add(lblCoutUnitaireDe);
		
		JLabel lblIndicateurs = new JLabel("Indicateurs");
		lblIndicateurs.setBounds(10, 73, 69, 14);
		panel_3.add(lblIndicateurs);
		

		
		JLabel lblCoutUnitaire = new JLabel("Cout unitaire");
		lblCoutUnitaire.setBounds(375, 73, 80, 14);
		panel_3.add(lblCoutUnitaire);
		
		
		
		JLabel lblUnitMontaire = new JLabel("Unit\u00E9 mon\u00E9taire");
		lblUnitMontaire.setBounds(527, 73, 129, 14);
		panel_3.add(lblUnitMontaire);
		
		textField_13 = new JTextField();
		textField_13.setBounds(527, 104, 86, 20);
		panel_3.add(textField_13);
		textField_13.setColumns(10);	
		
		JButton btnSauvgarder = new JButton("Sauvgarder ");
		btnSauvgarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SessionFactory sf=HibernateUtil.getSessionFactory();
				Session session =sf.openSession();
				session.beginTransaction();
				
				Query select=session.createQuery("select idInd from Indicateur where projetDb =(select max(projetDb) from Indicateur) ") ;
			 	List ll=select.list();
				
			 	for(int i=0;i<Integer.parseInt(textField_nbr_indicateur.getText() ) ;i++){
			 		
			 		
			 		Query up=session.createSQLQuery(" update amelioration set cout_amelioration=:cam "
							+ " where indicateur=:ind  ") ;
			 		up.setParameter("cam",Float.parseFloat( field_cout.get(i).getText() )) ;
					up.setParameter("ind",ll.get(i)) ;
					up.executeUpdate() ;
			 		
			 	}
				
			 	session.beginTransaction().commit();
				session.close() ;
				
					
				
			}
		});
		btnSauvgarder.setBounds(527, 199, 129, 23);
		panel_3.add(btnSauvgarder);
		
		
		
		final JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Optimisation", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Performance finale fix\u00E9");
		lblNewLabel.setBounds(10, 23, 170, 14);
		panel_4.add(lblNewLabel);
		
		JLabel lblPerformancelmentaire = new JLabel("perf-\u00E0-atteindre");
		lblPerformancelmentaire.setBounds(10, 54, 90, 14);
		panel_4.add(lblPerformancelmentaire);
		
		JLabel lblIndicateurs_1 = new JLabel("Indicateurs");
		lblIndicateurs_1.setBounds(10, 90, 72, 14);
		panel_4.add(lblIndicateurs_1);
		
		
		
		JLabel lblPerformance = new JLabel("perf-initiales");
		lblPerformance.setBounds(219, 90, 72, 14);
		panel_4.add(lblPerformance);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("perf-finales");
		lblNewLabel_2.setBounds(301, 90, 64, 14);
		panel_4.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Budjet fix\u00E9");
		lblNewLabel_3.setBounds(452, 23, 64, 14);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblPerformancelmentaireFinale = new JLabel("Performance \u00E9l\u00E9mentaire finale ");
		lblPerformancelmentaireFinale.setBounds(452, 54, 170, 14);
		panel_4.add(lblPerformancelmentaireFinale);
		
		JLabel lblIndicateurs_2 = new JLabel("Indicateurs");
		lblIndicateurs_2.setBounds(452, 90, 64, 14);
		panel_4.add(lblIndicateurs_2);
		
		
		
		JLabel lblPerformance_1 = new JLabel("Performance");
		lblPerformance_1.setBounds(632, 90, 72, 14);
		panel_4.add(lblPerformance_1);
		
		
		
		JLabel lblMphysique = new JLabel("MPhysique");
		lblMphysique.setBounds(709, 90, 64, 14);
		panel_4.add(lblMphysique);
		
		JLabel lblUnit_1 = new JLabel("Unit\u00E9");
		lblUnit_1.setBounds(375, 90, 35, 14);
		panel_4.add(lblUnit_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("Unit\u00E9");
		lblNewLabel_4.setBounds(772, 90, 46, 14);
		panel_4.add(lblNewLabel_4);
		
		textField_42 = new JTextField();
		textField_42.setBounds(110, 51, 46, 20);
		panel_4.add(textField_42);
		textField_42.setColumns(10);
		
		JLabel lblCoutOptimale = new JLabel("Cout optimale");
		lblCoutOptimale.setBounds(166, 54, 81, 14);
		panel_4.add(lblCoutOptimale);
		
		textField_43 = new JTextField();
		textField_43.setBounds(253, 51, 86, 20);
		panel_4.add(textField_43);
		textField_43.setColumns(10);
		
		JButton btnOptimiser = new JButton("optimiser");
		btnOptimiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// afficher les perf-élem initiales 
				
				SessionFactory sf=HibernateUtil.getSessionFactory();
				Session session =sf.openSession();
				session.beginTransaction();
				
				String recupererPerf_elem="select p.perf_elem  from Performance_Globale p , Indicateur i  "
						+ " where p.id_Perf=i.performance and  i.projet =( select max(projet) from Indicateur) " ;
						 
				Query q1=session.createSQLQuery(recupererPerf_elem);
				
				List perf_elem =q1.list();
				 
			    for(int i=0 ;i<field_per_opt1.size();i++){
			    	
			    	field_per_opt1.get(i).setText( String.valueOf(perf_elem.get(i) ));
			    	
			    }
			    
			    //optimisation de cout et affichage du resultat
			    
			    // recuperer les contributins des indicateurs
			    
			    String contr=" select contribution from Indicateur where"
			    		+ "  projetDb=( select max(projetDb) from Indicateur) ";
			    
			    Query q =session.createQuery(contr) ;
			    List contribution=q.list();
			    
			   // recuperer les cout 
			    String cout=" select a.cout_Amelioration from  indicateur i , Amelioration a "
			    		+ " where i.id_ind=a.indicateur and i.projet=( select max(projet) from indicateur) ";
			    
			    Query q2=session.createSQLQuery(cout) ;
			    List listCout=q2.list();
			    for(int i=0;i<listCout.size();i++){
			    	System.out.println(listCout.get(i)) ;
			    }
			    
			    session.beginTransaction().commit();
			    session.close();
			    
			    // remplissage de c 
			    double [] c = {} ; 
			    for(int i=0 ;i< listCout.size() ; i++){
			    	
			    	String s = Float.toString( (float) listCout.get(i) );
			    	c[i]= Double.valueOf(s);
			    }
			 // remplissage de G
			    double[][] G=null;
			    for(int i=0 ;i<listCout.size();i++){
			    	
			    	for(int j=0;j<listCout.size(); j++){
			    		
			    		if(i==j){
			    			G[i][j]=1 ;
			    		}else 
			    			G[i][j]=0 ;
			    		
			    		
			    	}
			    	
			    }
			    
			    
			   // remplissage de h
			    double[] h =null;
			    for(int i=0 ;i<listCout.size();i++){
			    	
			    	h[i]= 1.0 - (double)perf_elem.get(i) ;
			    }
			    
			    // remplissage de A
			    double[][] A =null;
			    
			    for(int i=0 ; i<listCout.size() ; i++){
			    	
			    	A[0][i] = (double) contribution.get(i) ;
			    }
			  //remplissage de b
			    double[] b ={  0.24  } ;
			    
			    
			  //Bounds on variables
				double[] lb = new double[] {0 , 0};
				double[] ub = new double[] {10, 10};
			  //optimization problem
				LPOptimizationRequest or = new LPOptimizationRequest();
				or.setC(c);
				or.setG(G);
				or.setH(h);
				or.setA(A) ;
				or.setB(b) ;
				or.setLb(lb);
				or.setUb(ub);
				or.setDumpProblem(true); 
				//optimization
				LPPrimalDualMethod opt = new LPPrimalDualMethod();
				opt.setLPOptimizationRequest(or);
				try {
					int returnCode = opt.optimize();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("erreur dans joptimizer !!") ;
				}
				double[] sol = opt.getOptimizationResponse().getSolution();
		   
		   for(int i=0 ; i<sol.length ;i++){

			   System.out.println(sol[i]) ;
		   }
		   
			    
			    
			    
			}
		});
		btnOptimiser.setBounds(349, 50, 89, 23);
		panel_4.add(btnOptimiser);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 240, 240));
		framePricipale.setJMenuBar(menuBar);
		
		JMenu fileVar = new JMenu("file");
		menuBar.add(fileVar);
		
		 JMenuItem newProjectVar = new JMenuItem("new project");
		 newProjectVar.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\tab_new_raised.png"));
		fileVar.add(newProjectVar);
		
		JMenuItem openProjectVar = new JMenuItem("open project");
		fileVar.add(openProjectVar);
		
		JSeparator separator = new JSeparator();
		fileVar.add(separator);
		
		JMenuItem saveVar = new JMenuItem("save");
		saveVar.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\disc_icon.jpg"));
		fileVar.add(saveVar);
		
		//

		JButton btnAjouterIndicateur = new JButton("Ajouter Indicateur");
		btnAjouterIndicateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int j=0 ;
				int k=0;
				for(int i=0 ; i< Integer.parseInt( textField_nbr_indicateur.getText() ) ;i++  ){
					
				 j+=30 ;
				 k+=40;
				 
				 JTextField textField_ajoutInd = new JTextField() ;
				 JTextField textFielt_parametre_agreg =new JTextField() ;
				 JTextField textField_poid =new JTextField();
				 JTextField textField_cout = new JTextField() ;
				 JTextField textField_ind_cout= new JTextField() ;
				 
				 JTextField textField_ind_opt1 = new JTextField() ;
				 JTextField textField_per_opt1 = new JTextField() ;
				 JTextField textField_mp_opt1 = new JTextField() ;
				 JTextField textField_unit_opt1 = new JTextField() ;
				 
				 JTextField textField_ind_opt2 = new JTextField() ;
				 JTextField textField_per_opt2 = new JTextField() ;
				 JTextField textField_mp_opt2 = new JTextField() ;
				 JTextField textField_unit_opt2 = new JTextField() ;
				 
				 textField_ajoutInd.setBounds(564, 90+i+j , 196, 20) ;
				 textFielt_parametre_agreg.setBounds(23, 45+i+k, 291, 20) ;
				 textField_poid.setBounds(372,45+i+k, 46, 20) ;
				 textField_cout.setBounds(375, 64+i+k, 58, 20) ;
				 textField_ind_cout.setBounds(10, 64+i+k, 296, 20) ;
				 
				 textField_ind_opt1.setBounds(10, 85+k, 188, 20) ;
				 textField_per_opt1.setBounds(219, 85+k, 64, 20) ;
				 textField_mp_opt1.setBounds(301, 85+k, 64, 20);
				 textField_unit_opt1.setBounds(375, 85+k, 35, 20);
				 
				 textField_ind_opt2.setBounds(452, 85+k, 170, 20) ;
				 textField_per_opt2.setBounds(632, 85+k, 64, 20) ;
				 textField_mp_opt2.setBounds(706, 85+k, 52, 20);
				 textField_unit_opt2.setBounds(771, 85+k, 35, 20);
				 
				 panel.add(textField_ajoutInd) ;
				 
				 panel_2.add(textFielt_parametre_agreg) ;
				 panel_2.add(textField_poid);
				 
				 panel_3.add(textField_ind_cout);
				 panel_3.add(textField_cout);
				 
				 panel_4.add(textField_ind_opt1);
				 panel_4.add(textField_per_opt1);
				 panel_4.add( textField_mp_opt1);
				 panel_4.add( textField_unit_opt1);
				 
				 panel_4.add(textField_ind_opt2);
				 panel_4.add(textField_per_opt2);
				 panel_4.add( textField_mp_opt2);
				 panel_4.add( textField_unit_opt2);
				 
				 
				 
				 panel.validate();
				 panel.repaint();
				 
				 fieldsIndica.add(textField_ajoutInd) ;
				 fieldParam.add(textFielt_parametre_agreg) ;
				 fieldPoid.add(textField_poid) ;
				 fieldind_cout.add(textField_ind_cout) ;
				 field_cout.add(textField_cout);
				 field_ind_opt1.add(textField_ind_opt1);
				 field_per_opt1.add(textField_per_opt1);
				 field_mp_opt1.add(textField_mp_opt1);
				 field_unit_opt1.add(textField_unit_opt1);
				 
				}
				
				// creation du matrice pour remplissage des interactions entre les indicateurs
				int p=0;
				for(int i=0 ; i<Integer.parseInt( textField_nbr_indicateur.getText() ) +1;i++  ){
					int l=0;
					p+=60;
					for(int m=0 ; m<Integer.parseInt( textField_nbr_indicateur.getText() ) +1;m++  ){
						l+=20;
						
						JTextField textField_lignes =new JTextField();
						textField_lignes.setBounds(60+p, (Integer.parseInt( textField_nbr_indicateur.getText() )*65 ) +l,60, 20);
						field_lignes.add(textField_lignes);
						
						panel_2.add(textField_lignes);		
						panel_2.validate();
						panel_2.repaint();
						 
						 
					}
					
				   field_lignes.get(i).setText("ind ");
				   
					
				}
				
				//
				for(int i=0;i<Integer.parseInt( textField_nbr_indicateur.getText() ) +1;i++){
				field_lignes.get(i*( Integer.parseInt( textField_nbr_indicateur.getText() ) +1 )).setText("ind ");
				
				}
			}
		});
		btnAjouterIndicateur.setBounds(452, 292, 149, 23);
		panel.add(btnAjouterIndicateur);
		
		
		
		JMenuItem saveAsVar = new JMenuItem("save as");
		saveAsVar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				 
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");   
				 
				int userSelection = fileChooser.showSaveDialog(null);
				 
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    /*à implémenter pour enregistrer les fichiers     */
				    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
				}
				
				
			}
		});
		fileVar.add(saveAsVar);
		
		JSeparator separator_1 = new JSeparator();
		fileVar.add(separator_1);
		
		JMenuItem importProjectVar = new JMenuItem("import project");
		fileVar.add(importProjectVar);
		
		JMenuItem deleteProjectVar = new JMenuItem("delete ");
		deleteProjectVar.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\delete_practice_icon.gif"));
		fileVar.add(deleteProjectVar);
		
		JSeparator separator_2 = new JSeparator();
		fileVar.add(separator_2);
		
		JMenuItem exitVar = new JMenuItem("exit");
		exitVar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		fileVar.add(exitVar);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	}
}
