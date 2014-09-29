import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;


public class player extends JApplet{

	int incturn = 0;
	int player1 = 0;
	int player2 = 0;
	int robot = 0;

	int bn1 = 0;
	int bn2 = 0;
	int bn3 = 0;
	int bn4 = 0;
	int bn5 = 0;
	int bn6 = 0;
	int bn7 = 0;
	int bn8 = 0;
	int bn9 = 0;

	int b1pressed = 0;
	int b2pressed = 0;
	int b3pressed = 0;
	int b4pressed = 0;
	int b5pressed = 0;
	int b6pressed = 0;
	int b7pressed = 0;
	int b8pressed = 0;
	int b9pressed = 0;

	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	public JButton b5;
	public JButton b6;
	public JButton b7;
	public JButton b8;
	public JButton b9;
	public JButton b10;
	public JButton b11;
	public JButton b12;
	public GridLayout design;

	public int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0,a7 = 0,a8 = 0;
	public int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0,c7 = 0,c8 = 0;
	public int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
	public int aa=0,bb=0,cc=0,dd=0,ee=0,ff=0,gg=0,hh=0,ii=0;

	public JLabel l1;
	public JLabel l2;
	public JLabel l3;

	@Override
	public void init(){
		creategui();
		actionlisteners();
	}
	
	public void player1(){
		//Robot (X)
		if (incturn == 0||incturn == 2||incturn == 4||incturn == 6||incturn == 8){
			player1 = 1;
		}
	}

	public void player2(){
		//Person (O)
		if (incturn == 1||incturn == 3||incturn == 5||incturn == 7||incturn == 9){
			player2 = 1;
		}
	}

	public void player1w(){
		a1 = a+b+c;
		a2 = d+e+f;
		a3 = g+h+i;
		a4 = a+d+g;
		a5 = b+e+h;
		a6 = c+f+i;
		a7 = a+e+i;
		a8 = c+e+g;
		if (a1 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a2 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a3 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a4 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a5 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a6 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a7 == 3)
		{
			l1.setText("Player 1 wins!");
		}
		if (a8 == 3)
		{
			l1.setText("Player 1 wins!");
		}
	}

	public void player2w(){
		c1 = aa+bb+cc;
		c2 = dd+ee+ff;
		c3 = gg+hh+ii;
		c4 = aa+dd+gg;
		c5 = bb+ee+hh;
		c6 = cc+ff+ii;
		c7 = aa+ee+ii;
		c8 = cc+ee+gg;
		if (c1 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c2 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c3 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c4 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c5 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c6 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c7 == 3)
		{
			l1.setText("Player 2 wins!");
		}
		if (c8 == 3)
		{
			l1.setText("Player 2 wins!");
		}
	}

	public void robot(){
		int temp = incturn;
		if(incturn % 2 == 0 && !l1.getText().contains("wins")){
			do	{
				int randint;
				randint = 1 + (int)(Math.random() * ((9 - 1) + 1));
				if(b1pressed == 1){
					bn1 = 1;
				}
				else if(b2pressed == 1){
					bn2 = 2;
				}
				else if(b3pressed == 1){
					bn3 = 3;
				}
				else if(b4pressed == 1){
					bn4 = 4;
				}
				else if(b5pressed == 1){
					bn5 = 5;
				}
				else if(b6pressed == 1){
					bn6 = 6;
				}
				else if(b7pressed == 1){
					bn7 = 7;
				}
				else if(b8pressed == 1){
					bn8 = 8;
				}
				else if(b9pressed == 1){
					bn9 = 9;
				}

				if(randint == 1 && b1pressed == 0){
					b1.doClick();
				}
				else if(randint == 2 && b2pressed == 0){
					b2.doClick();
				}
				else if(randint == 3 && b3pressed == 0){
					b3.doClick();
				}
				else if(randint == 4 && b4pressed == 0){
					b4.doClick();
				}
				else if(randint == 5 && b5pressed == 0){
					b5.doClick();
				}
				else if(randint == 6 && b6pressed == 0){
					b6.doClick();
				}
				else if(randint == 7 && b7pressed == 0){
					b7.doClick();
				}
				else if(randint == 8 && b8pressed == 0){
					b8.doClick();
				}
				else if(randint == 9 && b9pressed == 0){
					b9.doClick();
				}
			}
			while(temp == incturn && !l1.getText().toLowerCase().contains("draw"));
		}
	}

	public void creategui(){
		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");
		b10 = new JButton("Restart?");
		b11 = new JButton("Vs Person?");
		b12 = new JButton("Vs Comp.?");
		GridLayout design = new GridLayout(0,3);

		l1 = new JLabel("Welcome to Tic Tac Toe");
		l2 = new JLabel();
		l3 = new JLabel("Mode = vs. Player");
		
		l1.setSize(300, 10);
		b10.setBackground(Color.black);
		b11.setBackground(Color.black);
		b12.setBackground(Color.black);
		b10.setForeground(Color.white);
		b11.setForeground(Color.white);
		b12.setForeground(Color.white);

		b1.setBackground(Color.lightGray);
		b2.setBackground(Color.lightGray);
		b3.setBackground(Color.lightGray);
		b4.setBackground(Color.lightGray);
		b5.setBackground(Color.lightGray);
		b6.setBackground(Color.lightGray);
		b7.setBackground(Color.lightGray);
		b8.setBackground(Color.lightGray);
		b9.setBackground(Color.lightGray);

		Font font1 = new Font ("SansSerif", Font.BOLD, 30);
		Font font2 = new Font ("SansSerif", Font.PLAIN, 20);
		Font font3 = new Font ("SansSerif", Font.ITALIC, 13);

		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);
		b5.setFont(font1);
		b6.setFont(font1);
		b7.setFont(font1);
		b8.setFont(font1);
		b9.setFont(font1);
		b10.setFont(font2);
		b11.setFont(font2);
		b12.setFont(font2);
		l1.setFont(font3);

		setLayout(design);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(l1);
		add(l2);
		add(l3);		
	}



	public void actionlisteners(){
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b1pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b1pressed = 1;
				}
				if(b1pressed == 0){
					incturn++;
					if (player1 == 1){
						b1.setText("X");
						a = 1;
						if(robot != 1){
							b1.setBackground(Color.green);
						}
						else if(robot == 1){
							b1.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b1.setText("O");
						aa = 1;
						b1.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b1pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b2pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b2pressed = 1;
				}
				if(b2pressed == 0){
					incturn++;
					if (player1 == 1){
						b2.setText("X");
						b = 1;
						if(robot != 1){
							b2.setBackground(Color.green);
						}
						else if(robot == 1){
							b2.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b2.setText("O");
						bb = 1;
						b2.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b2pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b3pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b3pressed = 1;
				}
				if(b3pressed == 0){
					incturn++;
					if (player1 == 1){
						b3.setText("X");
						c = 1;
						if(robot != 1){
							b3.setBackground(Color.green);
						}
						else if(robot == 1){
							b3.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b3.setText("O");
						cc = 1;
						b3.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b3pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b4pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b4pressed = 1;
				}
				if(b4pressed == 0){
					incturn++;
					if (player1 == 1){
						b4.setText("X");
						d = 1;
						if(robot != 1){
							b4.setBackground(Color.green);
						}
						else if(robot == 1){
							b4.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b4.setText("O");
						dd = 1;
						b4.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b4pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b5pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b5pressed = 1;
				}
				if(b5pressed == 0){
					incturn++;
					if (player1 == 1){
						b5.setText("X");
						e = 1;
						if(robot != 1){
							b5.setBackground(Color.green);
						}
						else if(robot == 1){
							b5.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b5.setText("O");
						ee = 1;
						b5.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b5pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b6pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b6pressed = 1;
				}
				if(b6pressed == 0){
					incturn++;
					if (player1 == 1){
						b6.setText("X");
						f = 1;
						if(robot != 1){
							b6.setBackground(Color.green);
						}
						else if(robot == 1){
							b6.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b6.setText("O");
						ff = 1;
						b6.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b6pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b7pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b7pressed = 1;
				}
				if(b7pressed == 0){
					incturn++;
					if (player1 == 1){
						b7.setText("X");
						g = 1;
						if(robot != 1){
							b7.setBackground(Color.green);
						}
						else if(robot == 1){
							b7.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b7.setText("O");
						gg = 1;
						b7.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b7pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b8pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b8pressed = 1;
				}
				if(b8pressed == 0){
					incturn++;
					if (player1 == 1){
						b8.setText("X");
						h = 1;
						if(robot != 1){
							b8.setBackground(Color.green);
						}
						else if(robot == 1){
							b8.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b8.setText("O");
						hh = 1;
						b8.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b8pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				player1();
				player2();
				if(a1 == 3||a2 == 3||a3 == 3||a4 == 3||a5 == 3||a6 == 3||a7 == 3||a8 == 3){
					b9pressed = 1;
				}
				if(c1 == 3||c2 == 3||c3 == 3||c4 == 3||c5 == 3||c6 == 3||c7 == 3||c8 == 3){
					b9pressed = 1;
				}
				if(b9pressed == 0){
					incturn++;
					if (player1 == 1){
						b9.setText("X");
						i = 1;
						if(robot != 1){
							b9.setBackground(Color.green);
						}
						else if(robot == 1){
							b9.setBackground(Color.gray);
						}
						player1w();
					}
					if (player2 == 1){
						b9.setText("O");
						ii = 1;
						b9.setBackground(Color.yellow);
						player2w();
					}
					if (incturn == 9 && !l1.getText().contains("wins")){
						l1.setText("It's a draw!");
					}
				}
				b9pressed = 1;
				player1 = 0;
				player2 = 0;
				if(robot == 1){
					robot();
				}
			}
		});
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setup();
			}
		});
		b11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				l3.setText("Mode = vs. Player");
				robot = 0;
			}
		});
		b12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				l3.setText("Mode = vs. Computer");
				robot = 1;
				robot();
			}
		});

	}


	public void setup(){
		b10.setBackground(Color.black);
		b11.setBackground(Color.black);
		b12.setBackground(Color.black);
		b10.setForeground(Color.white);
		b11.setForeground(Color.white);
		b12.setForeground(Color.white);

		b1.setBackground(Color.lightGray);
		b2.setBackground(Color.lightGray);
		b3.setBackground(Color.lightGray);
		b4.setBackground(Color.lightGray);
		b5.setBackground(Color.lightGray);
		b6.setBackground(Color.lightGray);
		b7.setBackground(Color.lightGray);
		b8.setBackground(Color.lightGray);
		b9.setBackground(Color.lightGray);

		b1pressed = 0;
		b2pressed = 0;
		b3pressed = 0;
		b4pressed = 0;
		b5pressed = 0;
		b6pressed = 0;
		b7pressed = 0;
		b8pressed = 0;
		b9pressed = 0;
		incturn = 0;
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		l1.setText("The game was reset.");
		a = 0; b = 0; c = 0; d = 0; e = 0; f = 0; g = 0; h = 0; i = 0;
		aa = 0; bb = 0; cc = 0; dd = 0; ee = 0; ff = 0; gg = 0; hh = 0; ii = 0;
		a1 = 0; a2 = 0; a3 = 0; a4 = 0; a5 = 0; a6 = 0; a7 = 0; a8 = 0;
		c1 = 0; c2 = 0; c3 = 0; c4 = 0; c5 = 0; c6 = 0; c7 = 0; c8 = 0;
		if(robot == 1){
			robot();
		}
	}
	{
	}
	{
	}
}