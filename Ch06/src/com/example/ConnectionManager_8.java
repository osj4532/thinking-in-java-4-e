package com.example;

class Connection{
	private Connection() {
		System.out.println("Connection()");
	}
	public static Connection access() {
		return new Connection();
	}
}

public class ConnectionManager_8 {
	static int howMany = 3;
	static Connection[] ca = new Connection[3];
	 
	public static Connection getConnection() {
		if(howMany > 0) {
			return ca[--howMany];
		}else {
			System.out.println("No more connections");
			return null;
		}
	}
	
	public static void main(String[] args) {
		ConnectionManager_8 cm = new ConnectionManager_8();
		System.out.println(ConnectionManager_8.howMany);
		ConnectionManager_8.getConnection();
		System.out.println(ConnectionManager_8.howMany);
		ConnectionManager_8.getConnection();
		System.out.println(ConnectionManager_8.howMany);
		ConnectionManager_8.getConnection();
		System.out.println(ConnectionManager_8.getConnection());
		System.out.println(ConnectionManager_8.howMany);
	}
}
