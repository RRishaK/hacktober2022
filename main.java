
import java.util.*; 

/*
*1. import --->java.sql
*2. load and register the driver ---> com.jdbc.
*3. create connection
*4. create a statement
*5. execute the query
*6. process the results
*7. close
*/

import java.io.*;
import java.sql.*;

class GFG {
	public static void main(String[] args) throws Exception
	{
		String url
			= "jdbc:mysql://localhost:3306/table_name"; // table details
		String username = "rootgfg"; // MySQL credentials
		String password = "gfg123";
		String query
			= "select *from students"; // query to be run
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st = con.createStatement();
		ResultSet rs
			= st.executeQuery(query); // Execute query
		rs.next();
		String name
			= rs.getString("name"); // Retrieve name from db

		System.out.println(name); // Print result on console
		st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}
}

public class GFG { 
	
	static String[] board; 
	static String turn; 
	
	
	// CheckWinner method will 
	// decide the combination 
	// of three box given below. 
	static String checkWinner() 
	{ 
		for (int a = 0; a < 8; a++) { 
			String line = null; 

			switch (a) { 
			case 0: 
				line = board[0] + board[1] + board[2]; 
				break; 
			case 1: 
				line = board[3] + board[4] + board[5]; 
				break; 
			case 2: 
				line = board[6] + board[7] + board[8]; 
				break; 
			case 3: 
				line = board[0] + board[3] + board[6]; 
				break; 
			case 4: 
				line = board[1] + board[4] + board[7]; 
				break; 
			case 5: 
				line = board[2] + board[5] + board[8]; 
				break; 
			case 6: 
				line = board[0] + board[4] + board[8]; 
				break; 
			case 7: 
				line = board[2] + board[4] + board[6]; 
				break; 
			} 
			//For X winner 
			if (line.equals("XXX")) { 
				return "X"; 
			} 
			
			// For O winner 
			else if (line.equals("OOO")) { 
				return "O"; 
			} 
		} 
		
		for (int a = 0; a < 9; a++) { 
			if (Arrays.asList(board).contains( 
					String.valueOf(a + 1))) { 
				break; 
			} 
			else if (a == 8) { 
				return "draw"; 
			} 
		} 

	// To enter the X Or O at the exact place on board. 
		System.out.println( 
			turn + "'s turn; enter a slot number to place "
			+ turn + " in:"); 
		return null; 
	} 
	
	// To print out the board. 
	/* |---|---|---| 
	| 1 | 2 | 3 | 
	|-----------| 
	| 4 | 5 | 6 | 
	|-----------| 
	| 7 | 8 | 9 | 
	|---|---|---|*/
	
	static void printBoard() 
	{ 
		System.out.println("|---|---|---|"); 
		System.out.println("| " + board[0] + " | "
						+ board[1] + " | " + board[2] 
						+ " |"); 
		System.out.println("|-----------|"); 
		System.out.println("| " + board[3] + " | "
						+ board[4] + " | " + board[5] 
						+ " |"); 
		System.out.println("|-----------|"); 
		System.out.println("| " + board[6] + " | "
						+ board[7] + " | " + board[8] 
						+ " |"); 
		System.out.println("|---|---|---|"); 
	} 

	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in); 
		board = new String[9]; 
		turn = "X"; 
		String winner = null; 

		for (int a = 0; a < 9; a++) { 
			board[a] = String.valueOf(a + 1); 
		} 

		System.out.println("Welcome to 3x3 Tic Tac Toe."); 
		printBoard(); 

		System.out.println( 
			"X will play first. Enter a slot number to place X in:"); 

		while (winner == null) { 
			int numInput; 
		all ok
			try { 
				numInput = in.nextInt(); 
				if (!(numInput > 0 && numInput <= 9)) { 
					System.out.println( 
						"Invalid input; re-enter slot number:"); 
					continue; 
				} 
			} 
			catch (InputMismatchException e) { 
				System.out.println( 
					"Invalid input; re-enter slot number:"); 
				continue; 
			} 
			
			// This game has two player x and O. 
			// Here is the logic to decide the turn. 
			if (board[numInput - 1].equals( 
					String.valueOf(numInput))) { 
				board[numInput - 1] = turn; 

				if (turn.equals("X")) { 
					turn = "O"; 
				} 
				else { 
					turn = "X"; 
				} 

				printBoard(); 
				winner = checkWinner(); 
			} 
			else { 
				System.out.println( 
					"Slot already taken; re-enter slot number:"); 
			} 
		} 
		
		// If no one win or lose from both player x and O. 
		// then here is the logic to print "draw". 
		if (winner.equalsIgnoreCase("draw")) { 
			System.out.println( 
				"It's a draw! Thanks for playing."); 
		} 
		
		// For winner -to display Congratulations! message. 
		else { 
			System.out.println( 
				"Congratulations! " + winner 
				+ "'s have won! Thanks for playing."); 
		} 
	} 
}
