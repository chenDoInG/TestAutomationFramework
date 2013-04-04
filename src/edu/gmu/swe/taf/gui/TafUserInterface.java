package edu.gmu.swe.taf.gui;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import edu.gmu.swe.taf.AbstractTestGenerator;
import edu.gmu.swe.taf.ConcreteTestGenerator;
import edu.gmu.swe.taf.ConstraintMapping;
import edu.gmu.swe.taf.IdentifiableElementType;
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.ModelAccessor;
import edu.gmu.swe.taf.ObjectMapping;
import edu.gmu.swe.taf.StateMachineAccessor;
import edu.gmu.swe.taf.TestCoverageCriteria;
import edu.gmu.swe.taf.XmlManipulator;
import edu.gmu.swe.taf.util.JavaSupporter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;

import coverage.graph.InvalidGraphException;
import coverage.graph.Path;
import coverage.web.InvalidInputException;

import javax.swing.JTextArea;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;
import org.apache.log4j.Logger;

import com.google.common.io.Files;
import javax.swing.DropMode;
public class TafUserInterface {

	private JFrame frame;
	private JTextField textField_projectName;
	private JLabel lblMustEnterA ;
	private JLabel lblTheProjectDirectory;
	private String directoryName = "project/";
	private String projectName = "";
	private String modelName = ".uml";
	private JLabel lblThereAreNo;
	private JLabel lblAvailableProjects;
	private JScrollPane scrollPane_projects;
	private JList<Object> list_projects;
	private JList<Object> list_models;
	private JScrollPane scrollPane_models;
	private JList<Object> list_elements;
	private JScrollPane scrollPane_elements;
	private JLabel lblModelNameForElementList;
	private JList list_mappings;
	private JLabel lblElementNameForMappingList;
	private List<Mapping> elementMappings;
	private List<ObjectMapping> objectMappings;
	private JScrollPane scrollPane_mappings;
	private JTextField textField_mappingName;
	private JTextField textField_requiredMappings;
	private JPanel panel_models;
	private JLabel lblProjectNameInModelPanel;
	private int criterionIndex = 0;
	private JComboBox comboBox_elementType;
	private JComboBox comboBox_elementName;
	private JTextField textField_stateInvariants;
	private JLabel lblStateInvariants;
	private JButton btnNewButton_clear;
	private JButton btnNewButton_save;
	private String xmlPath;
	private JTextField textField_objectName;
	private JTextField textField_className;
	private JList list_objectMappings; 
	private JScrollPane scrollPane_objectMappings;
	private JLabel lblClassName;
	private JLabel lblObjectName;
	private JLabel lblMappingName;
	private JLabel lblTestCode;
	private JLabel lblRequiredMappings;
	private JLabel lblElementName;
	private JLabel lblElementType;
	private JLabel lblEnterAPackage;
	private JTextField textField_packageName;
	private JLabel lblEnterImportedDeclarations;
	private JTextArea textArea_importDeclarations;
	private JTextArea textArea_testCode;
	private JButton btnRemoveProject;
	private JScrollPane scrollPane;

	static Logger log = Logger.getLogger(
            TafUserInterface.class);
	private JLabel lblEgImportComgoogle;
	private JButton btnDeleteMapping;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		log.debug("main interfac starts.");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TafUserInterface window = new TafUserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TafUserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewProject = new JMenuItem("New Project");
		mntmNewProject.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		mnFile.add(mntmNewProject);
		
		JMenuItem mntmLoadProject = new JMenuItem("Load Project");
		mnFile.add(mntmLoadProject);
		
		JMenu mnSearch = new JMenu("Search");
		menuBar.add(mnSearch);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		final JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				List<File> directoryFiles = JavaSupporter.returnAllDirectories(directoryName);
				if(directoryFiles == null || directoryFiles.size() == 0){
					lblThereAreNo.setVisible(true);
					lblAvailableProjects.setVisible(false);
					scrollPane_projects.setVisible(false);
					btnRemoveProject.setVisible(false);
				}
				else{
					lblThereAreNo.setVisible(false);
					lblAvailableProjects.setVisible(true);
					scrollPane_projects.setVisible(true);
					btnRemoveProject.setVisible(true);
					
					List<String> projectNames = new ArrayList<String>();
					for(File projectFile : directoryFiles){
						projectNames.add(projectFile.getName());
					}
					list_projects.setListData(projectNames.toArray());
					
					//handle the case in which there is only one project
					if(projectNames.size() >= 1){
						projectName = projectNames.get(0);
						List<File> files = JavaSupporter.returnAllUmlFiles(directoryName + projectName + "/model/"); 
						Object[] models = JavaSupporter.getFileNames(files);
			            list_models.setListData(models);
			            scrollPane_models.setViewportView(list_models);
			            lblProjectNameInModelPanel.setText(projectName);
			            lblProjectNameInModelPanel.setSize(projectName.length() * 8, lblProjectNameInModelPanel.getHeight());
			            
			            //handle the case in which there is only one mode for this project
			            if(models.length >= 1){
			            	modelName = (String)models[0];
			            	Object[] elements = null;
			            	try {
			            		elements = returnElementNames(directoryName + projectName + "/model/" + modelName);
								list_elements.setListData(elements);
								scrollPane_elements.setViewportView(list_elements);
									
								lblModelNameForElementList.setSize(modelName.length() * 8, lblModelNameForElementList.getHeight());
								lblModelNameForElementList.setText(modelName);
								
							} catch (IOException e1) {
								e1.printStackTrace();
							}
			            	
			            	xmlPath = directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml";
			            	
			            	//add the data in the list_objectMappings
							try {
								objectMappings = XmlManipulator.getObjectMappings(xmlPath);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
							list_objectMappings.setListData(JavaSupporter.getMappingNames(objectMappings));
			            	scrollPane_objectMappings.setViewportView(list_objectMappings);
			            	//show the mappings created for the first identifiable element
			            	if(elements.length >= 1){
			            		String elementName = (String)elements[0];
			            		try {
					            	 elementMappings = XmlManipulator.getMappingsByElementName(xmlPath, elementName);
					            	 list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
					            	 scrollPane_mappings.setViewportView(list_mappings);
									
					            	 lblElementNameForMappingList.setSize(elementName.length() * 8, lblElementNameForMappingList.getHeight());
					            	 lblElementNameForMappingList.setText(elementName);
					            	 
					            	 //show the content of the mapping if there is only one mapping
					            	 if(elementMappings.size() >= 1){
					            		 Mapping mapping = elementMappings.get(0);
					            		 comboBox_elementName.setSelectedItem(mapping.getIdentifiableElementName());
										 comboBox_elementType.setSelectedItem(mapping.getType());
										 textField_mappingName.setText(mapping.getMappingName());
										 textArea_testCode.setText(mapping.getTestCode());
										 textField_requiredMappings.setText(JavaSupporter.removeBrackets(mapping.getRequiredMappings().toString()));
										 
									     setElementMappingGreen();
										 
										 if(mapping.getType() == IdentifiableElementType.CONSTRAINT){
											 textField_stateInvariants.setVisible(true);
											 textField_stateInvariants.setEnabled(true);
											 lblStateInvariants.setVisible(true);
											 lblStateInvariants.setEnabled(true);
											 
											 ConstraintMapping cm = null;
											 try {
												cm = XmlManipulator.getConstraintMappingByName(xmlPath, mapping.getMappingName());
											} catch (Exception e1) {
												e1.printStackTrace();
											}
											 textField_stateInvariants.setText(JavaSupporter.removeBrackets(cm.getStateinvariants().toString()));
											 lblStateInvariants.setForeground(Color.GREEN.darker());
										 }
					            	 }
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
			            	}
			            }
					} 
					
					/*** initialization of comboBox for elementName ***/
					
					if(directoryName != null && projectName != null && modelName != null){
						if(directoryName.length() > 0 && projectName.length() > 0 && modelName.length() > 0){
							Object[] elementNames = null;
							try {
								elementNames = returnElementNames(directoryName + projectName + "/model/" + modelName);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							for(Object o : elementNames){
								comboBox_elementName.addItem(o);
							}
						}
					}				
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		frame.getContentPane().add(layeredPane);
		//frame.getContentPane().add(layeredPane);
		
		lblAvailableProjects = new JLabel("Available Projects: ");
		lblAvailableProjects.setBounds(16, 39, 134, 16);
		layeredPane.add(lblAvailableProjects);
		
		lblThereAreNo = new JLabel("There are no projects available. Please create a new project below.");
		lblThereAreNo.setBounds(16, 6, 424, 16);
		layeredPane.add(lblThereAreNo);
		
		scrollPane_projects = new JScrollPane();
		scrollPane_projects.setBounds(169, 39, 271, 70);
		layeredPane.add(scrollPane_projects);
		
		list_projects = new JList<Object>();
		scrollPane_projects.setViewportView(list_projects);
		list_projects.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_projects.locationToIndex(e.getPoint());
					 projectName = (String) list_projects.getSelectedValue();

					 	List<File> files = JavaSupporter.returnAllUmlFiles(directoryName + projectName + "/model/"); 
						Object[] models = JavaSupporter.getFileNames(files);
				        list_models.setListData(models);
				        scrollPane_models.setViewportView(list_models);
				        lblProjectNameInModelPanel.setText(projectName);
				        lblProjectNameInModelPanel.setSize(projectName.length() * 8, lblProjectNameInModelPanel.getHeight());
		             
			            //handle the case in which there is only one mode for this project
			            if(models.length >= 1){
			            	modelName = (String)models[0];
			            	Object [] tempElements = refreshElementList();
			            	
			            	xmlPath = directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml";
			            	
			            	/*** initialization of comboBox for elementName ***/

							if(directoryName != null && projectName != null && modelName != null){
								if(directoryName.length() > 0 && projectName.length() > 0 && modelName.length() > 0){
									Object[] elementNames = null;
									try {
										elementNames = returnElementNames(directoryName + projectName + "/model/" + modelName);
									} catch (IOException e1) {
										e1.printStackTrace();
									}
									comboBox_elementName.removeAllItems();
									for(Object o : elementNames){
										comboBox_elementName.addItem(o);
									}
								}
							}
			            	
			            	if(new File(xmlPath).isFile()){
				            	//add the data in the list_objectMappings
			            		refreshObjectMappingList();
				            	//show the mappings created for the first identifiable element
			            		refreshMappingList(tempElements);
			            	}
			            }
			      }
			}
		});
		
		JLabel lblProjectInstruction = new JLabel("Creating a new project starts from here. A directory for the project will be created after entering a project name and choosing a model for this project.");
		lblProjectInstruction.setBounds(16, 111, 949, 22);
		layeredPane.add(lblProjectInstruction);
		
		JLabel lblProjectName = new JLabel("Enter project name (*) : ");
		lblProjectName.setBounds(16, 138, 148, 16);
		layeredPane.add(lblProjectName);
		
		textField_projectName = new JTextField();
		//textField_projectName.setText(System.getProperty("java.home"));
		textField_projectName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblMustEnterA.setVisible(false);
				lblTheProjectDirectory.setVisible(false);
			}
		});
		textField_projectName.setBounds(169, 132, 134, 28);
		layeredPane.add(textField_projectName);
		textField_projectName.setColumns(10);
		
		lblMustEnterA = new JLabel("Must enter a name");
		lblMustEnterA.setForeground(Color.RED);
		lblMustEnterA.setBounds(315, 138, 116, 16);
		lblMustEnterA.setVisible(false);
		layeredPane.add(lblMustEnterA);
		
		lblTheProjectDirectory = new JLabel("The project directory has existed. Please type a different project name.");
		lblTheProjectDirectory.setForeground(Color.RED);
		lblTheProjectDirectory.setBounds(16, 156, 449, 16);
		lblTheProjectDirectory.setVisible(false);
		layeredPane.add(lblTheProjectDirectory);
		
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder title_testGeneration = BorderFactory.createTitledBorder(blackline, "Test generation");
		title_testGeneration.setTitleJustification(TitledBorder.LEFT);
		
		JPanel panel_generateTest = new JPanel();
		panel_generateTest.setBounds(6, 746, 1257, 103);
		panel_generateTest.setBorder(title_testGeneration);
		layeredPane.add(panel_generateTest);
		panel_generateTest.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Please select a coverage criterion and click the generate tests button.");
		lblNewLabel_5.setBounds(6, 23, 448, 16);
		panel_generateTest.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Coverage criteria:");
		lblNewLabel_4.setBounds(6, 51, 110, 16);
		//layeredPane.add(lblNewLabel_4);
		panel_generateTest.add(lblNewLabel_4);
		
		String[] coverageCriteria = {"node coverage", "edge coverage", "edge-pair coverage", "prime path coverage"};
		JComboBox comboBox = new JComboBox(coverageCriteria);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				criterionIndex = ((JComboBox)e.getSource()).getSelectedIndex();
			}
		});
		comboBox.setBounds(116, 47, 184, 27);
		panel_generateTest.add(comboBox);
		
		JButton btnGenerateTests = new JButton("Generate tests");
		btnGenerateTests.setActionCommand("generate tests");
		btnGenerateTests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("generate tests".equals(e.getActionCommand())){
					long start = System.nanoTime();
					try {					
						generateTests(directoryName + projectName + "/model/" + modelName, xmlPath, 
								projectName + "Test", directoryName + projectName + "/", getCriterionType(criterionIndex), textField_packageName.getText(),textArea_importDeclarations.getText());
						long end = System.nanoTime();
	            	    long duration = end - start;
	            	    System.out.println("Time for generating tests = " + duration + " nano seconds");
	            	    System.out.println("Time for generating tests = " + duration / 1000000000 + " seconds");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnGenerateTests.setBounds(299, 46, 134, 29);
		panel_generateTest.add(btnGenerateTests);
		
		lblEnterImportedDeclarations = new JLabel("Enter import declarations:");
		lblEnterImportedDeclarations.setBounds(466, 23, 172, 16);
		panel_generateTest.add(lblEnterImportedDeclarations);
		
		lblEgImportComgoogle = new JLabel("e.g. import com.google.common.io.*;");
		lblEgImportComgoogle.setBounds(466, 51, 245, 16);
		panel_generateTest.add(lblEgImportComgoogle);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(723, 19, 302, 74);
		panel_generateTest.add(scrollPane);
		
		textArea_importDeclarations = new JTextArea();
		scrollPane.setViewportView(textArea_importDeclarations);
		
		btnRemoveProject = new JButton("Remove the selected project");
		btnRemoveProject.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String selectedProject = (String) list_projects.getSelectedValue();				
				File toBeRemovedProject = new File(directoryName + "/" + selectedProject);
				try {
					Files.deleteRecursively(toBeRemovedProject);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				textField_projectName.setText("");
				System.out.println("Project " + selectedProject + "has been removed.");
				
				//update the project list
				List<File> directoryFiles = JavaSupporter.returnAllDirectories(directoryName);
				List<String> projectNames = new ArrayList<String>();
				for(File projectFile : directoryFiles){
					projectNames.add(projectFile.getName());
				}
				list_projects.setListData(projectNames.toArray());
				
				//handle the case in which there is only one project
				if(projectNames.size() >= 1){
					projectName = projectNames.get(0);
					refreshModelList();
					refreshElementList();
					refreshObjectMappingList();
				}else{
					projectName = "";
					lblThereAreNo.setVisible(true);
					lblAvailableProjects.setVisible(false);
					scrollPane_projects.setVisible(false);
					btnRemoveProject.setVisible(false);
					list_models.setListData(new Object[]{});
					list_elements.setListData(new Object[]{});
					list_mappings.setListData(new Object[]{});
					list_objectMappings.setListData(new Object[]{});
					
					 textField_mappingName.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 textField_stateInvariants.setText("");
					 textField_objectName.setText("");
					 textField_className.setText("");
					comboBox_elementName.removeAllItems();
					 
					 setElementMappingBlack();
					 setObjectMappingBlack();
				}
				

			}
		});
		btnRemoveProject.setBounds(451, 34, 211, 29);
		layeredPane.add(btnRemoveProject);
		
		
		TitledBorder title_models = BorderFactory.createTitledBorder(blackline, "Show, add, and remove models");
		title_models.setTitleJustification(TitledBorder.LEFT);
		
		panel_models = new JPanel();
		panel_models.setBounds(6, 184, 1257, 157);
		layeredPane.add(panel_models);
		panel_models.setLayout(null);
		panel_models.setBorder(title_models);
		
		
		JLabel lblLoadModelsForNewProject = new JLabel("Add a UML model for a new project in a prompted file chooser(*) :");
		lblLoadModelsForNewProject.setBounds(275, 27, 430, 16);
		panel_models.add(lblLoadModelsForNewProject);
		
		final JButton btnLoadModelsForNewProject = new JButton("Add a model for a new project");
		btnLoadModelsForNewProject.setBounds(275, 55, 214, 29);
		panel_models.add(btnLoadModelsForNewProject);
		
		
		scrollPane_models = new JScrollPane();
		scrollPane_models.setBounds(16, 55, 236, 98);
		panel_models.add(scrollPane_models);
		
		list_models = new JList<Object>();
		scrollPane_models.setViewportView(list_models);
		list_models.setBackground(Color.WHITE);
		
		JLabel lblAvailableModelsIn = new JLabel("Available models in ");
		lblAvailableModelsIn.setBounds(16, 27, 127, 16);
		panel_models.add(lblAvailableModelsIn);
		
		lblProjectNameInModelPanel = new JLabel("");
		lblProjectNameInModelPanel.setBounds(152, 27, 100, 16);
		panel_models.add(lblProjectNameInModelPanel);
		
		lblEnterAPackage = new JLabel("Enter a package name (e.g.: package edu.gmu.swe;):");
		lblEnterAPackage.setBounds(820, 27, 334, 16);
		panel_models.add(lblEnterAPackage);
		lblEnterAPackage.setVerticalAlignment(SwingConstants.TOP);
		
		textField_packageName = new JTextField();
		textField_packageName.setBounds(820, 54, 261, 28);
		panel_models.add(textField_packageName);
		textField_packageName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Add a UML model for an existing project:");
		lblNewLabel.setBounds(275, 96, 266, 16);
		panel_models.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add a model for an existing project");
		btnNewButton.setBounds(275, 124, 266, 29);
		panel_models.add(btnNewButton);
		
		
		TitledBorder title_mappings = BorderFactory.createTitledBorder(blackline, "Elements and mappings");
		title_mappings.setTitleJustification(TitledBorder.LEFT);
		
		JPanel panel_mappings = new JPanel();
		panel_mappings.setBounds(6, 340, 1257, 405);
		layeredPane.add(panel_mappings);
		panel_mappings.setLayout(null);
		panel_mappings.setBorder(title_mappings);
		
		scrollPane_mappings = new JScrollPane();
		scrollPane_mappings.setBounds(293, 69, 237, 287);
		panel_mappings.add(scrollPane_mappings);
		
		/*** initialization of comboBox for elementName ***/
		comboBox_elementName = new JComboBox();
		comboBox_elementName.setBounds(664, 17, 226, 27);
		panel_mappings.add(comboBox_elementName);
		
		/*** initialization of comboBox for element type ***/
		//String [] elementTypes = {IdentifiableElementType.TRANSITION.toString(), IdentifiableElementType.CONSTRAINT.toString(), IdentifiableElementType.GUARD.toString(), IdentifiableElementType.OBJECT.toString(), IdentifiableElementType.PARAMETER.toString(),
		//		IdentifiableElementType.POSTCONDITION.toString(), IdentifiableElementType.PRECONDITION.toString(), IdentifiableElementType.STATEINVARIANT.toString(), IdentifiableElementType.STATE.toString()};

		IdentifiableElementType [] elementTypes = {IdentifiableElementType.TRANSITION, IdentifiableElementType.CONSTRAINT, IdentifiableElementType.GUARD, IdentifiableElementType.OBJECT, IdentifiableElementType.PARAMETER,
				IdentifiableElementType.POSTCONDITION, IdentifiableElementType.PRECONDITION, IdentifiableElementType.STATEINVARIANT, IdentifiableElementType.STATE};
		
		comboBox_elementType = new JComboBox(elementTypes);
		comboBox_elementType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//System.out.println(comboBox_elementType.getSelectedItem());
				if(comboBox_elementType.getSelectedItem() == IdentifiableElementType.CONSTRAINT){
					 textField_stateInvariants.setVisible(true);
					 textField_stateInvariants.setEnabled(true);
					 lblStateInvariants.setVisible(true);
					 lblStateInvariants.setEnabled(true);
					 
					 setObjectMappingBlack();
					 setConstraintMappingGreen();
					 
					 textField_objectName.setText("");
					 textField_className.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
				}
				else if(comboBox_elementType.getSelectedItem() == IdentifiableElementType.TRANSITION){
					 textField_stateInvariants.setVisible(false);
					 textField_stateInvariants.setEnabled(false);
					 lblStateInvariants.setVisible(false);
					 lblStateInvariants.setEnabled(false);
					 
					 setConstraintMappingBlack();
					 setObjectMappingBlack();
					 setElementMappingGreen();
					 
					 textField_objectName.setText("");
					 textField_className.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
				}
				else if(comboBox_elementType.getSelectedItem() == IdentifiableElementType.OBJECT){
					 textField_stateInvariants.setVisible(false);
					 textField_stateInvariants.setEnabled(false);
					 lblStateInvariants.setVisible(false);
					 lblStateInvariants.setEnabled(false);
					 
					 setConstraintMappingBlack();
					 setObjectMappingGreen();
					 
					 textField_objectName.setText("");
					 textField_className.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 
					//add the data in the list_objectMappings
						try {
							objectMappings = XmlManipulator.getObjectMappings(xmlPath);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						if(objectMappings == null)
							textField_mappingName.setText("");
						else if(objectMappings.size() == 0)
							textField_mappingName.setText("");
				}
			}
		});
		comboBox_elementType.setBounds(664, 49, 226, 27);
		panel_mappings.add(comboBox_elementType);
		
		list_mappings = new JList();
		scrollPane_mappings.setViewportView(list_mappings);
		list_mappings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_mappings.locationToIndex(e.getPoint());
		             //System.out.println("Double clicked on Item " + index);
					 if(index <= elementMappings.size()){
						 Mapping mapping = elementMappings.get(index);
						 comboBox_elementName.setSelectedItem(mapping.getIdentifiableElementName());
						 //System.out.println("mapping.getType().toString(): " + mapping.getType().toString());
						 comboBox_elementType.setSelectedItem(mapping.getType());
						 textField_mappingName.setText(mapping.getMappingName());
						 textArea_testCode.setText(mapping.getTestCode());
						 textField_requiredMappings.setText(JavaSupporter.removeBrackets(mapping.getRequiredMappings().toString()));
						 
						 lblElementName.setForeground(Color.GREEN.darker());
						 lblElementType.setForeground(Color.GREEN.darker());
						 lblMappingName.setForeground(Color.GREEN.darker());
						 lblTestCode.setForeground(Color.GREEN.darker());
						 lblRequiredMappings.setForeground(Color.GREEN.darker());
						 lblObjectName.setForeground(Color.BLACK);
						 lblClassName.setForeground(Color.BLACK);
						 textField_objectName.setText("");
						 textField_className.setText("");
						 
						 if(mapping.getType() == IdentifiableElementType.CONSTRAINT){
							 textField_stateInvariants.setVisible(true);
							 textField_stateInvariants.setEnabled(true);
							 lblStateInvariants.setVisible(true);
							 lblStateInvariants.setEnabled(true);
							 
							 ConstraintMapping cm = null;
							 try {
								cm = XmlManipulator.getConstraintMappingByName(xmlPath, mapping.getMappingName());
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							 textField_stateInvariants.setText(JavaSupporter.removeBrackets(cm.getStateinvariants().toString()));
							 lblStateInvariants.setForeground(Color.GREEN.darker());
						 }
					 }
				 }
			}
		});
		
		textField_requiredMappings = new JTextField();
		textField_requiredMappings.setBounds(554, 281, 336, 28);
		panel_mappings.add(textField_requiredMappings);
		textField_requiredMappings.setColumns(10);
		
		lblRequiredMappings = new JLabel("Required Mappings:");
		lblRequiredMappings.setBounds(554, 253, 134, 16);
		panel_mappings.add(lblRequiredMappings);
		
		lblTestCode = new JLabel("Test Code:");
		lblTestCode.setBounds(556, 138, 78, 16);
		panel_mappings.add(lblTestCode);
		
		textField_mappingName = new JTextField();
		textField_mappingName.setBounds(557, 108, 333, 28);
		panel_mappings.add(textField_mappingName);
		textField_mappingName.setColumns(10);
		
		scrollPane_elements = new JScrollPane();
		scrollPane_elements.setBounds(10, 49, 237, 307);
		panel_mappings.add(scrollPane_elements);
		scrollPane_elements.setViewportView(list_elements);
		
		lblMappingName = new JLabel("Mapping Name:");
		lblMappingName.setBounds(554, 88, 112, 16);
		panel_mappings.add(lblMappingName);
		
		lblElementType = new JLabel("Element Type:");
		lblElementType.setBounds(554, 49, 98, 16);
		panel_mappings.add(lblElementType);
		
		lblElementName = new JLabel("Element Name:");
		lblElementName.setBounds(554, 21, 98, 16);
		panel_mappings.add(lblElementName);
		
		JLabel lblIdentifiableElementsIn = new JLabel("Identifiable elements in");
		lblIdentifiableElementsIn.setBounds(10, 21, 158, 16);
		panel_mappings.add(lblIdentifiableElementsIn);
		
		lblModelNameForElementList = new JLabel("");
		lblModelNameForElementList.setBounds(163, 21, 134, 16);
		panel_mappings.add(lblModelNameForElementList);
		
		JLabel lblAvailableMappingsFor = new JLabel("Available mappings for");
		lblAvailableMappingsFor.setBounds(259, 50, 148, 18);
		panel_mappings.add(lblAvailableMappingsFor);
		
		lblElementNameForMappingList = new JLabel("");
		lblElementNameForMappingList.setBounds(408, 49, 122, 16);
		panel_mappings.add(lblElementNameForMappingList);
		
		lblStateInvariants = new JLabel("State Invariants (States separated by comma):");
		lblStateInvariants.setEnabled(false);
		lblStateInvariants.setVisible(false);
		lblStateInvariants.setBounds(554, 312, 294, 16);
		panel_mappings.add(lblStateInvariants);
		
		textField_stateInvariants = new JTextField();
		textField_stateInvariants.setEnabled(false);
		textField_stateInvariants.setVisible(false);
		textField_stateInvariants.setBounds(554, 339, 336, 28);
		panel_mappings.add(textField_stateInvariants);
		textField_stateInvariants.setColumns(10);
		
		btnNewButton_clear = new JButton("Clear");
		btnNewButton_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_clear){
				     //only clear the text in the text field and text area
					 comboBox_elementName.setSelectedIndex(comboBox_elementName.getSelectedIndex());
					 comboBox_elementType.setSelectedIndex(comboBox_elementType.getSelectedIndex());
					 textField_mappingName.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 textField_objectName.setText("");
					 textField_className.setText("");
					 
					 if(textField_stateInvariants.isVisible() == true && textField_stateInvariants.isEnabled() == true)
						 textField_stateInvariants.setText("");
				}
			}
		});
		btnNewButton_clear.setBounds(554, 373, 117, 29);
		panel_mappings.add(btnNewButton_clear);
		
		btnNewButton_save = new JButton("Save");
		btnNewButton_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_save){
					//get the mapping inputs
					String elementName = (String) comboBox_elementName.getSelectedItem();
					IdentifiableElementType type = (IdentifiableElementType) comboBox_elementType.getSelectedItem();
					String mappingName = textField_mappingName.getText();
					String testCode = textArea_testCode.getText();
					String requiredMappings_textField = textField_requiredMappings.getText();
					
					List<String> requiredMappings_list = new ArrayList<String>();
					if(requiredMappings_textField != null && !requiredMappings_textField.trim().equals(""))
						requiredMappings_list = Arrays.asList(requiredMappings_textField.split(","));
					
					String objectName = textField_objectName.getText();
					String className = textField_className.getText();
					
					String stateInvariants = null;
					List<String> stateInvariant_list = new ArrayList<String>();
					
					if(lblElementName.getForeground().toString().equals("java.awt.Color[r=0,g=178,b=0]")){
						
						if(textField_stateInvariants.isVisible() == true && textField_stateInvariants.isEnabled() == true){
							stateInvariants = textField_stateInvariants.getText();
							stateInvariant_list = Arrays.asList(stateInvariants.split(","));
						}
						
						if(stateInvariants == null){
							Mapping mapping = new Mapping(mappingName, type, elementName, testCode, requiredMappings_list, null, null, null);
							
							XmlManipulator xm = new XmlManipulator();
							try {
								if(!XmlManipulator.isMappingExisted(XmlManipulator.readXmlFile(xmlPath), mapping)){
									xm.createMapping(XmlManipulator.readXmlFile(xmlPath), mapping, xmlPath);
								}
								else{
									xm.updateMapping(XmlManipulator.readXmlFile(xmlPath), mapping, xmlPath);
								}
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						else{
							ConstraintMapping mapping = new ConstraintMapping(mappingName, type, elementName, testCode, requiredMappings_list, null, null, null, null, null, null, stateInvariant_list);
							XmlManipulator xm = new XmlManipulator();
	
							try {
								if(!XmlManipulator.isMappingExisted(XmlManipulator.readXmlFile(xmlPath), mapping)){
									xm.createConstraintMapping(XmlManipulator.readXmlFile(xmlPath), mapping, xmlPath);
								}else{
									xm.updateConstraintMapping(XmlManipulator.readXmlFile(xmlPath), mapping, xmlPath);
								}
							} catch (TransformerException e1) {
								e1.printStackTrace();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}
						
						//update the mapping list
						try {
							elementMappings = XmlManipulator.getMappingsByElementName(xmlPath, elementName);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
		            	list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
		            	scrollPane_mappings.setViewportView(list_mappings);
					}
					else if(lblObjectName.getForeground().toString().equals("java.awt.Color[r=0,g=178,b=0]")){
						ObjectMapping mapping = new ObjectMapping(mappingName, IdentifiableElementType.OBJECT, objectName, className, testCode, requiredMappings_list, null);
						
						XmlManipulator xm = new XmlManipulator();
						try {
							if(!XmlManipulator.isMappingExisted(XmlManipulator.readXmlFile(xmlPath), mapping)){
								xm.createObjectMapping(XmlManipulator.readXmlFile(xmlPath), mapping, xmlPath);
							}
							else{
								xm.updateObjectMapping(XmlManipulator.readXmlFile(xmlPath), mapping, xmlPath);
							}
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
						//update the object mappings list
						//add the data in the list_objectMappings
						try {
							objectMappings = XmlManipulator.getObjectMappings(xmlPath);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
						list_objectMappings.setListData(JavaSupporter.getMappingNames(objectMappings));
		            	scrollPane_objectMappings.setViewportView(list_objectMappings);
					}
				}
			}
		});
		btnNewButton_save.setBounds(664, 373, 117, 29);
		panel_mappings.add(btnNewButton_save);
		
		scrollPane_objectMappings = new JScrollPane();
		scrollPane_objectMappings.setBounds(930, 49, 282, 241);
		panel_mappings.add(scrollPane_objectMappings);
		
		list_objectMappings = new JList();
		list_objectMappings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 String objectMappingName = (String) list_objectMappings.getSelectedValue();
					 ObjectMapping objectMapping = null;
					 try {
						objectMapping = XmlManipulator.getObjectMappingByName(xmlPath, objectMappingName);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					 
					comboBox_elementType.setSelectedItem(objectMapping.getType());
					textField_objectName.setText(objectMapping.getIdentifiableElementName());				
					textField_className.setText(objectMapping.getClassType());
					textField_mappingName.setText(objectMapping.getMappingName());
					textArea_testCode.setText(objectMapping.getTestCode());
					textField_requiredMappings.setText(JavaSupporter.removeBrackets(objectMapping.getRequiredMappings().toString()));
					
					lblClassName.setForeground(Color.GREEN.darker());
					lblObjectName.setForeground(Color.GREEN.darker());
					lblMappingName.setForeground(Color.GREEN.darker());
					lblTestCode.setForeground(Color.GREEN.darker());
					lblRequiredMappings.setForeground(Color.GREEN.darker());
					lblElementName.setForeground(Color.BLACK);
					lblElementType.setForeground(Color.BLACK);
					lblStateInvariants.setForeground(Color.BLACK);
				 }
			}
		});
		scrollPane_objectMappings.setViewportView(list_objectMappings);
		
		JLabel lblAvailableObjectMappings = new JLabel("Available object mappings:");
		lblAvailableObjectMappings.setBounds(930, 21, 170, 16);
		panel_mappings.add(lblAvailableObjectMappings);
		
		lblObjectName = new JLabel("Object Name:");
		lblObjectName.setBounds(930, 312, 98, 16);
		panel_mappings.add(lblObjectName);
		
		textField_objectName = new JTextField();
		textField_objectName.setBounds(1027, 306, 185, 28);
		panel_mappings.add(textField_objectName);
		textField_objectName.setColumns(10);
		
		lblClassName = new JLabel("Class Name:");
		lblClassName.setBounds(930, 345, 98, 16);
		panel_mappings.add(lblClassName);
		
		textField_className = new JTextField();
		textField_className.setBounds(1027, 339, 185, 28);
		panel_mappings.add(textField_className);
		textField_className.setColumns(10);
		
		JScrollPane scrollPane_testCode = new JScrollPane();
		scrollPane_testCode.setBounds(554, 166, 336, 85);
		panel_mappings.add(scrollPane_testCode);
		
		textArea_testCode = new JTextArea();
		scrollPane_testCode.setViewportView(textArea_testCode);
		
		btnDeleteMapping = new JButton("delete");
		btnDeleteMapping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tobeRemovedMapping = textField_mappingName.getText();

				if(tobeRemovedMapping != null && tobeRemovedMapping.trim().length() > 0){
					try {
						XmlManipulator.removeMapping(XmlManipulator.readXmlFile(xmlPath), tobeRemovedMapping, xmlPath);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				if(lblElementName.getForeground().toString().equals("java.awt.Color[r=0,g=178,b=0]")){
					refreshMappingList((String)comboBox_elementName.getSelectedItem());
					textField_mappingName.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 textField_stateInvariants.setText("");
				}
				else if(lblObjectName.getForeground().toString().equals("java.awt.Color[r=0,g=178,b=0]")){
					refreshObjectMappingList();
					textField_mappingName.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 textField_objectName.setText("");
					 textField_className.setText("");
				}
			}
		});
		btnDeleteMapping.setBounds(779, 373, 117, 29);
		panel_mappings.add(btnDeleteMapping);
		
		list_models.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_models.locationToIndex(e.getPoint());
		             //System.out.println("Double clicked on Item " + index);
		             modelName = (String) list_models.getSelectedValue();
		             
		             xmlPath = directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml";
		             Object[] elements = null;
		             //add data in the list_elements
		             try {
		            	elements = returnElementNames(directoryName + projectName + "/model/" + modelName);
						list_elements.setListData(elements);
						scrollPane_elements.setViewportView(list_elements);
						
						lblModelNameForElementList.setSize(modelName.length() * 8, lblModelNameForElementList.getHeight());
						lblModelNameForElementList.setText(modelName);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
		            //update the elements in comboBox_elementName while a model is selected 
					if(directoryName != null && projectName != null && modelName != null){
						if(directoryName.length() > 0 && projectName.length() > 0 && modelName.length() > 0){
							Object[] elementNames = null;
							try {
								elementNames = returnElementNames(directoryName + projectName + "/model/" + modelName);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							
							comboBox_elementName.removeAllItems();
							for(Object o : elementNames){
								comboBox_elementName.addItem(o);
							}
						}
					}	
					
					if(new File(xmlPath).isFile()){
						//add the data in the list_objectMappings
						try {
							objectMappings = XmlManipulator.getObjectMappings(xmlPath);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						
						list_objectMappings.setListData(JavaSupporter.getMappingNames(objectMappings));
		            	scrollPane_objectMappings.setViewportView(list_objectMappings);
		            	
		            	//show the mappings created for the first identifiable element
		            	if(elements.length >= 1){
		            		String elementName = (String)elements[0];
		            		try {
				            	 elementMappings = XmlManipulator.getMappingsByElementName(xmlPath, elementName);
				            	 list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
				            	 scrollPane_mappings.setViewportView(list_mappings);
								
				            	 lblElementNameForMappingList.setSize(elementName.length() * 8, lblElementNameForMappingList.getHeight());
				            	 lblElementNameForMappingList.setText(elementName);
				            	 
				            	 //show the content of the mapping if there is only one mapping
				            	 if(elementMappings.size() >= 1){
				            		 Mapping mapping = elementMappings.get(0);
				            		 comboBox_elementName.setSelectedItem(mapping.getIdentifiableElementName());
									 comboBox_elementType.setSelectedItem(mapping.getType());
									 textField_mappingName.setText(mapping.getMappingName());
									 textArea_testCode.setText(mapping.getTestCode());
									 textField_requiredMappings.setText(JavaSupporter.removeBrackets(mapping.getRequiredMappings().toString()));
									 
									 lblElementName.setForeground(Color.GREEN.darker());
									 lblElementType.setForeground(Color.GREEN.darker());
									 lblMappingName.setForeground(Color.GREEN.darker());
									 lblTestCode.setForeground(Color.GREEN.darker());
									 lblRequiredMappings.setForeground(Color.GREEN.darker());
									 
									 if(mapping.getType() == IdentifiableElementType.CONSTRAINT){
										 textField_stateInvariants.setVisible(true);
										 textField_stateInvariants.setEnabled(true);
										 lblStateInvariants.setVisible(true);
										 lblStateInvariants.setEnabled(true);
										 
										 ConstraintMapping cm = null;
										 try {
											cm = XmlManipulator.getConstraintMappingByName(xmlPath, mapping.getMappingName());
										} catch (Exception e1) {
											e1.printStackTrace();
										}
										 textField_stateInvariants.setText(JavaSupporter.removeBrackets(cm.getStateinvariants().toString()));
										 lblStateInvariants.setForeground(Color.GREEN.darker());
									 }
				            	 }
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		            	}
		            	
					}else{
						 textField_mappingName.setText("");
						 textArea_testCode.setText("");
						 textField_requiredMappings.setText("");
						 textField_stateInvariants.setText("");
						 textField_objectName.setText("");
						 textField_className.setText("");
						 list_mappings.setListData(new Object[]{});
		            	 scrollPane_mappings.setViewportView(list_mappings);
		            	 
						 setElementMappingBlack();
						 setObjectMappingBlack();
	            	}
				 }
			}
		});
		btnLoadModelsForNewProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnLoadModelsForNewProject){
					//let users to choose a UML model and add it to the project
					JFileChooser fc = new JFileChooser();
					int returnVal = fc.showDialog(layeredPane, "Load");
					if (returnVal == JFileChooser.APPROVE_OPTION) {
		                File file = fc.getSelectedFile();
		                //System.out.println(file.getName());
		                
		                //create a directory
		                String newProjectName = textField_projectName.getText();
		                if(newProjectName == null || newProjectName.trim().equals(""))
		                	lblMustEnterA.setVisible(true);
		                else{
			                File directory = new File(directoryName + newProjectName + "/model/");
			                //System.out.println(directoryName + projectName + "/model/");
			                //System.out.println(directory.getAbsolutePath());
			                if(!directory.exists()){
			                	if(directory.mkdirs()){
			                		System.out.println("Directory " + directoryName + newProjectName + " is created!");
			                		
			                		//copy the selected model to the project model folder
			                		File destinationFile = new File(directoryName + newProjectName + "/model/" + file.getName());			                		
			                		try {
										JavaSupporter.copyFile(file, destinationFile);
									} catch (IOException e1) {
										e1.printStackTrace();
									}
			                		
			                		//create other folders test, class, xml
			                		File classFolder = new File(directoryName + newProjectName + "/class/");
			                		if(!classFolder.exists())
			                			classFolder.mkdirs();
			                		
			                		File testFolder = new File(directoryName + newProjectName + "/test/temp/");
			                		if(!testFolder.exists())
			                			testFolder.mkdirs();
			                		
			                		File xmlFolder = new File(directoryName + newProjectName + "/xml/");
			                		if(!xmlFolder.exists())
			                			xmlFolder.mkdirs();
			                		
			                		String modelName = file.getName();
			                		File mappingFile = new File(directoryName + newProjectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml");
			                		if(!mappingFile.exists())
										try {
											XmlManipulator.createXmlFile(directoryName + newProjectName + "/xml/", modelName.substring(0, modelName.lastIndexOf(".")));
										} catch (ParserConfigurationException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										} catch (TransformerException e2) {
											// TODO Auto-generated catch block
											e2.printStackTrace();
										}
			                		
			                		lblThereAreNo.setVisible(false);
			    					lblAvailableProjects.setVisible(true);
			    					scrollPane_projects.setVisible(true);
			    					btnRemoveProject.setVisible(true);
			    					
			        				refreshProjectList();
			        				projectName = newProjectName;
			        				
			        				refreshModelList();		        				
			        				
			    		            //update the elements in comboBox_elementName while a model is selected 
			    					if(directoryName != null && projectName != null && modelName != null){
			    						if(directoryName.length() > 0 && projectName.length() > 0 && modelName.length() > 0){
			    							Object[] elementNames = null;
			    							try {
			    								elementNames = returnElementNames(directoryName + projectName + "/model/" + modelName);
			    							} catch (IOException e1) {
			    								e1.printStackTrace();
			    							}
			    							
			    							list_elements.setListData(elementNames);
			    							scrollPane_elements.setViewportView(list_elements);
			    								
			    							lblModelNameForElementList.setSize(modelName.length() * 8, lblModelNameForElementList.getHeight());
			    							lblModelNameForElementList.setText(modelName);
			    							
			    							refreshMappingList(elementNames);
			    							
			    							comboBox_elementName.removeAllItems();
			    							for(Object o : elementNames){
			    								comboBox_elementName.addItem(o);
			    							}
			    						}
			    					}	
						            
			    					
			    					refreshObjectMappingList();
						            //empty the text field for the project name
						            textField_projectName.setText("");
			        			} else {
			        				System.out.println("Failed to create directory!");
			        			}
		                	}else{
			                	System.out.println("The directory has existed!");
			                	lblTheProjectDirectory.setVisible(true);
			                }
						}
					}
				}
			}
		});
		
		list_elements = new JList<Object>();
		list_elements.setBounds(16, 386, 233, 230);
		list_elements.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_elements.locationToIndex(e.getPoint());
		             //System.out.println("Double clicked on Item " + index);
		             String elementName = (String) list_elements.getSelectedValue();
		             
		             //when selecting an element in the element list, all mappings for this element will be shown in the mapping list
		             try {
		            	 elementMappings = XmlManipulator.getMappingsByElementName(xmlPath, elementName);
		            	 list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
		            	 scrollPane_mappings.setViewportView(list_mappings);
						
		            	 lblElementNameForMappingList.setSize(elementName.length() * 8, lblElementNameForMappingList.getHeight());
		            	 lblElementNameForMappingList.setText(elementName);
		            	 
		            	 if(elementMappings.size() >= 1){
							 Mapping mapping = elementMappings.get(0);
							 comboBox_elementName.setSelectedItem(mapping.getIdentifiableElementName());
							 comboBox_elementType.setSelectedItem(mapping.getType());
							 textField_mappingName.setText(mapping.getMappingName());
							 textArea_testCode.setText(mapping.getTestCode());
							 textField_requiredMappings.setText(JavaSupporter.removeBrackets(mapping.getRequiredMappings().toString()));
							 setElementMappingGreen();
							 
							 if(mapping.getType() == IdentifiableElementType.CONSTRAINT){
								 textField_stateInvariants.setVisible(true);
								 textField_stateInvariants.setEnabled(true);
								 lblStateInvariants.setVisible(true);
								 lblStateInvariants.setEnabled(true);
								 
								 ConstraintMapping cm = null;
								 try {
									cm = XmlManipulator.getConstraintMappingByName(xmlPath, mapping.getMappingName());
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								 textField_stateInvariants.setText(JavaSupporter.removeBrackets(cm.getStateinvariants().toString()));
								 setConstraintMappingGreen();
							 }
		            	 }
		            	 else{
		            		 List<NamedElement> elements = returnElements(directoryName + projectName + "/model/" + modelName);
		            		 for(NamedElement element : elements){
		            			 if(element.getName().equals(elementName)){
		            				if(element.toString().indexOf("Transition") != -1){
		            					comboBox_elementType.setSelectedItem(IdentifiableElementType.TRANSITION);
		            					setElementMappingGreen();
		            				}
		            				else if(element.toString().indexOf("Constraint") != -1){
		            					comboBox_elementType.setSelectedItem(IdentifiableElementType.CONSTRAINT);
		            					setConstraintMappingGreen();
		            					
		            					 //update the state invariants, retrieve the constrained elements from the model
		            					String constrainedElements = returnConstrainedElements(directoryName + projectName + "/model/" + modelName, elementName);
		            					if(constrainedElements == null)
		            						textField_stateInvariants.setText("");
		            					else
		            						textField_stateInvariants.setText(constrainedElements.toString());
		            				}
		            				else if(element.toString().indexOf("State") != -1)
		            					comboBox_elementType.setSelectedItem(IdentifiableElementType.STATE);
		            			 }
		            		 }
		            		 comboBox_elementName.setSelectedItem(elementName);
		            		 textField_mappingName.setText("");
		            		 textArea_testCode.setText("");
		            		 textField_requiredMappings.setText("");
		            		  		 
		            		
		            	 }
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				 }
			}
		});


	}
	
	/**
	 * Gets the names of all identifiable elements in a UML diagram specified by the parameter.
	 * @param path			the path of the UML diagram in a String format
	 * @return				an array of Object objects
	 * @throws IOException
	 */
	public Object[] returnElementNames(String path) throws IOException{
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		List<NamedElement> elements = StateMachineAccessor.getAllIdentifiableElements(regions.get(0));
		return JavaSupporter.getElementNames(elements);
	}
	
	/**
	 * Gets all identifiable elements in a UML diagram specified by the parameter.
	 * @param path			the path of the UML diagram in a String format
	 * @return				an array of Object objects
	 * @throws IOException
	 */
	public List<NamedElement> returnElements(String path) throws IOException{
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		List<NamedElement> elements = StateMachineAccessor.getAllIdentifiableElements(regions.get(0));
		return elements;
	}
	
	/**
	 * Finds the constrained elements in the model and return elements in a String format.
	 * @param path
	 * @param constraintName
	 * @return
	 * @throws IOException
	 */
	public String returnConstrainedElements(String path, String constraintName) throws IOException{
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		EList<Element> constrainedElements = StateMachineAccessor.getConstraint(regions.get(0), constraintName);
		
		if(constrainedElements == null)
			return null;
		else{
			String elements = "";
			if(constrainedElements.get(0) instanceof NamedElement)
				elements = ((NamedElement)constrainedElements.get(0)).getName();
			
			for(int i = 1; i < constrainedElements.size(); i++){
				if(constrainedElements.get(i) instanceof NamedElement){
					elements += ",";
					elements += ((NamedElement)constrainedElements.get(i)).getName();
				}
			}
			return elements;
		}
		
	}
	
	/**
	 * Generates test paths.
	 * @param modelPath
	 * @param xmlPath
	 * @param testName
	 * @param directory
	 * @param testCriterion
	 * @param packageName
	 * @param imports
	 * @throws Exception
	 */
	public void generateTests(String modelPath, String xmlPath, String testName, String directory, TestCoverageCriteria testCriterion, String packageName, String imports) throws Exception{
		EObject object = StateMachineAccessor.getModelObject(modelPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), testCriterion);
		
		//print edges, initial nodes, and final nodes
		//System.out.println(stateMachine.getEdges());
		//System.out.println(stateMachine.getInitialStates());
		//System.out.println(stateMachine.getFinalStates());
		//System.out.println(stateMachine.getStateMappings());
		//System.out.println(paths);

		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			//System.out.println("path: " + paths.get(i));
			AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
			List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(i), stateMachine), stateMachine);		
			
			edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + extractTestComment(transitions), transitions);
			test = abstractTestGenerator.updateTest(xmlPath, test, XmlManipulator.getConstraintMappings(xmlPath));
			tests.add(test);
		}
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(directory, testName, xmlPath, packageName,imports);
		concreteTestGenerator.generateConcreteTests(tests);
	}
	
	/**
	 * Gets the names of a list of {@link edu.gmu.swe.taf.Mapping} objects and put them in a String object, separated by comma.
	 * @param mappings	a list of {@link edu.gmu.swe.taf.Mapping} objects
	 * @return			names of a list of {@link edu.gmu.swe.taf.Mapping} objects, separated by comma
	 */
	public String convertMappingsToString(List<? extends Mapping> mappings){
		String result = "";
		if(mappings != null){
			
			if(mappings.size() > 0)
				result = mappings.get(0).getMappingName();
			
			for(int i = 1; i < mappings.size();i++){
				result += "," + mappings.get(i).getMappingName();
			}
		}
		
		return result;
	}
	
	
	/**
	 * Extracts transition and state information from a path specified by transitions and generates comments for a test.
	 * @param transitions	a list of {@link edu.gmu.swe.taf.Transition}
	 * @return				comments that describe the path for a test in a String format
	 */
	public String extractTestComment(List<Transition> transitions){
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){
			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		return pathName;
	}
	
	/**
	 * Gets a type of TestCoverageCriteria based on the index selected from the coverage drop-down list.
	 * @param criterionIndex	the index of the coverage drop-down list
	 * @return					a type of enumeration TestCoverageCriteria
	 */
	public TestCoverageCriteria getCriterionType(int criterionIndex){
		switch(criterionIndex){
		case 0:
			return TestCoverageCriteria.NODECOVERAGE;
		case 1:
			return TestCoverageCriteria.EDGECOVERAGE;
		case 2:
			return TestCoverageCriteria.EDGEPAIRCOVERAGE;
		case 3:
			return TestCoverageCriteria.PRIMEPATHCOVERAGE;
		}
		return null;
	}
	
	/**
	 * Updates the project list.
	 */
	public void refreshProjectList(){
		List<File> directoryFiles = JavaSupporter.returnAllDirectories(directoryName);
		List<String> projectNames = new ArrayList<String>();
		for(File projectFile : directoryFiles){
			projectNames.add(projectFile.getName());
		}
		list_projects.setListData(projectNames.toArray());
		
		//handle the case in which there is only one project
		if(projectNames.size() >= 1){
			projectName = projectNames.get(0);
		}else{
			projectName = "";
		}
	}
	
	public void refreshModelList(){
		List<File> files = JavaSupporter.returnAllUmlFiles(directoryName + projectName + "/model/"); 
		Object[] models = JavaSupporter.getFileNames(files);
        list_models.setListData(models);
        scrollPane_models.setViewportView(list_models);
        lblProjectNameInModelPanel.setText(projectName);
        lblProjectNameInModelPanel.setSize(projectName.length() * 8, lblProjectNameInModelPanel.getHeight());
        
        if(models.length >= 1){
        	modelName = (String)models[0];
        }
	}
	
	public Object[] refreshElementList(){
		Object[] elements = null;
    	try {
    		elements = returnElementNames(directoryName + projectName + "/model/" + modelName);
			list_elements.setListData(elements);
			scrollPane_elements.setViewportView(list_elements);
				
			lblModelNameForElementList.setSize(modelName.length() * 8, lblModelNameForElementList.getHeight());
			lblModelNameForElementList.setText(modelName);
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    	return elements;
	}
	
	public void refreshMappingList(Object[] elements){
    	if(elements.length >= 1){
    		
    		String elementName = (String)elements[0];
    		xmlPath = directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml";
    		
    		try {
            	 elementMappings = XmlManipulator.getMappingsByElementName(xmlPath, elementName);
            	 list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
            	 scrollPane_mappings.setViewportView(list_mappings);
				
            	 lblElementNameForMappingList.setSize(elementName.length() * 8, lblElementNameForMappingList.getHeight());
            	 lblElementNameForMappingList.setText(elementName);
            	 
            	 //show the content of the mapping if there is only one mapping
            	 if(elementMappings.size() >= 1){
            		 Mapping mapping = elementMappings.get(0);
            		 comboBox_elementName.setSelectedItem(mapping.getIdentifiableElementName());
					 comboBox_elementType.setSelectedItem(mapping.getType());
					 textField_mappingName.setText(mapping.getMappingName());
					 textArea_testCode.setText(mapping.getTestCode());
					 textField_requiredMappings.setText(JavaSupporter.removeBrackets(mapping.getRequiredMappings().toString()));
					 setElementMappingGreen();
					 
					 if(mapping.getType() == IdentifiableElementType.CONSTRAINT){
						 textField_stateInvariants.setVisible(true);
						 textField_stateInvariants.setEnabled(true);
						 lblStateInvariants.setVisible(true);
						 lblStateInvariants.setEnabled(true);
						 
						 ConstraintMapping cm = null;
						 try {
							cm = XmlManipulator.getConstraintMappingByName(xmlPath, mapping.getMappingName());
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						 textField_stateInvariants.setText(JavaSupporter.removeBrackets(cm.getStateinvariants().toString()));
						 lblStateInvariants.setForeground(Color.GREEN.darker());
					 }
            	 }
            	 else{
	            	 textField_mappingName.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 textField_stateInvariants.setText("");
					 textField_objectName.setText("");
					 textField_className.setText("");
					 
					 setElementMappingBlack();
					 setObjectMappingBlack();
					 setConstraintMappingBlack();
            	 }
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
    	}
	}
	
	public void refreshMappingList(String element){
    		String elementName = element;
    		xmlPath = directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml";
    		
    		try {
            	 elementMappings = XmlManipulator.getMappingsByElementName(xmlPath, elementName);
            	 list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
            	 scrollPane_mappings.setViewportView(list_mappings);
				
            	 lblElementNameForMappingList.setSize(elementName.length() * 8, lblElementNameForMappingList.getHeight());
            	 lblElementNameForMappingList.setText(elementName);
            	 
            	 //show the content of the mapping if there is only one mapping
            	 if(elementMappings.size() >= 1){
            		 Mapping mapping = elementMappings.get(0);
            		 comboBox_elementName.setSelectedItem(mapping.getIdentifiableElementName());
					 comboBox_elementType.setSelectedItem(mapping.getType());
					 textField_mappingName.setText(mapping.getMappingName());
					 textArea_testCode.setText(mapping.getTestCode());
					 textField_requiredMappings.setText(JavaSupporter.removeBrackets(mapping.getRequiredMappings().toString()));
					 setElementMappingGreen();
					 
					 if(mapping.getType() == IdentifiableElementType.CONSTRAINT){
						 textField_stateInvariants.setVisible(true);
						 textField_stateInvariants.setEnabled(true);
						 lblStateInvariants.setVisible(true);
						 lblStateInvariants.setEnabled(true);
						 
						 ConstraintMapping cm = null;
						 try {
							cm = XmlManipulator.getConstraintMappingByName(xmlPath, mapping.getMappingName());
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						 textField_stateInvariants.setText(JavaSupporter.removeBrackets(cm.getStateinvariants().toString()));
						 lblStateInvariants.setForeground(Color.GREEN.darker());
					 }
            	 }
            	 else{
	            	 textField_mappingName.setText("");
					 textArea_testCode.setText("");
					 textField_requiredMappings.setText("");
					 textField_stateInvariants.setText("");
					 textField_objectName.setText("");
					 textField_className.setText("");
					 
					 setElementMappingBlack();
					 setObjectMappingBlack();
            	 }
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	}
	
	public void refreshObjectMappingList(){
		xmlPath = directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml";
    	
    	//add the data in the list_objectMappings
		if(new File(xmlPath).exists()){
			try {
				objectMappings = XmlManipulator.getObjectMappings(xmlPath);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else{
			objectMappings = new ArrayList<ObjectMapping>();
		}
		
		list_objectMappings.setListData(JavaSupporter.getMappingNames(objectMappings));
    	scrollPane_objectMappings.setViewportView(list_objectMappings);
    	
    	if(objectMappings == null)
    		textField_mappingName.setText("");
    	else if(objectMappings.size() == 0)
    		textField_mappingName.setText("");
    	
	}
	/**
	 * Sets the colors of labels for the element mappings green.
	 */
	public void setElementMappingGreen(){
		 lblElementName.setForeground(Color.GREEN.darker());
		 lblElementType.setForeground(Color.GREEN.darker());
		 lblMappingName.setForeground(Color.GREEN.darker());
		 lblTestCode.setForeground(Color.GREEN.darker());
		 lblRequiredMappings.setForeground(Color.GREEN.darker());
	}
	
	/**
	 * Sets the colors of labels for the element mappings black.
	 */
	public void setElementMappingBlack(){
		 lblElementName.setForeground(Color.BLACK);
		 lblElementType.setForeground(Color.BLACK);
		 lblMappingName.setForeground(Color.BLACK);
		 lblTestCode.setForeground(Color.BLACK);
		 lblRequiredMappings.setForeground(Color.BLACK);
	}
	
	/**
	 * Sets the colors of labels for the constraint mappings green.
	 */
	public void setConstraintMappingGreen(){
		 lblElementName.setForeground(Color.GREEN.darker());
		 lblElementType.setForeground(Color.GREEN.darker());
		 lblMappingName.setForeground(Color.GREEN.darker());
		 lblTestCode.setForeground(Color.GREEN.darker());
		 lblRequiredMappings.setForeground(Color.GREEN.darker());
		 lblStateInvariants.setForeground(Color.GREEN.darker());
	}
	
	/**
	 * Sets the colors of labels for the constraint mappings black.
	 */
	public void setConstraintMappingBlack(){
		 lblElementName.setForeground(Color.BLACK);
		 lblElementType.setForeground(Color.BLACK);
		 lblMappingName.setForeground(Color.BLACK);
		 lblTestCode.setForeground(Color.BLACK);
		 lblRequiredMappings.setForeground(Color.BLACK);
		 lblStateInvariants.setForeground(Color.BLACK);
	}
	
	/**
	 * Sets the colors of labels for the object mappings black.
	 */
	public void setObjectMappingBlack(){
		 lblObjectName.setForeground(Color.BLACK);
		 lblClassName.setForeground(Color.BLACK);
		 lblMappingName.setForeground(Color.BLACK);
		 lblTestCode.setForeground(Color.BLACK);
		 lblRequiredMappings.setForeground(Color.BLACK);
	}
	
	/**
	 * Sets the colors of labels for the object mappings green.
	 */
	public void setObjectMappingGreen(){
		 lblObjectName.setForeground(Color.GREEN.darker());
		 lblClassName.setForeground(Color.GREEN.darker());
		 lblMappingName.setForeground(Color.GREEN.darker());
		 lblTestCode.setForeground(Color.GREEN.darker());
		 lblRequiredMappings.setForeground(Color.GREEN.darker());
	}
}
