package GAMES;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import myPackage.BorderDemo;

public class Sudokos extends Frame implements ActionListener
{
	int a[]=new int[17],i;
	JLabel logl=new JLabel();
	JLabel logl1=new JLabel();
	JTextField t[]=new JTextField[17];
	JTextField p[]=new JTextField[17];
	JButton b,b1,b2,b3,b4;
	Font f;
   public void Sudoko1()
		{
		setLayout(null);
		setTitle("SUDOKO");
		logl1.setText("SOLVE THIS 4/4 SUDOKO AND CHECH THE ANSWER IF IT DISPLAYS 0 THEN WRONG OTHERWISE IT IS CORRECT");
	//These are the pre number to solve sudoko with 4 by 4
		 t[0]=new JTextField("01");
		 t[1]=new JTextField("0");
		 t[2]=new JTextField("0");
		 t[3]=new JTextField("0");
		 t[4]=new JTextField("0");
		 t[5]=new JTextField("0");
		 t[6]=new JTextField("0");
		 t[7]=new JTextField("03");
		 t[8]=new JTextField("02");
		 t[9]=new JTextField("0");
		 t[10]=new JTextField("0");
		 t[11]=new JTextField("0");
		 t[12]=new JTextField("0");
		 t[13]=new JTextField("0");
		 t[14]=new JTextField("02");
		 t[15]=new JTextField("0");
		t[16]=new JTextField("");
		
		b=new JButton("check"); 
		b1=new JButton("clear");
		b2=new JButton("ANS");
		b4=new JButton("EXIT");
		
		f=new Font("Garmond",Font.BOLD,30);
		
		//This is to set the dimensions of a button 
		
		t[0].setBounds(100,100,50,50);
		t[1].setBounds(200,100,50,50);
		t[2].setBounds(300,100,50,50);
		t[3].setBounds(400,100,50,50);
		t[4].setBounds(100,200,50,50);
		t[5].setBounds(200,200,50,50);
		t[6].setBounds(300,200,50,50);
		t[7].setBounds(400,200,50,50);
		t[8].setBounds(100,300,50,50);
		t[9].setBounds(200,300,50,50);
		t[10].setBounds(300,300,50,50);
		t[11].setBounds(400,300,50,50);
		t[12].setBounds(100,400,50,50);
		t[13].setBounds(200,400,50,50);
		t[14].setBounds(300,400,50,50);
		t[15].setBounds(400,400,50,50);
		t[16].setBounds(150,600,70,70);
		b.setBounds(250,600,70,70);
		b1.setBounds(350,600,70,70);
		b2.setBounds(450,600,70,70);
		b4.setBounds(550,600,70,70);
		logl1.setBounds(20,50,1500,30);
		for(int i=0;i<17;i++)
			{
			add(t[i]);
			t[i].setFont(f);
			}
		add(b);
		add(b1);
		add(b2);
		add(b4);
		add(logl1);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);
		
		logl1.setForeground(Color.white);
		
		setBackground(Color.BLUE);
		setSize(800,800);
		setVisible(true);		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		t[0].setForeground(Color.BLUE);
		t[7].setForeground(Color.BLUE);
		t[8].setForeground(Color.BLUE);
		t[14].setForeground(Color.BLUE);
		setResizable(false);
		}

public void actionPerformed(ActionEvent ae1)
{
	BorderDemo bd=new BorderDemo();
	for(int i=0;i<16;i++)
		{
		a[i]=Integer.parseInt(t[i].getText());
		}
	
	//this is to check whether your answer is correct or not
	//if wrong it displays 0 otherwise 1
	
    if(ae1.getSource()==(b))
    	{
    	if(a[0]!=a[1] && a[0]!=a[2] && a[0]!=a[3] && a[1]!=a[2] && a[1]!=a[3] && a[2]!=a[3])
    		{
    		if(a[0]!=a[4] && a[0]!=a[8] && a[0]!=a[12] && a[4]!=a[8] && a[4]!=a[12] && a[8]!=a[12])
    			{
    			if(a[0]!=a[5] && a[0]!=a[10] && a[0]!=a[15] && a[5]!=a[10] && a[5]!=a[15] && a[10]!=a[15])
    				{
    				if(a[1]!=a[5] && a[1]!=a[9] && a[1]!=a[13] && a[5]!=a[9] && a[5]!=a[13] && a[9]!=a[13])
    					{
    					if(a[2]!=a[6] && a[2]!=a[10] && a[2]!=a[14] && a[6]!=a[10] && a[6]!=a[14] && a[10]!=a[14])
    					{
    						if(a[3]!=a[7] && a[3]!=a[11] && a[3]!=a[15] && a[7]!=a[11] && a[7]!=a[15] && a[11]!=a[15])
        					{
    							if(a[4]!=a[5] && a[4]!=a[6] && a[4]!=a[7] && a[5]!=a[6] && a[5]!=a[7] && a[6]!=a[7])
    	    					{
    								if(a[8]!=a[9] && a[8]!=a[10] && a[8]!=a[11] && a[9]!=a[10] && a[9]!=a[11] && a[10]!=a[11])
    		    					{
    									if(a[12]!=a[13] && a[12]!=a[14] && a[12]!=a[15] && a[13]!=a[14] && a[13]!=a[15] && a[14]!=a[15])
    			    					{
    										t[16].setText(String.valueOf(1));
    			    					}
    									else 
    				    		    		t[16].setText(String.valueOf(0));
    		    					}
    								else 
    			    		    		t[16].setText(String.valueOf(0));
    								
    	    					}
    							else 
    		    		    		t[16].setText(String.valueOf(0));
        					}
    						else 
    	    		    		t[16].setText(String.valueOf(0));
    					}
    					else 
        		    		t[16].setText(String.valueOf(0));
    					
    					}
    				else 
    		    		t[16].setText(String.valueOf(0));
    				}
    			else
    	    		t[16].setText(String.valueOf(0));
    			}
    		else
        		t[16].setText(String.valueOf(0));
    		}
    
    	else
    		t[16].setText(String.valueOf(0));	
    
    	}
    
    //this is the answer of this sudoko
    
    else if(ae1.getSource()==(b2))
    	{
    	logl.setText("THE GIVEN ROWS CAN ARRANGE IN DIFFERENT ROWS" );
    	JDialog d=new JDialog(this,"ANSWER",true);
    	d.setLayout(null);
    	//b3=new JButton("CLOSE");
    	p[0]=new JTextField("1");
    	p[1]=new JTextField("3");
    	p[2]=new JTextField("4");
    	p[3]=new JTextField("2");
    	p[4]=new JTextField("4");
    	p[5]=new JTextField("2");
    	p[6]=new JTextField("1");
    	p[7]=new JTextField("3");
    	p[8]=new JTextField("2");
    	p[9]=new JTextField("4");
    	p[10]=new JTextField("3");
    	p[11]=new JTextField("1");
    	p[12]=new JTextField("3");
    	p[13]=new JTextField("1");
    	p[14]=new JTextField("2");
    	p[15]=new JTextField("4");
    	p[0].setBounds(100,100,50,50);
		p[1].setBounds(200,100,50,50);
		p[2].setBounds(300,100,50,50);
		p[3].setBounds(400,100,50,50);
		p[4].setBounds(100,200,50,50);
		p[5].setBounds(200,200,50,50);
		p[6].setBounds(300,200,50,50);
		p[7].setBounds(400,200,50,50);
		p[8].setBounds(100,300,50,50);
		p[9].setBounds(200,300,50,50);
		p[10].setBounds(300,300,50,50);
		p[11].setBounds(400,300,50,50);
		p[12].setBounds(100,400,50,50);
		p[13].setBounds(200,400,50,50);
		p[14].setBounds(300,400,50,50);
		p[15].setBounds(400,400,50,50);
		//b3.setBounds(250,500,80,80);
		
		logl.setBounds(50,50,500,30);
		d.add(p[0]);
		d.add(p[1]);
		d.add(p[2]);
		d.add(p[3]);
		d.add(p[4]);
		d.add(p[5]);
		d.add(p[6]);
		d.add(p[7]);
		d.add(p[8]);
		d.add(p[9]);
		d.add(p[10]);
		d.add(p[11]);
		d.add(p[12]);
		d.add(p[13]);
		d.add(p[14]);
		d.add(p[15]);
		/*d.add(b3);
		b3.addActionListener(this);*/
		p[0].setFont(f);
		p[1].setFont(f);
		p[2].setFont(f);
		p[3].setFont(f);
		p[4].setFont(f);
		p[5].setFont(f);
		p[6].setFont(f);
		p[7].setFont(f);
		p[8].setFont(f);
		p[9].setFont(f);
		p[10].setFont(f);
		p[11].setFont(f);
		p[12].setFont(f);
		p[13].setFont(f);
		p[14].setFont(f);
		p[15].setFont(f);
    	d.add(logl);
    	d.setSize(700,700);
    	d.show();
    	}	
    else if(ae1.getSource()==(b1))
    	{
    	for(i=0;i<16;i++)
			{
    			if(i != 0 && i!=7 && i!=8 && i!=14 )
    				t[i].setText(String.valueOf(0));
			}
    	}

    else
    	{
    		System.exit(0);
    	}
   
    }

	public static void main(String xs[] )
	{
		Sudokos s = new Sudokos();
		s.Sudoko1();
	}
}