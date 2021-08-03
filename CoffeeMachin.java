
    import java.util.Scanner;

    public class CoffeeMachin {
        static int water =400;
        static int milk = 540;
        static int caffe = 120;
        static int cups = 9;
        static int money = 550;

       /* public static void init(){
            int water = 400;
            int milk = 540;
            int caffe = 120;
            int cups = 9;
            int money = 550;
        }*/

        public static void makeCaffe (String doing) {
            switch (doing) {
                case "1": {
                    if (water >= 250 && caffe >= 16 && cups >= 1) {
                        water -= 250;

                        caffe -= 16;
                        cups -= 1;
                        money += 4;
                        System.out.println("I have enough resources, making you a coffee!");

                    } else {
                        System.out.print("Sorry, not enough water!");

                    }
                    break;
                }
                case "2": {
                    if (water >= 350 && milk >= 75 && caffe >= 20 && cups >= 1) {
                        water -= 350;
                        milk -= 75;
                        caffe -= 20;
                        cups -= 1;
                        money += 7;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough water!");
                    }
                    break;
                }
                case "3": {
                    if (water >= 200 && milk >= 100 && caffe >= 12 && cups >= 1) {
                        water -= 200;
                        milk -= 100;
                        caffe -= 12;
                        cups -= 1;
                        money += 6;
                        System.out.println("I have enough resources, making you a coffee!");
                    } else {
                        System.out.println("Sorry, not enough water!");
                    }
                }
            }
        }
        public static void take (){
            System.out.println("I gave you $" + money);
            money = 0;
        }
        public static int Min_3(int a, int b, int c) {
            int min;
            if (a >= b) {
                min = b;
            } else {
                min = a;
            }
            if (c < min) {
                min = c;
            }
            return min;
        }

        public static void Status(int water, int milk, int caffe, int cups, int money) {
            System.out.println("The coffee machine has:");
            System.out.println(water + " of water");
            System.out.println(milk + " of milk");
            System.out.println(caffe + " of coffee beans");
            System.out.println(cups + " of disposable cups");
            System.out.println(money + " of money");
            //System.out.println("The coffee machine has:");

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
          // Init();
            //Doing s = Doing.buy;
            String s;
            String m;
            //int b;
            //Status(water,milk,caffe,cups,money);
            do {
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                s = scanner.nextLine();

                switch (s) {
                    case "buy": {
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: : ");
                        m = scanner.nextLine();
                        if (m.equals("back")) {
                            break;
                        }
                        makeCaffe (m);

                        break;

                    }
                    case "fill": {
                        System.out.println("Write how many ml of water do you want to add:");
                        water += scanner.nextInt();
                        System.out.println("Write how many ml of milk do you want to add: ");
                        milk += scanner.nextInt();
                        System.out.println("Write how many grams of coffee beans do you want to add: ");
                        caffe += scanner.nextInt();
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        cups += scanner.nextInt();
                        break;
                    }
                    case "take": {
                        take();
                        break;
                    }
                    case "remaining": {
                        Status(water, milk, caffe, cups, money);
                        break;
                    }
                    case "exit": {
                        break;
                    }
                }

            } while (!s.equals("exit"));
        }
    }












