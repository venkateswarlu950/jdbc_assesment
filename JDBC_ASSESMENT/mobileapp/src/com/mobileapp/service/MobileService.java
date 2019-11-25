package com.mobileapp.service;

import java.util.List;
import java.util.Scanner;

import com.mobileapp.dao.MobileDAO;
import com.mobileapp.dto.Mobile;

public class MobileService {

	public static void main(String[] args) {

		System.out.println("Press 1 to Show all contacts ");
		System.out.println("Press 2 to Search for contact (using name) ");
		System.out.println("Press 3 to Operate on contact");

		Scanner sc  = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			MobileDAO dao = MobileAction.getDetails();
			List<Mobile> mlist = dao.mobileDetails();

			for(Mobile m : mlist) {

				System.out.println("mobile user name::"+m.getName());
				System.out.println("mobile user number::"+m.getNumber());
				System.out.println("mobile user group::"+m.getContactGroup());

				System.out.println("=================================");
			}


			break;

		case 2:
			MobileDAO dao2 = MobileAction.getDetails();
			System.out.println("enter mobile user name: ");
			String name = sc.next();
			Mobile m1 = dao2.search(name);

			System.out.println("user name ::"+m1.getName());
			System.out.println("user number:: "+m1.getNumber());
			System.out.println("user group:: "+m1.getContactGroup());

			System.out.println("=========================================");
			
			System.out.println("press 1 to call");
			System.out.println("press 2  to message");
			System.out.println("press 3 to go back main");
			Scanner sc4 = new Scanner(System.in);
			int var = sc4.nextInt();
			switch(var) {
			case 1:
				MobileDAO dao7 = MobileAction.getDetails();
				System.out.println("Type mobile number to call:: ");
				int mobi = sc4.nextInt();
				System.out.println(mobi);
				Mobile dev = dao7.call(mobi);
				
				System.out.println("the call which we transfer to "+dev.getName()+", belongs to "+dev.getContactGroup()+" group");
				break;
			case 2:
				MobileDAO dao8 = MobileAction.getDetails();
				System.out.println("Type mobile number to send message:: ");
				int mobile = sc4.nextInt();
				Mobile msg = dao8.call(mobile);
				
				System.out.println("this message been to sent to "+msg.getName());
				
			
				break;
				
			case 3:
				System.out.println("Press 1 to Show all contacts ");
				System.out.println("Press 2 to Search for contact (using name) ");
				System.out.println("Press 3 to Operate on contact");

				Scanner scanner  = new Scanner(System.in);
				int val = scanner.nextInt();
				
				switch(val) {
				
				case 1:
					MobileDAO dao1 = MobileAction.getDetails();
					List<Mobile> mlist1 = dao1.mobileDetails();

					for(Mobile m : mlist1) {

						System.out.println("mobile user name::"+m.getName());
						System.out.println("mobile user number::"+m.getNumber());
						System.out.println("mobile user group::"+m.getContactGroup());

						System.out.println("=================================");
					}


					break;

				case 2:
					MobileDAO dao9 = MobileAction.getDetails();
					System.out.println("enter mobile user name: ");
					String name1 = sc.next();
					Mobile m2 = dao9.search(name1);

					System.out.println("user name ::"+m2.getName());
					System.out.println("user number:: "+m2.getNumber());
					System.out.println("user group:: "+m2.getContactGroup());

					System.out.println("=========================================");
					
					System.out.println("press 1 to call");
					System.out.println("press 2  to message");
					System.out.println("press 3 to go back main");
					Scanner sc5 = new Scanner(System.in);
					int var1 = sc5.nextInt();
					switch(var1) {
					case 1:
						MobileDAO dao10 = MobileAction.getDetails();
						System.out.println("Type mobile number to call:: ");
						int mobik = sc4.nextInt();
						Mobile dev1 = dao10.call(mobik);
						
						System.out.println("the call which we transfer to "+dev1.getName()+", belongs to "+dev1.getContactGroup()+" group");
						break;
					case 2:
						MobileDAO dao11 = MobileAction.getDetails();
						System.out.println("Type mobile number to send message:: ");
						int mobile1 = sc4.nextInt();
						Mobile msg1 = dao11.call(mobile1);
						
						System.out.println("this message been to sent to "+msg1.getName());
						
					
						break;
			
				}
				
			}
		}
		
			break;

		case 3:

			System.out.println("Press 1 to add contacts ");
			System.out.println("Press 2 update contact (using name) ");
			System.out.println("Press 3 to delete contact");
			Scanner sc2 = new Scanner(System.in);
			int ch2 = sc2.nextInt();

			switch (ch2) {
			case 1:

				MobileDAO dao3 = MobileAction.getDetails();
				Mobile mb3 = new Mobile();
				System.out.println("enter user name:: ");
				mb3.setName(sc.next());
				System.out.println("enter user number:: ");
				mb3.setNumber(sc.nextInt());
				System.out.println("enter user required group:: ");
				mb3.setContactGroup(sc.next());

				boolean num = dao3.saveMobile(mb3);

				if(num) {
					System.out.println(num +"rows has been added");
				}
				else {
					System.out.println("error occured try agin");
				}


				break;


			case 2:
				MobileDAO dao4 = MobileAction.getDetails();
				Mobile mb6 = new Mobile();

				System.out.println("enter contact group  name ::");
				mb6.setContactGroup(sc.next());
				System.out.println("enter update number:: ");
				mb6.setNumber(sc.nextInt());
				System.out.println("enter to which name to chnage:: ");
				mb6.setName(sc.next());

				int numb3 = dao4.update(mb6);

				System.out.println("updated sucssfully rows of ");
				System.out.println("==============================");

				break;

			case 3:
				
				MobileDAO dao5 = MobileAction.getDetails();
				System.out.println("enter delete name:: ");
				String name2 = sc.next();
				int rch = dao5.delete(name2);
				
				System.out.println("deleted of rows "+rch);
				
				
				System.out.println("===========================");
				
				break;
			}



			break;
		}

		}


	}



