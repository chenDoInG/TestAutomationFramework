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
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.ModelAccessor;
import edu.gmu.swe.taf.StateMachineAccessor;
import edu.gmu.swe.taf.TestCoverageCriteria;
import edu.gmu.swe.taf.XmlManipulator;
import edu.gmu.swe.taf.util.JavaSupporter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;

import coverage.graph.InvalidGraphException;
import coverage.graph.Path;
import coverage.web.InvalidInputException;

import javax.swing.JTextArea;

public class TafUserInterface {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblMustEnterA ;
	private JLabel lblTheProjectDirectory;
	private String directoryName = "project/";
	private String projectName;
	private String modelName;
	private JLabel lblThereAreNo;
	private JLabel lblAvailableProjects;
	private JScrollPane scrollPane_projects;
	private JList<Object> list_projects;
	private JList<Object> list_models;
	private JScrollPane scrollPane_models;
	private JList<Object> list_elements;
	private JScrollPane scrollPane_elements;
	private JLabel lblNewLabel_2;
	private JList list_mappings;
	private JLabel lblNewLabel_3;
	private List<Mapping> elementMappings;
	private JScrollPane scrollPane_mappings;
	private JTextField textField_elementName;
	private JTextField textField_elementType;
	private JTextField textField_mappingName;
	private JTextField textField_requiredMappings;
	private JTextArea textArea_testCode;
	private JPanel panel_models;
	private JLabel lblNewLabel_6;
	private int criterionIndex = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 1011, 1065);
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
				System.out.println("frame created");
				List<File> directoryFiles = JavaSupporter.returnAllDirectories(directoryName);
				if(directoryFiles == null || directoryFiles.size() == 0){
					lblThereAreNo.setVisible(true);
					lblAvailableProjects.setVisible(false);
					scrollPane_projects.setVisible(false);
				}
				else{
					lblThereAreNo.setVisible(false);
					lblAvailableProjects.setVisible(true);
					scrollPane_projects.setVisible(true);
					
					List<String> projectNames = new ArrayList<String>();
					for(File projectFile : directoryFiles){
						projectNames.add(projectFile.getName());
					}
					list_projects.setListData(projectNames.toArray());
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
		             System.out.println("Double clicked on Item " + index);
		             List<File> files = JavaSupporter.returnAllUmlFiles(directoryName + projectName + "/model/"); 
		             list_models.setListData(JavaSupporter.getFileNames(files));
		             scrollPane_models.setViewportView(list_models);
		             lblNewLabel_6.setText(projectName);
		             lblNewLabel_6.setSize(projectName.length() * 8, lblNewLabel_6.getHeight());
				 }
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Creating a new project starts from here. A directory for the project will be created after entering the name and clicking the model.");
		lblNewLabel_1.setBounds(16, 111, 825, 22);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Enter project name (*) : ");
		lblNewLabel.setBounds(16, 138, 148, 16);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblMustEnterA.setVisible(false);
				lblTheProjectDirectory.setVisible(false);
			}
		});
		textField.setBounds(169, 132, 134, 28);
		layeredPane.add(textField);
		textField.setColumns(10);
		
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
		panel_generateTest.setBounds(6, 760, 921, 89);
		panel_generateTest.setBorder(title_testGeneration);
		layeredPane.add(panel_generateTest);
		panel_generateTest.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Please select a coverage criterion and click the generate tests button.");
		lblNewLabel_5.setBounds(36, 23, 448, 16);
		panel_generateTest.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Coverage criteria:");
		lblNewLabel_4.setBounds(34, 50, 110, 16);
		//layeredPane.add(lblNewLabel_4);
		panel_generateTest.add(lblNewLabel_4);
		
		String[] coverageCriteria = {"node coverage", "edge coverage", "edge-pair coverage", "prime path coverage"};
		JComboBox comboBox = new JComboBox(coverageCriteria);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				criterionIndex = ((JComboBox)e.getSource()).getSelectedIndex();
			}
		});
		comboBox.setBounds(171, 46, 184, 27);
		panel_generateTest.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Generate tests");
		btnNewButton_1.setActionCommand("generate tests");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("generate tests".equals(e.getActionCommand())){
					System.out.println("button is clicked");
					try {
						generateTests(directoryName + projectName + "/model/" + modelName, directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml", 
								projectName + "Test", directoryName + projectName + "/test/", getCriterionType(criterionIndex));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_1.setBounds(414, 45, 134, 29);
		panel_generateTest.add(btnNewButton_1);
		
		JButton btnRema = new JButton("remove the selected project");
		btnRema.setBounds(451, 34, 211, 29);
		layeredPane.add(btnRema);
		
		
		TitledBorder title_models = BorderFactory.createTitledBorder(blackline, "Show, add, and remove models");
		title_models.setTitleJustification(TitledBorder.LEFT);
		
		panel_models = new JPanel();
		panel_models.setBounds(6, 184, 921, 157);
		layeredPane.add(panel_models);
		panel_models.setLayout(null);
		panel_models.setBorder(title_models);
		
		JLabel lblLoadModels = new JLabel("Add models (*) :");
		lblLoadModels.setBounds(288, 57, 114, 16);
		panel_models.add(lblLoadModels);
		
		final JButton btnNewButton = new JButton("Add a Model");
		btnNewButton.setBounds(403, 52, 122, 29);
		panel_models.add(btnNewButton);
		
		
		scrollPane_models = new JScrollPane();
		scrollPane_models.setBounds(16, 55, 236, 98);
		panel_models.add(scrollPane_models);
		
		list_models = new JList<Object>();
		scrollPane_models.setViewportView(list_models);
		list_models.setBackground(Color.WHITE);
		
		JLabel lblAvailableModelsIn = new JLabel("Available models in ");
		lblAvailableModelsIn.setBounds(16, 27, 127, 16);
		panel_models.add(lblAvailableModelsIn);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(152, 27, 100, 16);
		panel_models.add(lblNewLabel_6);
		
		
		TitledBorder title_mappings = BorderFactory.createTitledBorder(blackline, "Elements and mappings");
		title_mappings.setTitleJustification(TitledBorder.LEFT);
		
		JPanel panel_mappings = new JPanel();
		panel_mappings.setBounds(6, 340, 921, 388);
		layeredPane.add(panel_mappings);
		panel_mappings.setLayout(null);
		panel_mappings.setBorder(title_mappings);
		
		scrollPane_mappings = new JScrollPane();
		scrollPane_mappings.setBounds(293, 69, 237, 287);
		panel_mappings.add(scrollPane_mappings);
		
		list_mappings = new JList();
		scrollPane_mappings.setViewportView(list_mappings);
		list_mappings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_mappings.locationToIndex(e.getPoint());
		             System.out.println("Double clicked on Item " + index);
					 if(index <= elementMappings.size()){
						 Mapping mapping = elementMappings.get(index);
						 textField_elementName.setText(mapping.getIdentifiableElementName());
						 textField_elementType.setText(mapping.getType().toString());
						 textField_mappingName.setText(mapping.getMappingName());
						 textArea_testCode.setText(mapping.getTestCode());
						 textField_requiredMappings.setText(mapping.getRequiredMappings().toString());
					 }
						 
				 }
			}
		});
		
		textField_requiredMappings = new JTextField();
		textField_requiredMappings.setBounds(554, 281, 336, 28);
		panel_mappings.add(textField_requiredMappings);
		textField_requiredMappings.setColumns(10);
		
		JLabel lblRequiredMappings = new JLabel("Required Mappings:");
		lblRequiredMappings.setBounds(554, 253, 134, 16);
		panel_mappings.add(lblRequiredMappings);
		
		JScrollPane scrollPane_testCode = new JScrollPane();
		scrollPane_testCode.setBounds(556, 166, 334, 85);
		panel_mappings.add(scrollPane_testCode);
		
		textArea_testCode = new JTextArea();
		scrollPane_testCode.setRowHeaderView(textArea_testCode);
		
		JLabel lblTestCode = new JLabel("Test Code:");
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
		
		JLabel lblMappingName = new JLabel("Mapping Name:");
		lblMappingName.setBounds(554, 80, 112, 16);
		panel_mappings.add(lblMappingName);
		
		textField_elementType = new JTextField();
		textField_elementType.setBounds(663, 45, 227, 28);
		panel_mappings.add(textField_elementType);
		textField_elementType.setColumns(10);
		
		JLabel lblElementType = new JLabel("Element Type:");
		lblElementType.setBounds(554, 49, 98, 16);
		panel_mappings.add(lblElementType);
		
		textField_elementName = new JTextField();
		textField_elementName.setBounds(663, 17, 227, 28);
		panel_mappings.add(textField_elementName);
		textField_elementName.setColumns(10);
		
		JLabel lblElementName = new JLabel("Element Name:");
		lblElementName.setBounds(554, 23, 98, 16);
		panel_mappings.add(lblElementName);
		
		JLabel lblIdentifiableElementsIn = new JLabel("Identifiable elements in");
		lblIdentifiableElementsIn.setBounds(10, 21, 158, 16);
		panel_mappings.add(lblIdentifiableElementsIn);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(163, 21, 134, 16);
		panel_mappings.add(lblNewLabel_2);
		
		JLabel lblAvailableMappingsFor = new JLabel("Available mappings for");
		lblAvailableMappingsFor.setBounds(259, 50, 148, 18);
		panel_mappings.add(lblAvailableMappingsFor);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(408, 49, 61, 16);
		panel_mappings.add(lblNewLabel_3);
		
		list_models.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_models.locationToIndex(e.getPoint());
		             System.out.println("Double clicked on Item " + index);
		             modelName = (String) list_models.getSelectedValue();
		             
		             try {
						list_elements.setListData(returnElementNames(directoryName + projectName + "/model/" + modelName));
						scrollPane_elements.setViewportView(list_elements);
						
						lblNewLabel_2.setSize(modelName.length() * 8, lblNewLabel_2.getHeight());
						lblNewLabel_2.setText(modelName);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				 }
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton){
					JFileChooser fc = new JFileChooser();
					int returnVal = fc.showDialog(layeredPane, "Load");
					if (returnVal == JFileChooser.APPROVE_OPTION) {
		                File file = fc.getSelectedFile();
		                System.out.println(file.getName());
		                
		                //create a directory
		                String projectName = textField.getText();
		                if(projectName == null || projectName.trim().equals(""))
		                	lblMustEnterA.setVisible(true);
		                else{
			                File directory = new File(directoryName + projectName + "/model/");
			                System.out.println(directoryName + projectName + "/model/");
			                System.out.println(directory.getAbsolutePath());
			                if(!directory.exists()){
			                	if(directory.mkdirs()){
			                		System.out.println("Directory is created!");
			                		File destinationFile = new File(directoryName + projectName + "/model/" + file.getName());
			                		
			                		try {
										JavaSupporter.copyFile(file, destinationFile);
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
			                		
			                		List<File> umlFiles = JavaSupporter.returnAllUmlFiles(directoryName + projectName + "/model"); 
			                		/*
			                		List<String> umlFileNames = new ArrayList<String>();
			                		for(File umlFile : umlFiles){
			                			umlFileNames.add(umlFile.getName());
			                		}
			                		*/
			                		list_models.setListData(JavaSupporter.getFileNames(umlFiles));
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
		             System.out.println("Double clicked on Item " + index);
		             String elementName = (String) list_elements.getSelectedValue();
		             
		             //when selecting an element in the element list, all mappings for this element will be shown in the mapping list
		             try {
		            	 elementMappings = XmlManipulator.getMappingsByElementName(directoryName + projectName + "/xml/" + modelName.substring(0, modelName.lastIndexOf(".")) + ".xml", elementName);
		            	 list_mappings.setListData(JavaSupporter.getMappingNames(elementMappings));
		            	 scrollPane_mappings.setViewportView(list_mappings);
						
		            	 lblNewLabel_3.setSize(elementName.length() * 8, lblNewLabel_3.getHeight());
		            	 lblNewLabel_3.setText(elementName);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
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
	
	public void generateTests(String modelPath, String xmlPath, String testName, String testPath, TestCoverageCriteria testCriterion) throws Exception{
		EObject object = StateMachineAccessor.getModelObject(modelPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), testCriterion);

		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			System.out.println("path: " + paths.get(i));
			AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
			List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(i), stateMachine), stateMachine);		
			
			edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + extractTestComment(transitions), transitions);
			test = abstractTestGenerator.updateTest(xmlPath, test, XmlManipulator.getConstraintMappings(xmlPath));
			tests.add(test);
		}
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(testPath, testName, xmlPath,"","");
		concreteTestGenerator.generateConcreteTests(tests);
	}
	
	/**
	 * Gets the names of a list of {@link edu.gmu.swe.taf.Mapping} objects and put them in a String object, separated by comma.
	 * @param mappings	a list of {@link edu.gmu.swe.taf.Mapping} objects
	 * @return			names of a list of {@link edu.gmu.swe.taf.Mapping} objects, separated by comma
	 */
	public String convertMappingsToString(List<Mapping> mappings){
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
}
