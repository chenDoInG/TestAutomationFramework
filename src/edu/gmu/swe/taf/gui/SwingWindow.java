package edu.gmu.swe.taf.gui;

import java.awt.EventQueue;

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

import edu.gmu.swe.taf.ModelAccessor;
import edu.gmu.swe.taf.StateMachineAccessor;
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
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;

public class SwingWindow {

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
	private JList<Object> list_models = new JList<Object>();
	private JScrollPane scrollPane;
	private JList<Object> list_elements;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingWindow window = new SwingWindow();
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
	public SwingWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 895, 723);
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
		             scrollPane.setViewportView(list_models);
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
		
		JLabel lblLoadModels = new JLabel("Add models (*) :");
		lblLoadModels.setBounds(16, 166, 112, 16);
		layeredPane.add(lblLoadModels);
		
		final JButton btnNewButton = new JButton("Add a Model");
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
		btnNewButton.setBounds(165, 161, 138, 29);
		layeredPane.add(btnNewButton);
		
		lblMustEnterA = new JLabel("Must enter a name");
		lblMustEnterA.setForeground(Color.RED);
		lblMustEnterA.setBounds(315, 138, 116, 16);
		lblMustEnterA.setVisible(false);
		layeredPane.add(lblMustEnterA);
		
		lblTheProjectDirectory = new JLabel("The project directory has existed. Please type a different project name.");
		lblTheProjectDirectory.setForeground(Color.RED);
		lblTheProjectDirectory.setBounds(16, 194, 449, 16);
		lblTheProjectDirectory.setVisible(false);
		layeredPane.add(lblTheProjectDirectory);
				
		
		JLabel lblAvailableModels = new JLabel("Available models: ");
		lblAvailableModels.setBounds(16, 222, 123, 16);
		layeredPane.add(lblAvailableModels);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 250, 185, 70);
		layeredPane.add(scrollPane);
		
		list_models = new JList<Object>();
		scrollPane.setViewportView(list_models);
		list_models.setBackground(Color.WHITE);
		list_models.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount() == 2){
					 int index = list_models.locationToIndex(e.getPoint());
		             System.out.println("Double clicked on Item " + index);
		             modelName = (String) list_models.getSelectedValue();
		             
		             try {
						list_elements.setListData(returnElementNames(directoryName + projectName + "/model/" + modelName));
						scrollPane_1.setViewportView(list_elements);
						
						lblNewLabel_2.setSize(modelName.length() * 8, lblNewLabel_2.getHeight());
						lblNewLabel_2.setText(modelName);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				 }
			}
		});
		
		JLabel lblIdentifiableElementsIn = new JLabel("Identifiable elements in");
		lblIdentifiableElementsIn.setBounds(16, 332, 158, 16);
		layeredPane.add(lblIdentifiableElementsIn);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(169, 332, 134, 16);
		layeredPane.add(lblNewLabel_2);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(16, 366, 237, 307);
		layeredPane.add(scrollPane_1);
		
		list_elements = new JList<Object>();
		list_elements.setBounds(16, 386, 233, 230);


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
}
