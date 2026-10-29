package com.conditionalstatements;

import java.util.Scanner;

public class Conditional8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double Total_price = 0;
		String product;

		do {
			System.out
					.println("Enter Category: Press no :1.Electronics/2.Clothing/3.Footwear/");
			String CTG = sc.nextLine();

			switch (CTG) {

			case "1" -> {

				System.out.println("1.Mobile");
				System.out.println("2.Laptops");
				System.out.println("3.Headphones");
				System.out.println("4.Mouse");
				System.out.println("5.Keyboard");
				System.out.println("6.Monitor");
				System.out.println("7.Charger");
				System.out.println("8.USB Cable");
				System.out.println("9.Smart Watch");
				System.out.println("10.Power Bank ");
				System.out.println("11.Tablet");
				System.out.println("12.WebCam");
				System.out.println("13.Television");

				String vyn;
				double Electronics_total_price = 0;

				do {
					System.out.println("Enter a Product:");
					String Product_item = sc.nextLine();

					switch (Product_item) {

					case "Headphones" -> {
						System.out.println("Headphones Price is: 500/- Rs");
						Electronics_total_price += 500;
					}

					case "Keyboard" -> {
						System.out.println("Keyboard Price is: 800/- Rs");

						Electronics_total_price += 800;
					}

					case "Mouse" -> {
						System.out.println("Mouse Price is: 400/- Rs");
						Electronics_total_price += 400;
					}

					case "Monitor" -> {
						System.out.println("Monitor Price is: 8000/- Rs");
						Electronics_total_price += 8000;
					}

					case "Laptop" -> {
						System.out.println("Laptop Price is: 50000/- Rs");
						Electronics_total_price += 50000;
					}

					case "Mobile" -> {
						System.out.println("Mobile Price is: 25000/- Rs");
						Electronics_total_price += 15000;
					}

					case "Charger" -> {
						System.out.println("Charger Price is: 1200/- Rs");
						Electronics_total_price += 600;
					}

					case "USB Cable" -> {
						System.out.println("USB Cable Price is: 250/- Rs");
						Electronics_total_price += 200;
					}

					case "Bluetooth speaker" -> {
						System.out.println("Bluetooth Speaker Price is: 1800/- Rs");
						Electronics_total_price += 1200;
					}

					case "Smart watch" -> {
						System.out.println("Smart Watch Price is: 4500/- Rs");
						Electronics_total_price += 2500;
					}

					case "Power bank" -> {
						System.out.println("Power Bank Price is: 2000/- Rs");
						Electronics_total_price += 2000;
					}

					case "Printer" -> {
						System.out.println("Printer Price is: 8000/- Rs");
						Electronics_total_price += 6000;
					}

					case "Tablet" -> {
						System.out.println("Tablet Price is: 18000/- Rs");
						Electronics_total_price += 18000;
					}

					case "WebCam" -> {
						System.out.println("Webcam Price is: 1500/- Rs");
						Electronics_total_price += 1500;
					}

					case "Television" -> {
						System.out.println("Television Price is: 25000/- Rs");
						Electronics_total_price += 25000;
					}

					default -> System.out.println("Electronics item not available");
					}

					System.out.println("Do you want to continue with Electronics items? Click Y for Yes, N for No");
					vyn = sc.nextLine();

				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Electronics Total Price is: " + Electronics_total_price);
				Total_price += Electronics_total_price;
			}

			case "2" -> {
				System.out.println("1.Shirts");
				System.out.println("2.T-Shirts");
				System.out.println("3.Jeans");
				System.out.println("4.Trousers");
				System.out.println("5.Shorts");
				System.out.println("6.Jackets");
				System.out.println("7.Hoodies");
				System.out.println("8.Sweatshirts");
				System.out.println("9.Kurtas");
				System.out.println("10.Dresses");
				System.out.println("11.Sarees");
				System.out.println("12.Skirts");
				System.out.println("13.Leggings");
				System.out.println("14.Sweaters");
				System.out.println("15.Blazers");

				String nvyn = "";
				double Clothing_total_price = 0;

				do {

					System.out.println("Enter the Product:");
					String Clouth_product = sc.next();

					switch (Clouth_product) {

					case "Shirts" -> {
						System.out.println("Shirts Price is: 600/- Rs");
						Clothing_total_price += 600;
					}

					case "T-shirts" -> {
						System.out.println("T-Shirts Price is: 400/- Rs");
						Clothing_total_price += 400;
					}

					case "Jeans" -> {
						System.out.println("Jeans Price is: 1200/- Rs");
						Clothing_total_price += 1200;
					}

					case "Trousers" -> {
						System.out.println("Trousers Price is: 900/- Rs");
						Clothing_total_price += 900;
					}

					case "Shorts" -> {
						System.out.println("Shorts Price is: 500/- Rs");
						Clothing_total_price += 500;
					}

					case "Jackets" -> {
						System.out.println("Jackets Price is: 1800/- Rs");
						Clothing_total_price += 1800;
					}

					case "Hoodies" -> {
						System.out.println("Hoodies Price is: 1000/- Rs");
						Clothing_total_price += 1000;
					}

					case "Sweatshirts" -> {
						System.out.println("Sweatshirts Price is: 850/- Rs");
						Clothing_total_price += 850;
					}

					case "Kurtas" -> {
						System.out.println("Kurtas Price is: 750/- Rs");
						Clothing_total_price += 750;
					}

					case "Dresses" -> {
						System.out.println("Dresses Price is: 1500/- Rs");
						Clothing_total_price += 1500;
					}

					case "Sarees" -> {
						System.out.println("Sarees Price is: 2000/- Rs");
						Clothing_total_price += 2000;
					}

					case "Skirts" -> {
						System.out.println("Skirts Price is: 700/- Rs");
						Clothing_total_price += 700;
					}

					case "Leggings" -> {
						System.out.println("Leggings Price is: 350/- Rs");
						Clothing_total_price += 350;
					}

					case "Sweaters" -> {
						System.out.println("Sweaters Price is: 1100/- Rs");
						Clothing_total_price += 1100;
					}

					case "Blazers" -> {
						System.out.println("Blazers Price is: 2500/- Rs");
						Clothing_total_price += 2500;
					}

					default -> System.out.println("Clothing item not available");
					}

					System.out.println("Do you want to continue with Clothing items? Click Y for Yes, N for No");
					nvyn = sc.next();

				} while (nvyn.equalsIgnoreCase("y"));

				System.out.println("Clothing Total Price is: " + Clothing_total_price);
				Total_price += Clothing_total_price;
			}
			
			
			case "3" -> {
			    System.out.println("1. Shoes");
			    System.out.println("2. Sneakers");
			    System.out.println("3. Sandals");
			    System.out.println("4. Slippers");
			    System.out.println("5. Flip Flops");
			    System.out.println("6. Boots");
			    System.out.println("7. Sports Shoes");
			    System.out.println("8. Formal Shoes");
			    System.out.println("9. Loafers");
			    System.out.println("10. Heels");
			    System.out.println("11. Flats");
			    System.out.println("12. Running Shoes");
			    System.out.println("13. Walking Shoes");
			    System.out.println("14. Crocs");
			    System.out.println("15. School Shoes");

			    String nvyn = "";
			    double Footwear_total_price = 0;

			    do {
			        System.out.println("Enter the product name:");
			        String Footwear_product = sc.next();

			        switch (Footwear_product) {
			            case "Shoes" -> {
			                System.out.println("Shoes price is: 950/- Rs");
			                Footwear_total_price += 950;
			            }
			            case "Sneakers" -> {
			                System.out.println("Sneakers price is: 1500/- Rs");
			                Footwear_total_price += 1500;
			            }
			            case "Sandals" -> {
			                System.out.println("Sandals price is: 600/- Rs");
			                Footwear_total_price += 600;
			            }
			            case "Slippers" -> {
			                System.out.println("Slippers price is: 250/- Rs");
			                Footwear_total_price += 250;
			            }
			            case "Flip flops" -> {
			                System.out.println("Flip Flops price is: 200/- Rs");
			                Footwear_total_price += 200;
			            }
			            case "Boots" -> {
			                System.out.println("Boots price is: 2200/- Rs");
			                Footwear_total_price += 2200;
			            }
			            case "Sports shoes" -> {
			                System.out.println("Sports Shoes price is: 1800/- Rs");
			                Footwear_total_price += 1800;
			            }
			            case "Formal shoes" -> {
			                System.out.println("Formal Shoes price is: 1200/- Rs");
			                Footwear_total_price += 1200;
			            }
			            case "Loafers" -> {
			                System.out.println("Loafers price is: 1300/- Rs");
			                Footwear_total_price += 1300;
			            }
			            case "Heels" -> {
			                System.out.println("Heels price is: 1100/- Rs");
			                Footwear_total_price += 1100;
			            }
			            case "Flats" -> {
			                System.out.println("Flats price is: 700/- Rs");
			                Footwear_total_price += 700;
			            }
			            case "running shoes" -> {
			                System.out.println("Running Shoes price is: 1600/- Rs");
			                Footwear_total_price += 1600;
			            }
			            case "Walking shoes" -> {
			                System.out.println("Walking Shoes price is: 1000/- Rs");
			                Footwear_total_price += 1000;
			            }
			            case "Crocs" -> {
			                System.out.println("Crocs price is: 900/- Rs");
			                Footwear_total_price += 900;
			            }
			            case "School shoes" -> {
			                System.out.println("School Shoes price is: 800/- Rs");
			                Footwear_total_price += 800;
			            }
			            default -> System.out.println("Product not available!");
			        }

			        System.out.println("Do you want to add more footwear? (yes/no)");
			        nvyn = sc.next();

			    } while (nvyn.equals("y"));

			    System.out.println("Footwear total price is: " 
			            + Footwear_total_price + "/- Rs");
			}
			default -> System.out.println("Invalid category. Please enter 1 or 2.");
			}

			System.out.println("\nDo you want to continue shopping? Y/N");
			product= sc.nextLine();

		} while (product.equalsIgnoreCase("y"));

		System.out.println("\n========== FINAL BILL ==========");
		System.out.println("Final Total Price: " + Total_price + " Rs");
		System.out.println("Thank you for shopping!");

		sc.close();
	}
}
