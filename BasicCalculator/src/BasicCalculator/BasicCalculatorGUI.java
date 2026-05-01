package BasicCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BasicCalculatorGUI {
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
	private JTextField i4;
	private JTextField i5;
	private JTextField i6;
	private JTextField i7;
	private JTextField i8;
	private JTextField i9;
	private JTextField i10;
	private JLabel result;
	
	BasicCalculatorFunctionality test = new BasicCalculatorFunctionality();
	UnitConversionFunctionality unitConversion  = new UnitConversionFunctionality();
	
	CardLayout card = new CardLayout();
	JPanel main = new JPanel(card);
	 
	JPanel menu = new JPanel();
	JPanel arithmetic = new JPanel();
	CardLayout UnitCard = new CardLayout();
	JPanel Unit = new JPanel(UnitCard);

	
	JComboBox<String> Opt ;
	
	//This method is for all the arithmetic functions except (sum and subtraction)
	private int[] getInputs() throws NumberFormatException {
		
		int a = Integer.parseInt(i1.getText());
        int b = Integer.parseInt(i2.getText());
        
		return new int[] {a,b};
	}
	
	// This method is for sum and subtraction since they use ArrayList
	private ArrayList<Integer> getInputsList() throws NumberFormatException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = Integer.parseInt(i1.getText());
        int b = Integer.parseInt(i2.getText());
        list.add(a);
        list.add(b);
        
        return  list;
	}
	

	
	public BasicCalculatorGUI() {
		
		main.setBackground(new Color(142,175, 240));
		menu.setBackground(new Color(142,175, 240));
		JFrame f = new JFrame("Basic Calculator");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		f.getContentPane().setBackground(new Color(255, 0, 255));
		
		
		JLabel title = new JLabel("Basic Calculator / Unit Converter", SwingConstants.CENTER);
		title.setFont(new Font("Chicago", Font.BOLD, 35));
		title.setForeground(new Color(104, 88,243));
		f.add(title, BorderLayout.NORTH);
		i1 = new JTextField(10);
        i2 = new JTextField(10);
        i3 = new JTextField(10);
        i4= new JTextField(10);
        i5 =new JTextField(10);
        i6 =new JTextField(10);
        i7 =new JTextField(10);
        i8 =new JTextField(10);
        i9 =new JTextField(10);
        i10 =new JTextField(10);
        
        i3.setVisible(false);
        i4.setVisible(false);
        i5.setVisible(false);
        
        result = new JLabel("Result: ");
        result.setFont(new Font("Chicago", Font.PLAIN, 18));
        Font o = new Font("Chicago",Font.BOLD, 15 );
        String [] Options = {"Aritmetic Operations", "Unit Conversions"};
        Opt = new JComboBox<>(Options);
        Opt.setFont(o);
        JButton selectButton = new JButton("Select");
        JLabel instruction = new JLabel("Please select the option you want.");
        menu.add(instruction);
        menu.add(Opt);
        menu.add(selectButton);
        
        main.add(menu, "Menu");
        
        // Arithmetic Operation Buttons
        f.add(main, BorderLayout.CENTER);
        
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton divButton = new JButton("%");
        JButton multButton = new JButton("x");
        JButton sqrtButton = new JButton("√");
        JButton powerButton = new JButton("^");
        JButton dotprodButton = new JButton("Dot Product with components only");
        JButton dotprodButtonAngle = new JButton("Dot Product with angle");
        JButton FactorialButton = new JButton("!");
        JButton backtoM3 = new JButton("Back to menu");
        arithmetic.setBackground(new Color(142,175, 240));

        arithmetic.add(i1);
        arithmetic.add(i2);
        arithmetic.add(i3);
        arithmetic.add(i4);
        arithmetic.add(i5);
        
        arithmetic.add(addButton);
        arithmetic.add(subButton);
        arithmetic.add(divButton);
        arithmetic.add(multButton);
        arithmetic.add(sqrtButton);
        arithmetic.add(powerButton);
        arithmetic.add(FactorialButton);
        arithmetic.add(dotprodButton);
        arithmetic.add(dotprodButtonAngle);
        arithmetic.add(result);
        
        arithmetic.add(backtoM3);

        main.add(arithmetic, "Arithmetic calculator");
        // End of  arithmetic option
        
       
        //Unit Conversion Buttons
        JPanel mainmenu = new JPanel();
        mainmenu.setBackground(new Color(141,174, 240));
        JPanel Temp = new JPanel();
        Temp.setBackground(new Color(142,175, 240 ));
        JPanel LConvert = new JPanel();
        LConvert.setBackground(new Color(115, 129, 241));
        JButton backtoM1 = new JButton("Back to Menu");
        
       
         
        
        JButton LenghtConversionB = new JButton("Lenght Conversion");
        LenghtConversionB.setFont(new Font("Chicago", Font.BOLD, 15));
        JButton TemperatureConversion = new JButton("Temperature Conversion");
        TemperatureConversion.setFont(new Font("Chicago", Font.BOLD, 15));
        Temp.add(TemperatureConversion);
        LConvert.add(LenghtConversionB);
       // String [] Uni = {"Lenght Conversions", "Temperature Conversions"};
       // JComboBox<String> U = new JComboBox<>(Uni);
        JLabel ins1 = new JLabel("Please type the conversion you want from: ");
        JLabel ins2 = new JLabel("km, m, yd, in, ft, mm, cm ");
        LConvert.add(ins1);
        LConvert.add(ins2);
        
        LConvert.add(new JLabel(" From: "));
        LConvert.add(i6);
        
        LConvert.add(new JLabel("To: "));
        LConvert.add(i7);
        LConvert.add(new JLabel("Value: "));
        LConvert.add(i8);
        JLabel resultConversion = new JLabel("Result: ");
        resultConversion.setFont(new Font("Chicago", Font.PLAIN,18));
        
        
        
        i6.setVisible(false); 
        i7.setVisible(false); 
        i8.setVisible(false);
        i9.setVisible(false);
        i10.setVisible(false);
        
        JButton convertButton = new JButton("Convert Unit");
        
        LConvert.add(convertButton);
        LConvert.add(backtoM1);
      //Temperature Conversion
        JButton backtoM2 = new JButton("Back to menu");
        JLabel ins3 = new JLabel("Please type the conversion you want from: ");
        JButton ConvertTemp = new JButton("Convert");
        Temp.add(ins3);
        String[] tempOptions = {
        	    "C to F",
        	    "F to C",
        	    "C to K",
        	    "K to C",
        	    "F to K",
        	    "K to F"
        	};

        JComboBox<String> tempSelector = new JComboBox<>(tempOptions);
        tempSelector.setBackground(new Color(175, 175, 255));
        Temp.add(tempSelector);
        Temp.add(i9);
        Temp.add(i10);
        JLabel resultTemp = new JLabel("Result: ");
        resultTemp.setFont(new Font("Chicago", Font.PLAIN,18));
        Temp.add(ConvertTemp);
        Temp.add(resultTemp);
        Temp.add(backtoM2 );
        //mainmenu.add(Temp);
        //mainmenu.add(LConvert);
        mainmenu.add(LenghtConversionB);
        mainmenu.add(TemperatureConversion);
        JButton backtoM4 = new JButton("Back to Menu");
        mainmenu.add(backtoM4);
        LConvert.add(resultConversion);
        Unit.add(mainmenu, "Menu");
        Unit.add(Temp, "Temp Conversion");
        Unit.add(LConvert, "L Conversion");
       // Unit.add(U);
        
        main.add(Unit, "Unit Conversions");
        //Button Functionality For main
        selectButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		String selected = (String) Opt.getSelectedItem();
        		
        		if(selected.equals("Aritmetic Operations")) {
        			card.show(main, "Arithmetic calculator");
        		}
        		else if(selected.equals("Unit Conversions")) {
        			card.show(main, "Unit Conversions");
        			UnitCard.show(Unit, "Menu");
        		}
        		
        	}
        });
        
        //Button functionality to go back to the menu from Lenght Conversion
        backtoM1.addActionListener(new ActionListener() {
        	
        	
            public void actionPerformed(ActionEvent e) {
            	UnitCard.show(Unit, "Menu");
            }
            });
        //Button back to menu from temperature Conversion
        backtoM2.addActionListener(new ActionListener() {
        	
        	
            public void actionPerformed(ActionEvent e) {
            	UnitCard.show(Unit, "Menu");
            }
            });
        //Back to menu button from arithmetic function
        backtoM3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	card.show(main, "Menu");
            }
            });
        //Back to menu button from Unit conversion
        backtoM4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	card.show(main, "Menu");
            }
            });
   // Button functionality for Arithmetic Operations
        addButton.addActionListener(new ActionListener() {
        	
        	
            public void actionPerformed(ActionEvent e) {
            try {
                ArrayList<Integer> sums = getInputsList();
                int sum = test.sum(sums);
                result.setText("Result: " + sum);
            }
            catch(NumberFormatException ex) {
				result.setText("Please enter a valid number. Try again");
			}
            }
        });

       

		subButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				
				ArrayList<Integer> subs = getInputsList();
                
				int substraction = test.sub(subs);
				result.setText("Result: " + substraction);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
			}
		});
		
		
		divButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				int [] inputs = getInputs();
				int a = inputs[0];
				int b = inputs[1];
               
				double divi = test.div(a,b);
				result.setText("Result: " + divi);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
				catch(ArithmeticException ex) {
					result.setText("Cannot divide by zero. Please try again");
				}
			}
		});
		multButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				ArrayList<Integer> inputs = getInputsList();
				
               
				int mult = test.multiplication(inputs);
				result.setText("Result: " + mult);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
				
			}
		});
		sqrtButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				int num =  Integer.parseInt(i1.getText());
				
               
				double sqrt = test.squareRoot(num);
				result.setText("Result: " + sqrt);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
				
			}
		});
		
		powerButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				int[] num = getInputs();
				int a = num[0];
				int b = num[1];
               
				double pow = test.power(a,b);
				result.setText("Result: " + pow);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
				
			}
		});
		FactorialButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				int num =  Integer.parseInt(i1.getText());
				
               
				int  fact = test.factorial(num);
				result.setText("Result: " + fact);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
				
			}
		});
		dotprodButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				i3.setVisible(true);
			    i4.setVisible(true);
			    i5.setVisible(false);  
				int a = Integer.parseInt(i1.getText());
		        int b = Integer.parseInt(i2.getText());
		        int c = Integer.parseInt(i3.getText());
		        int d = Integer.parseInt(i4.getText());
               
				double dot = test.doTproductSum(a,b,c,d);
				result.setText("Result: " + dot);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again");
				}
				
			}
		});
		
		dotprodButtonAngle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				i3.setVisible(true);
			    i4.setVisible(true);
			    i5.setVisible(true);  
				int a = Integer.parseInt(i1.getText());
		        int b = Integer.parseInt(i2.getText());
		        int c = Integer.parseInt(i3.getText());
		        int d = Integer.parseInt(i4.getText());
		        int f = Integer.parseInt(i5.getText());
               
				double dot = test.dotProductAngle(a,b,c,d,f);
				result.setText("Result: " + dot);
				}
				catch(NumberFormatException ex) {
					result.setText("Please enter a valid number. Try again. Enter first the angle and then the components");
				}
				
			}
		});
		// Functionality for Unit Conversions
		
		
		
		LenghtConversionB.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		
        			UnitCard.show(Unit, "L Conversion");
    				i6.setVisible(true);
    			    i7.setVisible(true);
    			    i8.setVisible(true);
    		        
        		
        	}
        });
	convertButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		try {
		String f = i6.getText().toLowerCase();
        String g = i7.getText().toLowerCase();
        double h = Integer.parseInt(i8.getText());
        
		double dot = unitConversion.ConvertLenght(f,g,h);
		resultConversion.setText("Result: " + dot);
		}
		catch(NumberFormatException ex) {
			result.setText("Please enter a valid number. Try again. Enter first the angle and then the components");
		}
		}
		});
	TemperatureConversion.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		
			UnitCard.show(Unit, "Temp Conversion");
			i9.setVisible(true);
		    
	        
		
	}
});
	ConvertTemp.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		try {
    			String option = (String) tempSelector.getSelectedItem();
    			i9.setVisible(true);
    			double value = Double.parseDouble(i9.getText());
    			double resultVal =0;
    			
    			switch(option) {
    			 case"C to F":
    				 resultVal = unitConversion.CelsiustoFarenheit(value);
    				 break;
    			 case"F to C":
    				 resultVal = unitConversion.FarenheittoCelsius(value);
    				 break;
    			 case "F to K":
    				 resultVal = unitConversion.FarenheittoKelvin(value);
    				 break;
    			 case "C to K":
    				 resultVal = unitConversion.CelsiustoKelvin(value);
    				 break;
    			 case "K to C":
    				 resultVal = unitConversion.KelvintoCelSius(value);
    				 break;
    				 
    			 case "K to F" : 
    				 resultVal = unitConversion.KelvintoFarenheit(value);
    				 break;
    				 
    			 default:
    				    throw new IllegalArgumentException("Invalid option. Please Try again");
    				 
    			}
    
	
    			resultTemp.setText("Result: " + resultVal);
	}
	catch(NumberFormatException ex) {
		result.setText("Please enter a valid number. Try again.");
	}
	}
	});
		f.setVisible(true);
	}
public static void main(String [] args) {
	new BasicCalculatorGUI();
}
}

		
		    
	        
		