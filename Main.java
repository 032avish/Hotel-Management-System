package com.amdocs.hotel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int ch,ch2;
            char wish;
            do{
                System.out.print("\t\t\t\t\t ___________________________________________________________________________________________\n");
                System.out.print("\t\t\t\t\t|                                           		                                        |\n");
                System.out.print("\t\t\t\t\t|                                           		                                        |\n");
                System.out.print("\t\t\t\t\t|                                           		                                        |\n");
                System.out.print("\t\t\t\t\t|                                           		                                        |\n");
                System.out.print("\t\t\t\t\t|                                           		                                        |\n");
                System.out.print("\t\t\t\t\t|                                           		                                        |\n");
                System.out.print("\t\t\t\t\t|                            WELCOME TO HOTEL GRAND BHAGWATI INN                            |\n");
                System.out.print("\t\t\t\t\t|                                                                                           |\n");
                System.out.print("\t\t\t\t\t|                                                                                           |\n");
                System.out.print("\t\t\t\t\t|                                                                                           |\n");
                System.out.print("\t\t\t\t\t|                                                                                           |\n");
                System.out.print("\t\t\t\t\t|                                                                                           |\n");
                System.out.print("\t\t\t\t\t|                                                                                           |\n");
                System.out.print("\t\t\t\t\t|                                         -Brought To You by                                |\n");
                System.out.print("\t\t\t\t\t|                                      	 MITTAL AND MITTAL COMPANY                          |\n");
                System.out.print("\t\t\t\t\t|___________________________________________________________________________________________|\n");

                System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
                ch = sc.nextInt();
                switch(ch){
                    case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        Hotel.features(ch2);
                        break;
                    case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        Hotel.availability(ch2);
                        break;
                    case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        Hotel.bookroom(ch2);
                        break;
                    case 4:
                        System.out.print("Room Number -");
                        ch2 = sc.nextInt();
                        if(ch2>60)
                            System.out.println("Room doesn't exist");
                        else if(ch2>40)
                        Hotel.order(ch2-41,4);
                        else if(ch2>30)
                        Hotel.order(ch2-31,3);
                        else if(ch2>10)
                        Hotel.order(ch2-11,2);
                        else if(ch2>0)
                        Hotel.order(ch2-1,1);
                        else
                            System.out.println("Room doesn't exist");
                        break;
                    case 5:
                        System.out.print("Room Number -");
                        ch2 = sc.nextInt();
                        if(ch2>60)
                            System.out.println("Room doesn't exist");
                        else if(ch2>40)
                        Hotel.deallocate(ch2-41,4);
                        else if(ch2>30)
                        Hotel.deallocate(ch2-31,3);
                        else if(ch2>10)
                        Hotel.deallocate(ch2-11,2);
                        else if(ch2>0)
                        Hotel.deallocate(ch2-1,1);
                        else
                            System.out.println("Room doesn't exist");
                        break;
                        case 6:
                            System.exit(0);
                            break;

                }

                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0);
                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
                {
                    System.out.println("Invalid Option");
                    System.out.println("\nContinue : (y/n)");
                    wish=sc.next().charAt(0);
                }

            }while(wish=='y'||wish=='Y');
    }
}
